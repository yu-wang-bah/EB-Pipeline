package com.bah.service;

import java.util.List;

import com.bah.domain.VehicleIdentificationNumber;


public interface VehicleDetailsService {
	
	public List<VehicleDetails> getTopBrand();

	/**
	 * Get vehicle details for a given {@link VehicleIdentificationNumber}.
	 * @param vin the vehicle identification number
	 * @return vehicle details
	 * @throws VehicleIdentificationNumberNotFoundException if the VIN is not known
	 */
//	VehicleDetails getVehicleDetails(VehicleIdentificationNumber vin)
//			throws VehicleIdentificationNumberNotFoundException;

}