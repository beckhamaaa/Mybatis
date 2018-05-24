package com.dongdu.test;

import com.dongdu.dao.EmpDao;
import com.dongdu.dao.impl.EmpDaoImpl;
import com.dongdu.vo.Dept;
import com.dongdu.vo.Emp;
import org.junit.Test;

import java.util.List;

public class EmpTest {

	/**
	 * 多对一
	 */
	@Test
	public void  findEmpManytoOneTest(){
		
		EmpDao empdao=new EmpDaoImpl();
		
		List<Emp> list=empdao.findEmpManytoOne();
		
		for(Emp e:list){
			
			System.out.println(e.getEid()+"=="+e.getEname()+"=="+e.getJob()+"=="+e.getDept().getDid()+"=="+e.getDept().getDname());
		}
		
	}

	/**
	 * 多对一
	 */
	@Test
	public void  findEmpManytoOneTest2(){
		
		EmpDao empdao=new EmpDaoImpl();
		

		List<Emp> list=empdao.findEmpManytoOne2();
		
		System.out.println(list.size());
		
		System.out.println(list.get(0).getDept());
		
		for(Emp e:list){
			
			System.out.println(e.getEid()+"=="+e.getEname()+"=="+e.getJob()+"=="+e.getDept().getDid()+"=="+e.getDept().getDname());
		}
		
	}

	/**
	 * 一对多
	 */
	@Test
	public void findDeptOnetoManyTest(){
		
		EmpDao empdao=new EmpDaoImpl();
		
		Dept d=empdao.findDeptOnetoMany(3);
		
		System.out.println(d.getDid()+"=="+d.getDname());
		
		List<Emp> list=d.getEmpList();
		
		for(Emp e:list){
			System.out.println(e.getEid()+"--"+e.getEname()+"--"+e.getJob());
		}
		
	}

	/**
	 * 一对多
	 */
	@Test
	public void findDeptOnetoManyTest2(){
		
		EmpDao empdao=new EmpDaoImpl();
		
		Dept d=empdao.findDeptOnetoMany2(3);
		
		System.out.println(d.getDid()+"=="+d.getDname());
		
		List<Emp> list=d.getEmpList();
		
		for(Emp e:list){
			
			System.out.println(e.getEid()+"--"+e.getEname()+"--"+e.getJob());
		}
	}
}
