package com.ok.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ok.bo.EmployeeBO;
import com.ok.dao.IEmployeeDAO;
import com.ok.dto.EmployeeDTO;

@Service("empService")
public class EmployeeServiceMngtmpl  implements IEmployeeMgmtService{

	@Autowired
	private IEmployeeDAO  dao;
	
	@Override
	public List<EmployeeDTO> service(String[] desig) throws Exception {
		List<EmployeeDTO> ListDTO=new ArrayList<EmployeeDTO>();
		StringBuffer buffer=new StringBuffer("(");
		for(int i=0;i<desig.length;++i) {
			if(i==desig.length-1) {
				buffer.append("'"+desig[i]+"')");
			}else {
				buffer.append("'"+desig[i]+"',");
			}
		}
		String cond=buffer.toString();
		List<EmployeeBO> listBO=dao.getEmpsByDesig(cond);
		listBO.forEach(bo->{
		EmployeeDTO dto=new EmployeeDTO();
		BeanUtils.copyProperties(bo, dto);
		dto.setSrNo(ListDTO.size()+1);
		ListDTO.add(dto);
		});
		return ListDTO;
	}
	
}
