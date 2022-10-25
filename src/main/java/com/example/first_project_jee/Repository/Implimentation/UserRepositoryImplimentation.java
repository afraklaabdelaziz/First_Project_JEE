package com.example.first_project_jee.Repository.Implimentation;

import com.example.first_project_jee.Dao.Implimentation.UserDaoImplimentation;
import com.example.first_project_jee.Entities.User;
import com.example.first_project_jee.Repository.UserRepository;

public class UserRepositoryImplimentation implements UserRepository {
    private UserDaoImplimentation userDao = new UserDaoImplimentation();

    public UserDaoImplimentation getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDaoImplimentation userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        System.out.println("3");
        userDao.addUser(user);
        System.out.println("4");
    }

    @Override
    public void login(String email, String password) {
        userDao.listUser();
    }

    @Override
    public void regester(User user) {

    }

    @Override
    public void delete(Long idUser) {

    }

}
