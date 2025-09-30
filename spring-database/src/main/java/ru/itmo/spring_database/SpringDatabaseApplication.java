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
       groupDao.create(1000L, "A1000");
       groupDao.updateNameById(5000L, "B5000");
       groupDao.deleteById(1000L);

        System.out.println(groupDao.findAll());

	}

}
