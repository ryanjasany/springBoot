package com.ryanjasany.Controller;

import java.util.Map;

import com.ryanjasany.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {


    @Autowired
    private StudentService studentService;

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/cat")
    public String cat(Map<String, Object> model) {


        String name = studentService.getStudentById(1).getName();

        model.put("message", name);
        model.put("student", studentService.getStudentById(1));
        return "cat";
    }

    @RequestMapping(value = "/cat/{id}", method = RequestMethod.GET)
    public String number(Map<String, Object> model,  @PathVariable("id") int id){


        model.put("student", studentService.getStudentById(id));
        return "cat";
    }
}