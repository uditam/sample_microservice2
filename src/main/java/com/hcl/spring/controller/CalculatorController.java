package com.hcl.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
	
	@RequestMapping(value = "/add/{num1}/{num2}", method = RequestMethod.GET, produces = "text/plain")
    public String add(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        return String.format("%d + %d = %d", num1, num2, (num1 + num2));
    }

	@RequestMapping(method = RequestMethod.GET, value = "/sub/{num1}/{num2}", produces = "text/plain")

    public String sub(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        return String.format("%d - %d = %d", num1, num2, (num1 - num2));
    }

	 @RequestMapping(method = RequestMethod.GET, value = "/mul/{num1}/{num2}", produces = "text/plain")
    public String mul(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        return String.format("%d x %d = %d", num1, num2, (num1 * num2));
    }

	 @RequestMapping(method = RequestMethod.GET, value = "/div/{num1}/{num2}", produces = "text/plain")
    public String div(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
	   String response = null;
		 try {
			 response = String.format("%d / %d = %d", num1, num2, (num1 / num2));
		 }catch (ArithmeticException e) {
			 response = String.format("we shouldn't divide a number by zero");
		}
		 return response;
    }
}
