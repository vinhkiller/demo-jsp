package com.example.jsp_servelet.model;

import org.hibernate.SessionFactory;


public class UserModel {

    protected SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

//    public UserEntity findByUsername(String username) {
//        UserEntity product = null;
//        Session session = null;
//        Transaction transaction = null;
//        try {
//            session = sessionFactory.openSession();
//            transaction = session.beginTransaction();
//            org.hibernate.query.Query<UserEntity> query = session.createQuery("from UserEntity where username = :id", UserEntity.class);
//            query.setParameter("username", username);
//            product = query.getSingleResult();
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        } finally {
//            session.close();
//        }
//        return product;
//    }

}