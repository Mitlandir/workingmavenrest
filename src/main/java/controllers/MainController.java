package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value = {"/home", "/"})
    public String getHome() {
        return "homepage";
    }

    @RequestMapping(value = "/test")
    public String getTest() {
        return "testpage";
    }
    
    @RequestMapping(value="/another")
    public String getAnotherPage(){
        return "anotherpage";
    }

}
