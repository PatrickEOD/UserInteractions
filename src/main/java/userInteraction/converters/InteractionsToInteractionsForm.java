package userInteraction.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import userInteraction.dummies.InteractionsForm;
import userInteraction.entities.Interactions;

@Component
public class InteractionsToInteractionsForm implements Converter<Interactions, InteractionsForm> {

	@Override
	public InteractionsForm convert(Interactions interactions) {
		InteractionsForm interactionsForm = new InteractionsForm();
		interactionsForm.setId(interactions.getId());
		interactionsForm.setDescription(interactions.getDescription());
		interactionsForm.setImageUrl(interactions.getImageUrl());
		interactionsForm.setPrice(interactions.getPrice());
		
		return interactionsForm;
	}

	
}
