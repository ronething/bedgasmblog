package blog.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import blog.entity.User;

@Repository("userDao")
public interface UserDao {
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public Integer addUser(User user);
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public Integer deleteUser(Integer id);
	/**
	 * 根据id获取用户
	 * @param id
	 * @return
	 */
	public User findById(Integer id);
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public Integer updateUser(User user);
	
	/**
	 * 根据条件查询
	 * @param map
	 * @return
	 */
	public List<User> listUser(Map<String, Object> map);
	
	/**
	 * 根据用户名查出改用户
	 * @param username
	 * @return
	 */
	public User fingByUserLogin(String username);

}
