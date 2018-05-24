package com.torres.mybatis.dao;

import com.torres.mybatis.vo.Dept;
import com.torres.mybatis.vo.Emp;

import java.util.List;

public interface EmpDao {

	public List<Emp> findEmpManytoOne();
	
	public List<Emp> findEmpManytoOne2();
	
	public Dept findDeptOnetoMany(int deptno);
	
	public Dept findDeptOnetoMany2(int deptno);
}
