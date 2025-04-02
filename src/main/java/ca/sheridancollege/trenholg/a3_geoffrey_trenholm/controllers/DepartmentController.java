//Geoffrey Trenholm 991712128

package ca.sheridancollege.trenholg.a3_geoffrey_trenholm.controllers;

import ca.sheridancollege.trenholg.a3_geoffrey_trenholm.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

}
