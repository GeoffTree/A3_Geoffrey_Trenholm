//Geoffrey Trenholm 991712128

package ca.sheridancollege.trenholg.a3_geoffrey_trenholm.controllers;

import ca.sheridancollege.trenholg.a3_geoffrey_trenholm.beans.Department;
import ca.sheridancollege.trenholg.a3_geoffrey_trenholm.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    //Get Mappings
    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Department> getDepartment(@PathVariable Long id) {
        return departmentRepository.findById(id);
    }

    @GetMapping("/email/{email}")
    public Optional<Department> getDepartmentByEmail(@PathVariable String email) {
        return departmentRepository.findByEmail(email);
    }
    //Post Mapping
    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

    //Put Mapping
    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable Long id, @RequestBody Department updatedDepartment) {
        updatedDepartment.setDept_id(id);
        return departmentRepository.save(updatedDepartment);
    }

    //Delete Mapping
    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        departmentRepository.deleteById(id);
    }

}
