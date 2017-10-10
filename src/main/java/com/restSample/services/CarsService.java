package com.restSample.services;

import com.restSample.domain.Cars;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alok on 10/9/17.
 */
@Service
public interface CarsService {

    List<Cars> getCars();
}
