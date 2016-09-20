package com.bah.domain.respository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.bah.domain.model.Client;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

	@Override
	public Optional<Client> findByName(String name) {
		Client client = new Client("John");
		
		save(client);
		return Optional.of(client);
	}

	@Override
	public Optional<Client> findByNumber(String number) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Client save(Client client){
		
		return client;
	}

}
