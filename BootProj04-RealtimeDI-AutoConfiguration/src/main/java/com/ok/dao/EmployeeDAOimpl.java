package com.ok.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ok.bo.EmployeeBO;


@Repository("empDAO")
public class EmployeeDAOimpl implements IEmployeeDAO {
	private static final String Query= "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO,MGR FROM EMP  WHERE JOB IN";
	@Autowired
	DataSource ds;

	@Override
	public List<EmployeeBO> getEmpsByDesig(String cond) throws Exception {
		
		List<EmployeeBO> listBO = new ArrayList<EmployeeBO>();
		EmployeeBO bo = null;
		try (
				Connection con = ds.getConnection(); 
				Statement stm = con.createStatement();
				) {

			ResultSet rs = stm.executeQuery(Query+cond+" ORDER BY JOB");
			while (rs.next()) {
				bo = new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSal(rs.getDouble(4));
				bo.setDeptNo(rs.getInt(5));
				bo.setMgrNo(rs.getInt(6));

				listBO.add(bo);
			}
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return listBO;
	}

}
