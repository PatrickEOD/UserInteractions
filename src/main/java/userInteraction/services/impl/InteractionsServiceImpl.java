package userInteraction.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import userInteraction.converters.InteractionsFormToInteractions;
import userInteraction.dummies.InteractionsForm;
import userInteraction.entities.Interactions;
import userInteraction.repositories.InteractionsRepository;
import userInteraction.services.InteractionsService;

@Service
public class InteractionsServiceImpl implements InteractionsService {

	private InteractionsRepository interactionsRepository;
	private InteractionsFormToInteractions interactionsFormToInteractions;

	@Autowired
	public InteractionsServiceImpl(InteractionsRepository interactionsRepository,
			InteractionsFormToInteractions interactionsFormToInteractions) {
		this.interactionsRepository = interactionsRepository;
		this.interactionsFormToInteractions = interactionsFormToInteractions;
	}

	@Override
	public List<Interactions> listAll() {
		List<Interactions> interact = new ArrayList<>();
		interactionsRepository.findAll().forEach(interact::add);
		return interact;
	}

	@Override
	public Interactions getById(UUID id) {
		return interactionsRepository.findById(id).orElse(null);
	}

	@Override
	public Interactions saveOrUpdate(Interactions interactions) {
		interactionsRepository.save(interactions);
		return interactions;
	}

	@Override
	public void delete(UUID id) {
		interactionsRepository.deleteById(id);
	}

	@Override
	public Interactions saveOrUpdateInteractionForm(InteractionsForm interactionsForm) {
		Interactions savedInteraction = saveOrUpdate(interactionsFormToInteractions.convert(interactionsForm));

		System.out.println("Saved Product Id: " + savedInteraction.getId());
		return savedInteraction;
	}
}
