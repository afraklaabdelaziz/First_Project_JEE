package com.example.first_project_jee.Services;

import com.example.first_project_jee.Entities.User;

import java.util.List;

public interface UserService {
    public void register(User user);
    public void login(String email,String password);
    public List<User> listUser();
    public List<User> searchUser(String search);
    public User findByEmail(String email);
    public void updateUSer(long idUser);
    public void remmoveUSer(long idUser);
}
