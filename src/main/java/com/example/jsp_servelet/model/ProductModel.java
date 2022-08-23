package com.example.jsp_servelet.model;

import com.example.jsp_servelet.entity.ProductEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ProductModel {

    protected SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public boolean create(ProductEntity productEntity) {
        boolean result = true;
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(productEntity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            result = false;
        } finally {
            session.close();
        }
        return result;
    }

}