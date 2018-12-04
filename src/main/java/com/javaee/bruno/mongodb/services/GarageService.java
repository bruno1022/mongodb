package com.javaee.bruno.mongodb.services;

import java.util.Set;

import com.javaee.bruno.mongodb.domain.Garage;

public interface GarageService {

	Set<Garage> getAll();

	Garage getGarageById(String id);

	Garage createNewGarage(Garage garage);

	Garage saveGarage(String id, Garage garage);

	void deleteGarageById(String id);
}
