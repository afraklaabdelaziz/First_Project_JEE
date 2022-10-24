package com.example.first_project_jee.Services.Implimentation;

import com.example.first_project_jee.Entities.User;
import com.example.first_project_jee.Repository.Implimentation.UserRepositoryImplimentation;
import com.example.first_project_jee.Services.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class UserServiceImplomentation implements UserService {
    private UserRepositoryImplimentation userRepo = new UserRepositoryImplimentation();

    private EntityManager entityManager;

    public UserServiceImplomentation() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("First");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public void register(User user) {
     userRepo.add(user);
    }

    @Override
    public void login(String email , String password) {

    }

    @Override
    public List<User> listUser() {
        return null;
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
