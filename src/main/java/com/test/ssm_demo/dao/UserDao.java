package com.test.ssm_demo.dao;

import com.test.ssm_demo.model.User;

import java.util.List;

/**
 * @description:
 * @author: yinc.luo
 * @date: 2018-05-29 14:50
 */
public interface UserDao {
    int insert(User user);
    int insertSelective(User user);
    int deleteByPrimaryKey(int id);
    int updateByPrimaryKeySelective(User user);
    int updateByPrimaryKey(User user);
    User selectByPrimaryKey(int id);
    List<User> getAll();
    User selectByUsernameAndPassword(User user);
}
