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
    }

    @Override
    public void addUser(User user) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("First");
        entityManager = entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();
     try {
         entityManager.persist(user);
         entityManager.getTransaction().commit();
     }catch (Exception e){
         entityManager.getTransaction().rollback();
         e.printStackTrace();
     } finally {
         entityManager.close();
     }
    }

    @Override
    public void deleteUser(Long idUser) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("First");
        entityManager = entityManagerFactory.createEntityManager();
     entityManager.getTransaction().begin();
     try {
         User user = entityManager.find(User.class,idUser);
         entityManager.remove(user);
         entityManager.getTransaction().commit();
     }catch (Exception e){
         entityManager.getTransaction().rollback();
         e.printStackTrace();
     } finally {
         entityManager.close();
     }
    }

    @Override
    public List<User> listUser() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("First");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select users from User users ");
        entityManager.getTransaction().commit();
        return query.getResultList();
    }
}
