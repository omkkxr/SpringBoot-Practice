package com.ok.service;

import java.util.Optional;


import com.ok.entity.CoronaVaccine;


public interface ICoronaVaccineService {
	public Optional<CoronaVaccine> fetchDetailById(long ID); 
	public Iterable<CoronaVaccine> fetchAllDetails();
	public Iterable<CoronaVaccine> fetchAllByIds(Iterable<Long> ids);
	public boolean CheckRecordAvailability(Long id);
	public Long GetTotalRowCount();
}
