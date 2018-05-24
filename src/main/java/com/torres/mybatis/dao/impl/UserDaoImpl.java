package com.torres.mybatis.dao.impl;

import com.torres.mybatis.dao.UserDao;
import com.torres.mybatis.vo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {
	
	
	static SqlSessionFactory factory=null;
	
	
	static{
		
		try {
//			加载配置文件
			Reader config=Resources.getResourceAsReader("mybatis-config.xml");
			
			factory=new SqlSessionFactoryBuilder().build(config);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void addUser(User u) {
		SqlSession session=factory.openSession();
		
		session.insert("addUser", u);
		
		session.commit();
		
		session.close();

	}

	public void updateUser(User u) {
		// TODO Auto-generated method stub
		
		SqlSession session=factory.openSession();
		
		session.update("updateUser", u);
		
		session.commit();
		
		session.close();

	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
		SqlSession session=factory.openSession();
		
		session.delete("deleteUser", id);
		
		session.commit();
		
		session.close();

	}

	public User findUserById(int id) {
		// TODO Auto-generated method stub
		
		SqlSession session=factory.openSession();
		
		User u=session.selectOne("findByID",id);
		
		session.commit();
		
		session.close();
		
		return u;
	}

	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		
		SqlSession session=factory.openSession();
		
		List<User> list=session.selectList("findAll");

		session.commit();
		
		session.close();
		
		
		return list;
	}

	public List<User> findUserLike(String str) {
		// TODO Auto-generated method stub
		
		SqlSession session=factory.openSession();
		
		List<User> list=session.selectList("findUserLike", str);
		
		session.commit();
		
		session.close();
		
		return list;
	}

	public List<User> findUserIn(List qlist) {
		
       SqlSession session=factory.openSession();
		
		List<User> list=session.selectList("findUserIn", qlist);
		
		session.commit();
		
		session.close();
		
		return list;
	}

	/**
	 * 动态查询 if判断
	 * @param u
	 * @return
	 */
	public List<User> findUserDt(User u) {
		
		    SqlSession session=factory.openSession();
			
			List<User> list=session.selectList("findUserDt", u);
			
			session.commit();
			
			session.close();
			
			return list;
	}

	public List<User> findUserMap(Map map) {
		// TODO Auto-generated method stub
		
		SqlSession session=factory.openSession();
		
		List<User> list=session.selectList("findUserMap", map);
		session.commit();
		
		session.close();
		
		return list;
	}

}
