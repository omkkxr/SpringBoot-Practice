package com.ok.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ok.entity.CoronaVaccine;
import com.ok.repo.CoronaVaccineRepo;

@Service
public class ICoronaVaccineServiceImpl implements ICoronaVaccineService {

	@Autowired
	private CoronaVaccineRepo repo;

	@Override
	public Optional<CoronaVaccine> fetchDetailById(long ID) {
		Optional<CoronaVaccine> opt=repo.findById(ID);
				return opt;
	}
	@Override
	public Iterable<CoronaVaccine> fetchAllDetails() {
		return repo.findAll();
	}
	@Override
	public Iterable<CoronaVaccine> fetchAllByIds(Iterable<Long> ids) {
		return repo.findAllById(ids);
	}
	@Override
	public boolean CheckRecordAvailability(Long id) {
		return repo.existsById(id);
	}
	@Override
	public Long GetTotalRowCount() {
		return repo.count();
	}
}
