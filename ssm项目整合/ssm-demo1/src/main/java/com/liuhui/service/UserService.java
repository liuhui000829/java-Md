package com.liuhui.service;

import com.liuhui.domain.User;


import java.util.List;

public interface UserService {
     void save(User user);
     List<User> findAll();
}
