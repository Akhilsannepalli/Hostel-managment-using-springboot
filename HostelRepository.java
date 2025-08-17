package com.springboot.project.repository;

import com.springboot.project.model.Hostel;
import com.springboot.project.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HostelRepository {

    private SessionFactory sessionFactory;

    public HostelRepository() {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Hostel.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
    }

    public void save(Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();
        session.close();
    }

    public List<Hostel> showAllHostels() {
        Session session = sessionFactory.openSession();
        List<Hostel> hostels = session.createQuery("from Hostel", Hostel.class).list();
        session.close();
        return hostels;
    }

    public List<Student> showAllStudents() {
        Session session = sessionFactory.openSession();
        List<Student> students = session.createQuery("from Student", Student.class).list();
        session.close();
        return students;
    }

    public void close() {
        sessionFactory.close();
    }
}
