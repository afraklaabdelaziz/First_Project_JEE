package com.example.first_project_jee.Repository.Implimentation;

import com.example.first_project_jee.Dao.Implimentation.UserDaoImplimentation;
import com.example.first_project_jee.Entities.User;
import com.example.first_project_jee.Repository.UserRepository;

public class UserRepositoryImplimentation implements UserRepository {
    private UserDaoImplimentation userDao = new UserDaoImplimentation();
    @Override
    public void add(User user) {
        userDao.addUser(user);
    }

    @Override
    public User login(String email, String password) {
        return null;
    }

    @Override
    public void regester(User user) {

    }

    @Override
    public void delete(Long idUser) {

    }
}
