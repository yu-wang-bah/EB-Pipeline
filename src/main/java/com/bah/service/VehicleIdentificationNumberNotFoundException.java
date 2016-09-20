package com.bah.service;

import com.bah.domain.VehicleIdentificationNumber;

public class VehicleIdentificationNumberNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private VehicleIdentificationNumber vehicleIdentificationNumber;

	public VehicleIdentificationNumberNotFoundException(VehicleIdentificationNumber vin) {
		this(vin, null);
	}

	public VehicleIdentificationNumberNotFoundException(VehicleIdentificationNumber vin,
			Throwable cause) {
		super("Unable to find VehicleIdentificationNumber " + vin, cause);
		this.vehicleIdentificationNumber = vin;
	}

	public VehicleIdentificationNumber getVehicleIdentificationNumber() {
		return this.vehicleIdentificationNumber;
	}
}