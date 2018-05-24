package com.dongdu.dao.impl;

import com.dongdu.dao.EmpDao;
import com.dongdu.vo.Dept;
import com.dongdu.vo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class EmpDaoImpl implements EmpDao {

static SqlSessionFactory factory=null;
	
	
	static{
		
		try {
			Reader config=Resources.getResourceAsReader("mybatis-config.xml");
			
			factory=new SqlSessionFactoryBuilder().build(config);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public List<Emp> findEmpManytoOne() {
		// TODO Auto-generated method stub
		
		SqlSession session=factory.openSession();
		
		List<Emp> list=session.selectList("findEmpManytoOne");
		
		session.commit();
		
		session.close();
		
		return list;
	}


	public List<Emp> findEmpManytoOne2() {
		
        SqlSession session=factory.openSession();
		
		List<Emp> list=session.selectList("findEmpManytoOne2");
		
		session.commit();
		
		session.close();
		
		return list;
	}


	public Dept findDeptOnetoMany(int deptno) {
		// TODO Auto-generated method stub
		
		SqlSession session=factory.openSession();
		
		Dept d=session.selectOne("findDeptOnetoMany", deptno);
		
        session.commit();
		
		session.close();
		
		return d;
	}


	public Dept findDeptOnetoMany2(int deptno) {
		
       SqlSession session=factory.openSession();
		
		Dept d=session.selectOne("findDeptOnetoMany2", deptno);
		
        session.commit();
		
		session.close();
		
		return d;
	}
}
