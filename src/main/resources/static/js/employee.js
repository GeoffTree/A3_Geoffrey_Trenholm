document.addEventListener("DOMContentLoaded", () => {
    loadEmployees();
});

function loadEmployees() {
    fetch("/api/employees")
        .then(res => res.json())
        .then(data => {
            const table = document.querySelector("#employeeTable tbody");
            table.innerHTML = ""; // clear current table

            data.forEach(emp => {
                const row = document.createElement("tr");
                row.innerHTML = `
          <td>${emp.emp_id}</td>
          <td>${emp.first_name} ${emp.last_name}</td>
          <td>${emp.gender}</td>
          <td>${emp.email}</td>
          <td>${emp.hire_date}</td>
        `;
                table.appendChild(row);
            });
        });
}