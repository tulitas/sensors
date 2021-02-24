package app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class SiteController {
    @RequestMapping("/")
    public String index() {
//        return new ModelAndView("index");
        return "hello";
    }


    @RequestMapping("/test")
    public ModelAndView test() {
        return new ModelAndView("test");
    }
}