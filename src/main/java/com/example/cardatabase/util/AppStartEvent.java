package com.example.cardatabase.util;

import com.example.cardatabase.model.Car;
import com.example.cardatabase.model.Owner;
import com.example.cardatabase.repository.CardRepository;
import com.example.cardatabase.repository.OwnerRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppStartEvent implements ApplicationListener<ApplicationReadyEvent> {
    private final OwnerRepository ownerRepository;
    private final CardRepository cardRepository;

    public AppStartEvent(OwnerRepository ownerRepository, CardRepository cardRepository) {
        this.ownerRepository = ownerRepository;
        this.cardRepository = cardRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Owner owner1=new Owner("Luc ", "Panta");
        Owner owner2=new Owner("Meira" ,"Panta");
        Car car1=new Car("Ford", "Mustang", "Red",
                "ADF-1121", 2021, 59000, owner1);
        Car car2=new Car("Nissan", "Leaf", "White",
                "SSJ-3002", 2019, 29000, owner2);
        this.ownerRepository.saveAll(Arrays.asList(owner1 ,owner2));
        this.cardRepository.saveAll(Arrays.asList(car1,car2));
        Iterable<Owner> owners=this.ownerRepository.findAll();
        Iterable<Car> cars =this.cardRepository.findAll();
        owners.forEach(owner -> {
            System.out.println(owner.getFirstName());
        });
        cars.forEach(car -> {
            System.out.println(car.getOwner().getLastName());
        });

    }
}
