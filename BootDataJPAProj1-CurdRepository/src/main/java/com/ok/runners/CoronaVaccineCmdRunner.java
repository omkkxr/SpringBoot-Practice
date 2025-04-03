package com.ok.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.ok.entity.CoronaVaccine;

import com.ok.service.ICoronaVaccineMgmtService;

@Component
public class CoronaVaccineCmdRunner implements CommandLineRunner {

	@Autowired
	 ICoronaVaccineMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		try {
		System.out.println("CoronaVaccineCmdRunner.run() ::: Runner of corona vaccine ");
		CoronaVaccine cv1=new CoronaVaccine("Covaxin","VriEnt","india",780.0,3);
		System.out.println(service.registerVaccine(cv1));
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}
	}

}
