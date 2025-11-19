package org.example.CollegamentoDatabase;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
    // Creiamo una sola EntityManagerFactory (singleton)
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("mioPU");

    // Metodo per ottenere un EntityManager
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Metodo per chiudere la factory quando il programma termina
    public static void close() {
        emf.close();
    }
}
