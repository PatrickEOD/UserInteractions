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
//		NoteUDTToNoteUDTForm n = new NoteUDTToNoteUDTForm();

		interactionsForm.setId(interactions.getId());
		interactionsForm.setHref(interactions.getBaseType());
		interactionsForm.setSourceInteractionId(interactions.getSourceInteractionId());
		interactionsForm.setSourceSystemId(interactions.getSourceSystemId());
		interactionsForm.setSourceSystem(interactions.getSourceSystem());
		interactionsForm.setBaseType(interactions.getBaseType());
		interactionsForm.setType(interactions.getType());
		interactionsForm.setSchemaLocation(interactions.getSchemaLocation());

//		interactionsForm.setNote(n.convert(interactions.getNote()));
		interactionsForm.setDescription(interactions.getDescription());

		return interactionsForm;
	}

}
