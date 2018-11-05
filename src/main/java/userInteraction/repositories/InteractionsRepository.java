package userInteraction.repositories;

//import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import userInteraction.entities.Interactions;

//for cassandraInstance in local docker
//public interface InteractionsRepository extends CrudRepository<Interactions, UUID> {

public interface InteractionsRepository extends CrudRepository<Interactions, String> {

	Interactions findByCustomerIdAndId(String customerId, String id);
	
	Interactions deleteByCustomerIdAndId(String customerId, String id);
}
