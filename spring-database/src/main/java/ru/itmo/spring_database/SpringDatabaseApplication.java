package ru.itmo.spring_database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itmo.spring_database.dao.CityDao;
import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class SpringDatabaseApplication {

	public static void main(String[] args) {

       ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDatabaseApplication.class, args);
       CityDao cityDao = applicationContext.getBean(CityDao.class);
        for (int i=1; i<=10; i++) {
            cityDao.create((long) i,
                    "name_ru"+i,
                    "name_en"+i,
                    ThreadLocalRandom.current().nextInt(100000, 999999),
                    ThreadLocalRandom.current().nextInt(1, 99));
        }
        cityDao.updateById(2L,
                "name_ru"+"_TEST",
                "name_en"+"_TEST",
                555,
                555);

        cityDao.deleteById(10L);
	}

}
