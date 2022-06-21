package com.example.cardatabase.repository;


import com.example.cardatabase.model.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardRepository extends CrudRepository<Car,Long> {
   // list Car by Brand
    List<Car> findAllByBrand(String brand);
    //List Car by Color
    List<Car> findCarByColor(String color);
    //List Car By Year
    List<Car> findByYear(int year);
    // list Car by Brand and Model
    List<Car> findByBrandAndModel(String brand ,String model);
    // List car by Brand and Color
    List<Car> findByBrandAndColor(String brand ,String Color);
    //fetch car by Brand and sorted by year
   // List<Car> findByBrandOderByYearAsc(String brand);
    //Fetch by Brand Using Sql
    @Query("SELECT c from Car c where c.brand=?1")
    List<Car> findByBrand(String brand);




}
