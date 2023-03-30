package com.gw.hrconnect.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;


import com.gw.hrconnect.domain.entity.SkillMaster;
import com.gw.hrconnect.domain.repository.SkillMasterRepo;
import com.gw.hrconnect.service.api.CountryNotFoundException;
import com.gw.hrconnect.service.api.SkillService;



@Service
@Configuration
@EnableJpaRepositories("com.gw.hrconnect.domain.repository,com.gw.hrconnect.domain.entity")
public class SkillServiceImpl implements SkillService {
	
	
	@Autowired(required = true)
    private SkillMasterRepo countryMasterRepo;
	
	   @Override
	    public SkillMaster findByCountryId(Integer countryId) {
		   
		   System.out.println("--------------- CountryServiceImpl ----"+ countryId);
		   return null;
	   }
	   
	   @Override
	    public void findByCountryId() {
		   System.out.println("--------------- CountryServiceImpl ----");
		   if ( null != countryMasterRepo.findAll()) {
			   System.out.println("Not null");
		   }else {
			   System.out.println("-----------Null----------");
		   }
		   
	   }
	   
	
//    @Override
//    public CountryMaster findByCountryId(Integer countryId) throws CountryNotFoundException {
//        if(countryId.equals("0000")) {
//            throw new CountryNotFoundException("0000");
//        }
//        
//        CountryMaster countryMaster = countryMasterRepo.findByCountryId(countryId);
// 
//        return countryMaster;
//    }
}
