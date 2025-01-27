package com.example.rent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rent.entities.Car;
import com.example.rent.repositories.CarRepository;

@Service
public class CarService {
	@Autowired
	CarRepository carRepository;
	
	public List<Car> getAllCar() {
        return carRepository.findAll();
    }
	public Optional<Car> findByID(int id) {
        return carRepository.findById(id);
    }
}
