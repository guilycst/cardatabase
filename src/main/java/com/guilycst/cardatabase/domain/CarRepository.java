package com.guilycst.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;
import com.guilycst.cardatabase.entity.Car;

public interface CarRepository extends CrudRepository<Car, String> {

}
