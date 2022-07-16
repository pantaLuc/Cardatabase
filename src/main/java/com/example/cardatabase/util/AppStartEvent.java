package com.example.cardatabase.util;

import com.example.cardatabase.model.Owner;
import com.example.cardatabase.repository.OwnerRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppStartEvent implements ApplicationListener<ApplicationReadyEvent> {
    private final OwnerRepository ownerRepository;

    public AppStartEvent(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Owner owner1=new Owner("Luc ", "Panta");
        Owner owner2=new Owner("Meira" ,"Panta");
        this.ownerRepository.saveAll(Arrays.asList(owner1 ,owner2));
        Iterable<Owner> owners=this.ownerRepository.findAll();
        owners.forEach(owner -> {
            System.out.println(owner.getFirstName());
        });

    }
}
