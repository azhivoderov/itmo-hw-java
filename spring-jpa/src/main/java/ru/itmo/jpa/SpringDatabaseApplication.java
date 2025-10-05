package ru.itmo.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itmo.jpa.dao.CityDao;
import ru.itmo.jpa.dao.RegionDao;

import java.util.Scanner;

@SpringBootApplication
public class SpringDatabaseApplication {

    public static void main(String[] args) {

       ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDatabaseApplication.class, args);
       CityDao cityDao = applicationContext.getBean(CityDao.class);
       RegionDao regionDao = applicationContext.getBean(RegionDao.class);

       Scanner scanner = new Scanner(System.in);
       System.out.println("Добавляем город... ");
       System.out.print("Введите код города: ");
       long codeCity = scanner.nextLong();
       scanner.nextLine();
       System.out.print("Введите название на русском: ");
       String nameCityRu = scanner.nextLine();
       System.out.print("Введите название на английском: ");
       String nameCityEn = scanner.nextLine();
       System.out.print("Количество населения: ");
       Integer numberResidentsCity = scanner.nextInt();
       scanner.nextLine();
       System.out.print("Наименование региона: ");
       String nameRegionCity = scanner.nextLine();
       System.out.print("Код региона: ");
       Integer codeRegionCity = scanner.nextInt();

       cityDao.create(
               nameCityRu,
               nameCityEn,
               numberResidentsCity,
               regionDao.create(codeRegionCity, nameRegionCity));

       System.out.println("Корректируем наименование города... ");
       System.out.print("Введите id города: ");
       codeCity = scanner.nextLong();

        cityDao.updateById(codeCity,
                "Тюмень",
                "Tyumen",
                850000);

       System.out.println("Удаляем город... ");
       System.out.print("Введите id города: ");
       codeCity = scanner.nextLong();
       cityDao.deleteById(codeCity);
	}
}
