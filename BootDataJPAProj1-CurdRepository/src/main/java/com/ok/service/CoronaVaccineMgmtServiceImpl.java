package com.ok.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ok.entity.CoronaVaccine;
import com.ok.repo.ICoronaVaccineRepo;

@Service
public class CoronaVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {
	
	@Autowired
	private ICoronaVaccineRepo repo;
	
	@Override
	public String registerVaccine(CoronaVaccine vaccine) {
		System.out.println("In Memory proxy class :"+repo.getClass());
		CoronaVaccine coronaVacc=null;
		if(vaccine!= null)
		coronaVacc=repo.save(vaccine);
		return coronaVacc!=null?"Vaccine registered successfully with "+coronaVacc.getRegNo():"Vaccine registration failed";
	}

}
