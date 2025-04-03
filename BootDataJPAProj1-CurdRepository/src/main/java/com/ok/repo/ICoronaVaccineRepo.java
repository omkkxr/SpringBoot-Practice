package com.ok.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.ok.entity.CoronaVaccine;


public interface ICoronaVaccineRepo extends CrudRepository<CoronaVaccine,Long>  {

}
