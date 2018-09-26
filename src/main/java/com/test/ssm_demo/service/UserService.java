package com.test.ssm_demo.service;

import com.test.ssm_demo.model.User;
import java.util.List;


/**
 * @description:
 * @author: yinc.luo
 * @date: 2018-05-29 14:55
 */
public interface UserService {
    String addInfo(User addInfo);
    List<User> getAll();
    String delete(int id);
    User findById(int id);
    String update(User addInfo);
    User login(User user);
}
