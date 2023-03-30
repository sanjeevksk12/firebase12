package com.gw.hrconnect.service.api;

import org.springframework.stereotype.Service;


import com.gw.hrconnect.domain.entity.SkillMaster;




public interface SkillService {

	SkillMaster findByCountryId(Integer Id) throws CountryNotFoundException;
	   void findByCountryId(); 	
}
