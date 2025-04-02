document.addEventListener("DOMContentLoaded", () => {
    loadDepartments();
});

function loadDepartments() {
    fetch("/api/departments")
        .then(res => res.json())
        .then(data => {
            const table = document.querySelector("#departmentTable tbody");
            table.innerHTML = "";

            data.forEach(dept => {
                const row = document.createElement("tr");
                row.innerHTML = `
          <td>${dept.dept_id}</td>
          <td>${dept.dept_name}</td>
          <td>${dept.email}</td>
        `;
                table.appendChild(row);
            });
        });
}