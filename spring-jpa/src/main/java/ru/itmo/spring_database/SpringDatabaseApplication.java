package ru.itmo.spring_database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itmo.spring_database.dao.CityDao;

import java.util.Scanner;

@SpringBootApplication
public class SpringDatabaseApplication {

    public static void main(String[] args) {

       ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDatabaseApplication.class, args);
       CityDao cityDao = applicationContext.getBean(CityDao.class);

       Scanner scanner = new Scanner(System.in);
       System.out.println("Добавляем город... ");
       System.out.print("Введите код города: ");
       long codeCity = scanner.nextLong();
       System.out.print("Введите название на русском: ");
       String nameCityRu = scanner.nextLine();
       System.out.print("Введите название на английском: ");
       String nameCityEn = scanner.nextLine();
       System.out.print("Количество населения: ");
       Integer numberResidentsCity = scanner.nextInt();
       System.out.print("Код региона: ");
       Integer codeRegionCity = scanner.nextInt();

       cityDao.create(codeCity,
                    nameCityRu,
                    nameCityEn,
                    numberResidentsCity,
                    codeRegionCity);

       System.out.println("Корректируем наименование города... ");
       System.out.print("Введите код города: ");
       codeCity = scanner.nextLong();

        cityDao.updateById(codeCity,
                "Тюмень",
                "Tyumen",
                850000,
                72);

       System.out.println("Удаляем город... ");
       System.out.print("Введите код города: ");
       codeCity = scanner.nextLong();
       cityDao.deleteById(codeCity);
	}

}
