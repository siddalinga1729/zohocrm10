package com.zohocrm10.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm10.Services.LeadServices;
import com.zohocrm10.entities.Lead;

@Controller
public class LeadController {
	
@Autowired
private LeadServices leadServices;
	
	@RequestMapping("/viewLeadPage")
	public String viewLeadPage() {
		return "create_Lead";
	}
	@RequestMapping("saveLead")
	public String saveLead(@ModelAttribute()Lead lead,ModelMap model) {
		leadServices.saveLead(lead);
		return "view_Lead";
	}
	@RequestMapping("listAllLeads")
	public String getAllLead(ModelMap model) {
		List<Lead> leads = leadServices.getAllLead();
		model.addAttribute("leads", leads);
		return "ListAll_Lead";
	}
	@RequestMapping("getById")
	public String getById(@RequestParam("id")int id,ModelMap model) {
		Lead lead=leadServices.getById(id);
		model.addAttribute("lead", lead);
		return "view_Lead";
	}
}
