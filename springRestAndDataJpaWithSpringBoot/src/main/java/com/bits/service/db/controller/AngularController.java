package com.bits.service.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AngularController {
	
	@RequestMapping("/")
    public String welcome() {
        return "index.html";
    }

}
