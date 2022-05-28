package com.app.login.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("emp/rest")
public class EmployeeRestController {

	@RequestMapping(value = "/addemployee", method = RequestMethod.POST)
	public String getEmployeeData(@RequestParam String empname, @RequestParam String qualification,
			@RequestParam String presentaddress, @RequestParam String permenentaddress, ModelMap model) {
		return "Welcome";

	}	
}
