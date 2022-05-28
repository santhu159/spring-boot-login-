package com.app.login.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.login.daoimpl.EmployeeDaoImpl;
import com.app.login.daoimpl.LoginDaoImpl;
import com.app.login.entity.Employee;
import com.app.login.entity.EmployeeDetails;
import com.app.login.entity.LoginEntity;

//@Controller
@RestController
public class LoginController {
//	Log log = LogFactory.getLog(LoginController.class);
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	LoginDaoImpl loginDao;
	
	@Autowired
	EmployeeDaoImpl empDao;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcome(@RequestParam String username, @RequestParam String password, ModelMap model) {
		LoginEntity loginData = loginDao.getLoginData();

		String uname = loginData.getUname();
		log.info("MAK:>uname:" + uname);
		
		String pwrd = loginData.getPassword();
		log.info("MAK:>password:" + password);

		if ((uname.equals(username) && pwrd.equals(password))) {
			model.addAttribute("welcome", "Success");

		} else {
			return "error";
		}
		return "Welcome";

	}
	
	@RequestMapping(value = "/addemployee", method = RequestMethod.POST)
	public String saveEmployee(@RequestParam String empname, @RequestParam String qualification,
			@RequestParam String presentaddress, @RequestParam String permenentaddress, ModelMap model) {
		Employee e = new Employee();
		e.setName(empname);
		EmployeeDetails details = new EmployeeDetails();
		details.setPermenetAdress(permenentaddress);
		details.setPresentAddress(presentaddress);
		details.setQualification(qualification);
		e.setEmpDetails(details);
		empDao.SaveEmployeeData(e);
		log.info("MAK:>saveEmployee:" + empname);
		log.info("MAK:>saveEmployee:" + qualification);
		log.info("MAK:>saveEmployee:" + presentaddress);
		log.info("MAK:>saveEmployee:" + permenentaddress);
		return "Welcome";
	}
	
	@PostMapping("/save")
	public void saveEmp(@RequestBody Employee p)  {
		empDao.SaveEmployeeData(p);
	}
	
	@GetMapping("/all")
	public List<Employee> find()  {
		return empDao.findAll();
	}
}
