package com.restSample.rest;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;
import com.restSample.domain.Cars;
import com.restSample.services.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by alok on 10/9/17.
 */
@RestController
@RequestMapping("/cars")
public class CarsResource {

    @Autowired
    CarsService carsService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getCars(){

        List<Cars> carList = carsService.getCars();
        ObjectMapper objectMapper = new ObjectMapper();
        byte[] jsonBytes = null;
        try {
            jsonBytes = objectMapper.writeValueAsBytes(carList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(jsonBytes, HttpStatus.OK);

    }

}
