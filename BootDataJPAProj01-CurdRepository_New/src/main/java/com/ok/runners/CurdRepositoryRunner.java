package com.ok.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import com.ok.repo.CoronaVaccineRepo;
import com.ok.service.ICoronaVaccineService;

@Component
public class CurdRepositoryRunner implements CommandLineRunner {


	@Autowired
	ICoronaVaccineService service;

  

	@Override
	public void run(String... args) throws Exception {
 		/*   --------------------------------findById(ID id)-------------------------------------
		  try {
			Long id = 1L;
			Optional<CoronaVaccine> opt = service.fetchDetailsById(id);
			if (opt.isPresent()) {
				System.out.println(opt.get());
			} else {
				System.out.println("No record found with ID : " + id);
			}
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}*/
		
		
		 /*  --------------------------------findAll()-------------------------------------
		try {
			service.fetchAllDetails().forEach(System.out::println);
		}catch (DataAccessException dae) {
			dae.printStackTrace();
		}*/
		
		
		/*    --------------------------------findAllById(Iterable<ID> id)-------------------------------------
		try {
			service.fetchAllByIds(List.of(1L,2L,3L,5L,6L)).forEach(System.out::println);
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
		/*    --------------------------------exitsById(ID id)-------------------------------------
		try {
			if(service.CheckRecordAvailability(2L)) {
				System.out.println("Record found with ID : "+2);
			}else {
				System.out.println("Record not found with ID : "+2);
			}
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
		/*    --------------------------------count()-------------------------------------
		try {
			System.out.println(service.GetTotalRowCount());
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
	}
}
