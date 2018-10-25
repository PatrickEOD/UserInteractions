package userInteraction.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import userInteraction.dummies.InteractionsForm;
import userInteraction.entities.Interactions;

@Component
public class InteractionsFormToInteractions implements Converter<InteractionsForm, Interactions> {

	@Override
	public Interactions convert(InteractionsForm interactionsForm) {
		Interactions interaction = new Interactions();
		if(interactionsForm.getId() != null && !StringUtils.isEmpty(interactionsForm.getId())) {
			interaction.setId(interactionsForm.getId());
		}
		interaction.setDescription(interactionsForm.getDescription());
		interaction.setPrice(interactionsForm.getPrice());
		interaction.setImageUrl(interactionsForm.getImageUrl());
		return interaction;
	}

	
}
