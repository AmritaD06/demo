package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Policy;
import com.example.demo.service.PolicyService;

@RestController
@RequestMapping("/policy")
public class PolicyController {


	
	@Autowired
	private PolicyService policyService;
	
	
	@GetMapping("/pol")
	public List<Policy>getAll(){
		
		return policyService.getAllPolicy();
	}
	

	
	//getPolById
	@GetMapping("/pol/{sid}")
	public Optional<Policy> getPolicyByid(@PathVariable("sid")int sid)
	{
		return policyService.getPolicyById(sid);
	}
	
	//saveService
	@PostMapping("/pol")
	public Integer savePolicy(@RequestBody Policy service)
	{
		policyService.saveOrUpadte(service);
	return service.getPolicyId();
	}
	
	
	@PutMapping("/pol/{pid}")
	public Object updatePolicy(@RequestBody Policy pol, @PathVariable int pid) {
		System.out.println("added policy");
			return policyService.updatePolicy(pol, pid);

	}
	
	
	@DeleteMapping("/pol/{pid}")
	public void deletePolicy(@PathVariable("pid") int polid) 
	{
		policyService.deletePolicyById(polid);
	}

}
