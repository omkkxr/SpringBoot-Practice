package com.ok.service;

import java.util.List;

import com.ok.dto.EmployeeDTO;

public interface IEmployeeMgmtService {
	public List<EmployeeDTO> service(String[] desig) throws Exception;
}
