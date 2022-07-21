package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import peaksoft.entity.Student;
import peaksoft.entity.Test;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ){
        Session session = (Session) new Configuration()
                .configure("hibernete.cfg")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Test.class)
                .buildSessionFactory();

    }
}
