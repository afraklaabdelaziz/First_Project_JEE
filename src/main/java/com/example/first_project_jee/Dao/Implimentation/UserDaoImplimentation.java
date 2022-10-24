package com.example.first_project_jee.Dao.Implimentation;

import com.example.first_project_jee.Dao.UserDao;
import com.example.first_project_jee.Entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class UserDaoImplimentation implements UserDao {
    private EntityManager entityManager;

    public UserDaoImplimentation() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("First");
       entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public void addUser(User user) {
     entityManager.getTransaction().begin();
     try {
         entityManager.persist(user);
         entityManager.getTransaction().commit();
     }catch (Exception e){
         entityManager.getTransaction().rollback();
         e.printStackTrace();
     }
     entityManager.close();
    }

    @Override
    public void deleteUser(Long idUser) {
     entityManager.getTransaction().begin();
     try {
         User user = entityManager.find(User.class,idUser);
         entityManager.remove(user);
         entityManager.getTransaction().commit();
     }catch (Exception e){
         entityManager.getTransaction().rollback();
         e.printStackTrace();
     }
     entityManager.close();

    }

    @Override
    public List<User> listUser() {
            Query query = entityManager.createQuery("select users from User users ");
            entityManager.close();
            return query.getResultList();


    }
}
