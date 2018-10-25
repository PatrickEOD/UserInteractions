package userInteraction.services;

import java.util.List;
import java.util.UUID;

import userInteraction.dummies.InteractionsForm;
import userInteraction.entities.Interactions;

public interface InteractionsService {

	List<Interactions> listAll();

	Interactions getById(UUID id);

	Interactions saveOrUpdate(Interactions interactions);

	void delete(UUID id);

	Interactions saveOrUpdateInteractionForm(InteractionsForm interactionsForm);
}
