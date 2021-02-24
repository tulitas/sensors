package app.controllers;

import app.proces.MakeConnection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(name = "/")
public class OptionsController {
    private MakeConnection makeConnection;

    @GetMapping(value = "/take")
    private String getAllMetrics(Model model) {
        System.out.println("bum");
        System.out.println("bum");
        return "/";

    }

}
