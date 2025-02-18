package com.ok.dao;

import java.util.List;

import com.ok.bo.EmployeeBO;

public interface IEmployeeDAO {
	public List<EmployeeBO> getEmpsByDesig(String cond) throws Exception; 
}
