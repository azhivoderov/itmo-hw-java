package ru.itmo.spring_database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itmo.spring_database.dao.GroupDao;

@SpringBootApplication
public class SpringDatabaseApplication {

	public static void main(String[] args) {

       ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDatabaseApplication.class, args);
       GroupDao groupDao = applicationContext.getBean(GroupDao.class);
       for (int i=1; i<=10; i++) {
           groupDao.create(1000L*i, "A"+1000L*i );
       }

	}

}
