package com.sandeep.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.sandeep.model.Depart_HOD;
import com.sandeep.model.Department;
import com.sandeep.model.DepartmentMapper;
import com.sandeep.model.DeptHod_mapper;
import com.sandeep.model.Hod;
import com.sandeep.model.Hod_mapper;

@Component
public class Dept_DAOImpl implements Dept_DAO{

	@Autowired
	private JdbcTemplate jdbctemp;
	
	
	private final String SQL_INSERT_DEPARTMENT="insert into department(dept_id,dept_name,dept_intake,dept_duration) values(?,?,?,?)";
	private final String SQL_SEARCH_DEPARTMENT="select * from department d,hod h where d.dept_id=? and h.hod_id in (select hod_id from dept_hod as a where a.dept_id=?)";
	private final String SQL_UPDATE_Department="with update1 as(update department set dept_name=? where dept_id=? returning dept_id) update hod set hod_name=? "
			+ "where hod_id in (select hod_id from dept_hod where dept_id in (select dept_id from update1))";
	private final String SQL_DELETE_DEPARTMENT="with delete1 as(delete from department where dept_id =? returning dept_id)"
			+ "delete from hod where hod_id in (select hod_id from dept_hod where dept_id in (select dept_id from delete1))";
	
	@Override
	public boolean addDepartment(Depart_HOD d) {
		return jdbctemp.update(SQL_INSERT_DEPARTMENT,d.getDept_id(),d.getDept_name(),d.getDept_intake(),d.getDept_duration())>0;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Depart_HOD searchDept(Depart_HOD d) {
		return (Depart_HOD) jdbctemp.queryForObject(SQL_SEARCH_DEPARTMENT,new Object[] {d.getDept_id(),d.getDept_id()} ,new DeptHod_mapper());
	}
	
	public List<Department> list_dept() {
		
		List<Department> li=jdbctemp.query("select * from department;", new DepartmentMapper());
		return li;
	}

	@Override
	public boolean updateNames(String D_name,Integer D_id,String H_name) {
		return jdbctemp.update(SQL_UPDATE_Department,D_name,D_id,H_name)>0;
	}

	@Override
	public boolean deleteDepartment(int dept_id) {
		return jdbctemp.update(SQL_DELETE_DEPARTMENT,dept_id)>0;
	}
	

}
