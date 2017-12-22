package com.manager.credentials.controllers.management;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CreationController {

    @RequestMapping(value="/",method= RequestMethod.POST)
    public String create(){
        return "";
    }

}
