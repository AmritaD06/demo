package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Policy;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repo.PolicyRepository;

@Service
public class PolicyService {

	
	
	@Autowired
	private PolicyRepository policyRepo;
	
	
	public List<Policy>getAllPolicy()
	{
		return policyRepo.findAll();
	}
	
	
	
	public Optional<Policy> getPolicyById(int sid)
	{
		return policyRepo.findById(sid);
	}
	
	
	public Policy saveOrUpadte(Policy service)
	{
		return policyRepo.save(service);
	}
	

	public Policy updatePolicy(Policy pol, int policyid) {

		Optional<Policy> policy = policyRepo.findById(policyid);
		if (policy.isPresent()) {
			System.out.println(policy);
		Policy setpolicy = policy.get();
		setpolicy.setCoverType((pol.getCoverType()));
		setpolicy.setAge(pol.getAge());
		setpolicy.setPolicyName(pol.getPolicyName());
		setpolicy.setPolicyNo(pol.getPolicyNo());
		setpolicy.setPolicyTenure(pol.getPolicyTenure());
		setpolicy.setPremium(pol.getPremium());
			return policyRepo.save(setpolicy);
		
		} else {
			throw new ResourceNotFoundException("policy id " + policyid + " not found");
		}

	}
	
	
	
	public void deletePolicyById(int policyid) {
		Optional<Policy> policy = policyRepo.findById(policyid);
		if (policy.isPresent()) {
			Policy setpolicy = policy.get();
			policyRepo.delete(setpolicy);
		} else {
			throw new ResourceNotFoundException("company id " + policyid + " not found");
		}

	}

}


