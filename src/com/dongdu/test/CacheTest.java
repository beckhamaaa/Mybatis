package com.dongdu.test;

import com.dongdu.dao.impl.UserDaoImpl;
import com.dongdu.vo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by Torres
 * 2018-05-16 22:01
 */
public class CacheTest {

    /**
     * 测试一级缓存
     */
    @Test
    public void testCache(){
        Reader config;
        try {
            config= Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(config);
            SqlSession session=factory.openSession();
            User u1=session.selectOne("findUserById",1);
            //清除缓存
            session.clearCache();
            User u2=session.selectOne("findUserById",1);
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试一级缓存
     */
    @Test
    public void testCache1(){
        UserDaoImpl userDao=new UserDaoImpl();
        userDao.findUserById(1);
        userDao.findUserById(1);
    }

    /**
     * 测试二级缓存
     */
    @Test
    public void testCache2(){
        Reader config;
        try {
            config= Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(config);
            SqlSession session=factory.openSession();
            User u1=session.selectOne("findUserById",1);
            session.close();
            SqlSession session2=factory.openSession();
            User u2=session.selectOne("findUserById",1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
