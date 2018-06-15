package com.myapp.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	
	@RequestMapping("/uploadImages")
    public String index() {
		return "uploadfile.html";
    }
    
	
	
	
}


