package com.example.first_project_jee.Repository;

import com.example.first_project_jee.Entities.User;

public interface UserRepository {
    public void add(User user);
    public void login(String email , String password);
    public void regester(User user);
    public void delete(Long idUser);
}
