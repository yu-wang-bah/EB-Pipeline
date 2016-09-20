package com.bah.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.bah.domain.VehicleIdentificationNumber;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;


@Service
public class RemoteVehicleDetailsService implements VehicleDetailsService {

	private static final Logger logger = LoggerFactory
			.getLogger(RemoteVehicleDetailsService.class);

//	private final ServiceProperties properties;
//
//	private final RestTemplate restTemplate;
//
//	public RemoteVehicleDetailsService(ServiceProperties properties) {
//		this.properties = properties;
//		this.restTemplate = new RestTemplate();
//	}

//	protected final RestTemplate getRestTemplate() {
//		return this.restTemplate;
//	}

	
	public List<VehicleDetails> getTopBrand(){
		List<VehicleDetails> VDList = new ArrayList<VehicleDetails>();
		VDList.add(new VehicleDetails("Honda", "Civic"));
		VDList.add(new VehicleDetails("Ford", "Explorer"));
		VDList.add(new VehicleDetails("GM", "Malibu"));
		return VDList;
	}
//	@Override
//	public VehicleDetails getVehicleDetails(VehicleIdentificationNumber vin)
//			throws VehicleIdentificationNumberNotFoundException {
//		Assert.notNull(vin, "VIN must not be null");
//		String url = this.properties.getVehicleServiceRootUrl() + "vehicle/{vin}/details";
//		logger.debug("Retrieving vehicle data for: " + vin + " from: " + url);
//		try {
//			return this.restTemplate.getForObject(url, VehicleDetails.class, vin);
//		}
//		catch (HttpStatusCodeException ex) {
//			if (HttpStatus.NOT_FOUND.equals(ex.getStatusCode())) {
//				throw new VehicleIdentificationNumberNotFoundException(vin, ex);
//			}
//			throw ex;
//		}
//	}

}