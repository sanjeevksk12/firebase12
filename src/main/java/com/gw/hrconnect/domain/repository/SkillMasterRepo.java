package com.gw.hrconnect.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.gw.hrconnect.domain.entity.SkillMaster;

//import com.gw.hrconnect.domain.entity.CountryMaster;

import antlr.collections.List;

public interface SkillMasterRepo extends JpaRepository<SkillMaster, Integer> {

	//public CountryMaster findByCountryId(Integer countryId);
	
}
