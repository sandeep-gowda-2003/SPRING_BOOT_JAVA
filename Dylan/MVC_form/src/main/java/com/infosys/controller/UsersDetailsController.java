package com.infosys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infosys.entity.Usersdetails;
import com.infosys.repository.UsersDetailsRepository;

@Controller
public class UsersDetailsController {

	@Autowired
	UsersDetailsRepository service;

	@RequestMapping("/listusers")
	public String listUsers(Model model) {
		List<Usersdetails> list = service.findAll();
		model.addAttribute("deets", list);
		return "successlist";
	}

	@RequestMapping("/test")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/user")
	public String add() {
		return "addnew";
	}
	
	@RequestMapping("/save")
	public String SAVEuser(@ModelAttribute Usersdetails u,Model model) {
		System.out.println("LOGGING");
		service.save(u);
		model.addAttribute("uname", u);
		return "successSave";
	}
	
	@RequestMapping("/id")
	public String Id() {
		return "id";
	}
	
	@RequestMapping("/getById")
	public String IdDisp(@ModelAttribute Usersdetails u,Model model) {
		Usersdetails usersdetails = service.getById(u.getUserid());
		model.addAttribute("userId",usersdetails.getUserid());
		model.addAttribute("uname",usersdetails.getUname());
		model.addAttribute("pass",usersdetails.getPasswd());
		return "IdRes";
	}
	
//	@RequestMapping(path = "/changePasswd",method = RequestMethod.POST)
	@RequestMapping("/changePasswd")
	public String changePasswd() {
		return "changePasswd";
	}
	
//	@RequestMapping("/updatepwd")
//	public String update(@ModelAttribute Usersdetails u,Model model) {
//		System.out.println(u.toString());
//		service.updatePasswd(u.getPasswd(), u.getUserid());
//		Usersdetails usersdetails = service.getById(u.getUserid());
//		model.addAttribute("user",usersdetails);
//		return "DisplayUpdate";
//		
//	}
	
	@RequestMapping("/delete")
	public String delete() {
		return "deleteUser";
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser(@ModelAttribute Usersdetails u,Model model) {
		System.out.println(u.toString());
//		service.deleteById(u.getUserid());
		return "deleteRes";
	}
	
	
	
	
}
