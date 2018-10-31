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
		Interactions interactions = new Interactions();
		
		if(interactionsForm.getId() != null && !StringUtils.isEmpty(interactionsForm.getId())) {
			interactions.setId(interactionsForm.getId());
		}
		
		interactions.setHref(interactionsForm.getHref());
		interactions.setSourceInteractionId(interactionsForm.getSourceInteractionId());
		interactions.setSourceSystemId(interactionsForm.getSourceSystemId());
		interactions.setSourceSystem(interactionsForm.getSourceSystem());
		interactions.setBaseType(interactionsForm.getBaseType());
		interactions.setType(interactionsForm.getType());
		interactions.setSchemaLocation(interactionsForm.getSchemaLocation());
		
		interactions.setDescription(interactionsForm.getDescription());
		
		return interactions;
	}

	
}
