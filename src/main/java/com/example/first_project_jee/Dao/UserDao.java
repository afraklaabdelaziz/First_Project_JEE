package com.example.first_project_jee.Dao;

import com.example.first_project_jee.Entities.User;

import java.util.List;

public interface UserDao {
public void addUser(User user);
public void deleteUser(Long idUser);
public List<User> listUser();
}
