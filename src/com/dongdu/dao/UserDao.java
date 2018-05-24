package com.dongdu.dao;

import com.dongdu.vo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

	

	/**
	 * �����û�����
	 * @param u  �û�����
	 * @return  0����ʧ��1����ֵ����ɹ�
	 */
	public void addUser(User u);
	/**
	 * �ı��û���Ϣ����
	 * @param u  �û�����
	 * @return  0����ʧ��1����ֵ����ɹ�
	 */
	public void updateUser(User u);
	/**
	 * ɾ�� �û�����
	 * @param id �û�����ID����
	 * @return 0����ʧ�� 1����ֵ����ɹ�
	 */
	public void deleteUser(int id);
	/**
	 * ����ID��ѯ��Ӧ�û���Ϣ
	 * @param id �û�����ID����
	 * @return ��Ϊ����user����ʧ�ܷ���null
	 */
	public User findUserById(int id);
	/**
	 * ��ѯȫ��Ӧ�û���Ϣ
	 * @return ��Ϊ�����û������б�,ʧ�ܷ��ؿյ��б����
	 */
	public List<User> findAllUser();
	/**
	 * ģ����ѯ�û���Ϣ
	 * @return ��Ϊ�����û������б�,ʧ�ܷ��ؿյ��б����
	 */
	public List<User> findUserLike(String str);
	
	/**
	 * list��ѯ�û���Ϣ
	 * @return ��Ϊ�����û������б�,ʧ�ܷ��ؿյ��б����
	 */
	public List<User> findUserIn(List qlist);
	
	/**
	 * ��̬��ѯ�û���Ϣ
	 * @return ��Ϊ�����û������б�,ʧ�ܷ��ؿյ��б����
	 */
	public List<User> findUserDt(User u);
	
	public List<User> findUserMap(Map map);
}
