package com.torres.mybatis.test;

import com.torres.mybatis.dao.UserDao;
import com.torres.mybatis.dao.impl.UserDaoImpl;
import com.torres.mybatis.vo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTest {


    /**
     * HelloWorld
     */
    @Test
    public void testSelect() {
        try {

            //1.���������ļ�
            Reader config = Resources.getResourceAsReader("mybatis-config.xml");

            //2.�õ��Ự����
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(config);

            //3.�����Ự
            SqlSession session = factory.openSession();

            User u = session.selectOne("findByID", 1);
//            selectOne(mapper��id, ����Ĳ���)

            session.commit();//�ύ����

            session.close();//�رջỰ

            System.out.println(u.toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    /**
     * ����
     */
    @Test
    public void testAdd() {

        User u = new User();

        u.setName("zhangsan");
        u.setPassword("234");
        u.setSex("women");
        u.setAge(30);
        u.setBirthday("1989-2-11");

        UserDao userdao = new UserDaoImpl();

        userdao.addUser(u);
    }


    /**
     * ɾ��
     */
    @Test
    public void testDelete() {
        UserDao userdao = new UserDaoImpl();
        userdao.deleteUser(20);
    }


    /**
     * ����
     */
    @Test
    public void testUpdate() {
        UserDao userdao = new UserDaoImpl();
        User u = userdao.findUserById(10);
        u.setName("wang888");
        userdao.updateUser(u);
    }

    /**
     * ��ѯȫ��
     */
    @Test
    public void findAll() {
        UserDao userdao = new UserDaoImpl();
        List<User> list = userdao.findAllUser();
        for (User u : list) {
            System.out.println(u.toString());
        }
    }

    /**
     * ģ����ѯ
     */
    @Test
    public void findUserLikeTest() {
        UserDao userdao = new UserDaoImpl();
        List<User> list = userdao.findUserLike("wang");
        for (User u : list) {
            System.out.println(u.toString());
        }
    }

    /**
     * ����Ϊlist
     */
    @Test
    public void findUserInTest() {
        UserDao userdao = new UserDaoImpl();
        List qlist = new ArrayList();

        qlist.add(1);
//        ���ַ���Ҳ����
        qlist.add("10");
        qlist.add(20);

        List<User> list = userdao.findUserIn(qlist);

        for (User u : list) {
            System.out.println(u.toString());
        }

    }


    @Test
    public void findUserDtTest() {

        UserDao userdao = new UserDaoImpl();

        User u = new User();

        u.setName("wang888");

        u.setAge(30);

        List<User> list = userdao.findUserDt(u);

        for (User uu : list) {

            System.out.println(uu.toString());
        }

    }

    /**
     * ����ΪMap,����ҳ
     */
    @Test
    public void findUserMapTest() {

        UserDao userdao = new UserDaoImpl();

        Map map = new HashMap();

        map.put("name", "ang");
        map.put("age", 30);
        map.put("pageno", 0);
        map.put("pagesize", 2);

        List<User> list = userdao.findUserMap(map);
        for (User u : list) {
            System.out.println(u.toString());
        }
    }
}
