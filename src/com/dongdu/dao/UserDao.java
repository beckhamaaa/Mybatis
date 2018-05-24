package com.dongdu.dao;

import com.dongdu.vo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

	

	/**
	 * 增加用户方法
	 * @param u  用户对象
	 * @return  0代表失败1以上值代表成功
	 */
	public void addUser(User u);
	/**
	 * 改变用户信息方法
	 * @param u  用户对象
	 * @return  0代表失败1以上值代表成功
	 */
	public void updateUser(User u);
	/**
	 * 删除 用户方法
	 * @param id 用户对象ID主键
	 * @return 0代表失败 1以上值代表成功
	 */
	public void deleteUser(int id);
	/**
	 * 根据ID查询对应用户信息
	 * @param id 用户对象ID主键
	 * @return 成为返回user对象失败返回null
	 */
	public User findUserById(int id);
	/**
	 * 查询全部应用户信息
	 * @return 成为返回用户对象列表,失败返回空的列表对象
	 */
	public List<User> findAllUser();
	/**
	 * 模糊查询用户信息
	 * @return 成为返回用户对象列表,失败返回空的列表对象
	 */
	public List<User> findUserLike(String str);
	
	/**
	 * list查询用户信息
	 * @return 成为返回用户对象列表,失败返回空的列表对象
	 */
	public List<User> findUserIn(List qlist);
	
	/**
	 * 动态查询用户信息
	 * @return 成为返回用户对象列表,失败返回空的列表对象
	 */
	public List<User> findUserDt(User u);
	
	public List<User> findUserMap(Map map);
}
