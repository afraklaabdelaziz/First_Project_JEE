package com.example.first_project_jee.Services.Implimentation;

import com.example.first_project_jee.Dao.Implimentation.UserDaoImplimentation;
import com.example.first_project_jee.Entities.User;
import com.example.first_project_jee.Repository.Implimentation.UserRepositoryImplimentation;
import com.example.first_project_jee.Services.UserService;

import java.util.List;

public class UserServiceImplomentation implements UserService {
    private UserRepositoryImplimentation userRepo = new UserRepositoryImplimentation();

    @Override
    public void register(User user) {
     userRepo.add(user);
    }

    @Override
    public void login(String email , String password) {
                userRepo.login(email,password);
    }


    @Override
    public List<User> listUser() {
        return userRepo.getUserDao().listUser();
    }

    @Override
    public List<User> searchUser(String search) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public void updateUSer(long idUser) {

    }

    @Override
    public void remmoveUSer(long idUser) {

    }
}
