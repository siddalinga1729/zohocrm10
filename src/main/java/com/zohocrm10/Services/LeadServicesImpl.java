package com.zohocrm10.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm10.Repositories.LeadRepository;
import com.zohocrm10.entities.Lead;
@Service
public class LeadServicesImpl implements LeadServices {
@Autowired
private LeadRepository leadRepo;
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	}
	@Override
	public List<Lead> getAllLead() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}
	@Override
	public Lead getById(int id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

}
