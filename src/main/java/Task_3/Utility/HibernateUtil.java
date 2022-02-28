package Task_3.Utility;/*
 * Created by Vaishnavi Chaurasia
 * 26-Feb-22
 * 3:18 PM
 * IoT83 Internship
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Bootstrapping refers to the process of building and initializing a SessionFactory.
 * To achieve this purpose, we need to have a ServiceRegistry
 * that holds the Services needed by Hibernate.
 * From this registry, we can build a Metadata object
 * that represents the application's domain model and its mapping to the database.
 */

/**
 * 1. Build the StandardServiceRegistry
 * 2. Build the Metadata
 * 3. Use those 2 to build the SessionFactory
 */

public class HibernateUtil {

    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;


    /**
     * Session is used to get a physical connection with a database
     * SessionFactory is an instance which will create Session objects.
     * @return
     */
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                // Create registry
                registry = new StandardServiceRegistryBuilder().configure().build();

                // Create MetadataSources
                MetadataSources sources = new MetadataSources(registry);

                // Create Metadata
                Metadata metadata = sources.getMetadataBuilder().build();

                // Create SessionFactory
                sessionFactory = metadata.getSessionFactoryBuilder().build();
            } catch (Exception e) {
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }

    public static void shutdown() {
        if (registry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }


}