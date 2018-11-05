package userInteraction.services;

import java.util.List;
//import java.util.UUID;

import userInteraction.dummies.InteractionsForm;
import userInteraction.entities.Interactions;

public interface InteractionsService {

	List<Interactions> listAll();

// for cassandraInstance in local docker
//	Interactions getById(UUID id);

	Interactions getById(String id);
	
	Interactions getByCustomerIdAndId(String customerId, String id);

	Interactions saveOrUpdate(Interactions interactions);

// for cassandraInstance in local docker
//	void delete(UUID id);

	void delete(String id);

	void delete(String customerId, String id);

	Interactions saveOrUpdateInteractionsForm(InteractionsForm interactionsForm);
}
