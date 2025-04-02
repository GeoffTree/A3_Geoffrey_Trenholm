package ca.sheridancollege.trenholg.a3_geoffrey_trenholm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/employeeForm"} )
    public String employeeForm() {
        return "employeeForm";
    }

    @GetMapping("/departmentForm")
    public String departmentForm() {
        return "departmentForm";
    }

    @GetMapping("/registerEmployee")
    public String registerForm() {
        return "registerEmployee";
    }
}
