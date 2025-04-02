document.addEventListener("DOMContentLoaded", () => {
    loadDepartments();
    loadAssignments();
});

function loadDepartments() {
    fetch("/api/departments")
        .then(res => res.json())
        .then(data => {
            const select = document.getElementById("departmentSelect");
            select.innerHTML = "";
            data.forEach(dept => {
                const option = document.createElement("option");
                option.value = dept.dept_id;
                option.textContent = dept.dept_name;
                select.appendChild(option);
            });
        });
}

function loadEmployee() {
    const email = document.getElementById("email").value;
    fetch(`/api/employees/email/${email}`)
        .then(res => {
            if (!res.ok) throw new Error("Employee not found");
            return res.json();
        })
        .then(emp => {
            document.getElementById("name").value = `${emp.first_name} ${emp.last_name}`;
            document.getElementById("email").dataset.empId = emp.emp_id;
        })
        .catch(err => {
            alert("Employee not found");
            document.getElementById("name").value = "";
            document.getElementById("email").dataset.empId = "";
        });
}

function assignEmployee() {
    const empId = document.getElementById("email").dataset.empId;
    const selectedOptions = document.getElementById("departmentSelect").selectedOptions;
    const deptIds = Array.from(selectedOptions).map(opt => ({ dept_id: opt.value }));

    if (!empId || deptIds.length === 0) {
        alert("Select an employee and at least one department.");
        return;
    }

    fetch(`/api/employees/${empId}`, {
        method: "PUT",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ departments: deptIds })
    })
        .then(res => res.json())
        .then(() => {
            alert("Employee updated");
            loadAssignments();
        })
        .catch(err => console.error(err));
}

function loadAssignments() {
    fetch("/api/employees")
        .then(res => res.json())
        .then(data => {
            const tableBody = document.querySelector("#assignmentTable tbody");
            tableBody.innerHTML = "";
            data.forEach(emp => {
                const row = document.createElement("tr");
                const deptNames = emp.departments.map(d => d.dept_name).join(", ");
                row.innerHTML = `
                    <td>${emp.first_name} ${emp.last_name}</td>
                    <td>${emp.email}</td>
                    <td>${deptNames}</td>
                `;
                tableBody.appendChild(row);
            });
        });
}
