package com.restSample.services.impl;

import com.restSample.domain.Cars;
import com.restSample.services.CarsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarsServiceImpl implements CarsService {

    @Override
    public List<Cars> getCars() {
        Cars c1 = new Cars();
        c1.setMake("Subaru");
        c1.setModel("WRX STI");
        c1.setYear("2014");

        Cars c2 = new Cars();
        c2.setMake("Mitsubishi");
        c2.setModel("EVO");
        c2.setYear("2007");

        Cars c3 = new Cars();
        c3.setMake("Porsche");
        c3.setModel("Carrera GT");
        c3.setYear("2005");

        List<Cars> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);

        return cars;
    }
}
