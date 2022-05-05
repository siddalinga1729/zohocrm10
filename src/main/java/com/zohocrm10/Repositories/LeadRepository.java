package com.zohocrm10.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm10.entities.Lead;
@Repository
public interface LeadRepository extends JpaRepository<Lead, Integer> {

}
