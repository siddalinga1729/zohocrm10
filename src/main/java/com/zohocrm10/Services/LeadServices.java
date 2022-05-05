package com.zohocrm10.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zohocrm10.entities.Lead;

@Service
public interface LeadServices {
public void saveLead(Lead lead);//abstraction is done here

public List<Lead> getAllLead();

public Lead getById(int id);
}
