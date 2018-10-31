//package userInteraction.converters;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.stereotype.Component;
//
//import userInteraction.dummies.udts.NoteUDTForm;
//import userInteraction.entities.udts.NoteUDT;
//
//@Component
//public class NoteUDTToNoteUDTForm implements Converter<List<NoteUDT>, List<NoteUDTForm>> {
//
//	@Override
//	public List<NoteUDTForm> convert(List<NoteUDT> noteUDTList) {
//		
//		List<NoteUDTForm> noteUDTFormList = new ArrayList<NoteUDTForm>();
//		
//		for(NoteUDT note : noteUDTList) {
//			NoteUDTForm noteUDTForm = new NoteUDTForm();
//			
//			noteUDTForm.setDate(note.getDate());
//			noteUDTForm.setAuthor(note.getAuthor());
//			noteUDTForm.setText(note.getText());
//			
//			noteUDTFormList.add(noteUDTForm);
//		}
//		
//		return noteUDTFormList;
//	}
//
//}
