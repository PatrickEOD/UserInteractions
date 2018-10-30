package userInteraction.entities.udts;

import java.util.List;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import com.datastax.driver.core.DataType;
import com.datastax.driver.mapping.annotations.Frozen;

@UserDefinedType("interactionItem")
public class InteractionItemUDT {

	@CassandraType(type = DataType.Name.TEXT)
	private String id;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String href;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String reason;
	
	@CassandraType(type = DataType.Name.TIMESTAMP)
	private String itemDate;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String resolution;
	
	@CassandraType(type = DataType.Name.TEXT)
	@Frozen
	private List<RelatedPartyUDT> relatedParty;
	
	@CassandraType(type = DataType.Name.TEXT)
	@Frozen
	private List<RelatedEntityUDT> relatedEntity;
	
	@CassandraType(type = DataType.Name.TEXT)
	@Frozen
	private List<AttachmentUDT> attachment;
	
	@CassandraType(type = DataType.Name.TEXT)
	@Frozen
	private List<NoteUDT> note;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getItemDate() {
		return itemDate;
	}

	public void setItemDate(String itemDate) {
		this.itemDate = itemDate;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public List<RelatedPartyUDT> getRelatedParty() {
		return relatedParty;
	}

	public void setRelatedParty(List<RelatedPartyUDT> relatedParty) {
		this.relatedParty = relatedParty;
	}

	public List<RelatedEntityUDT> getRelatedEntity() {
		return relatedEntity;
	}

	public void setRelatedEntity(List<RelatedEntityUDT> relatedEntity) {
		this.relatedEntity = relatedEntity;
	}

	public List<AttachmentUDT> getAttachment() {
		return attachment;
	}

	public void setAttachment(List<AttachmentUDT> attachment) {
		this.attachment = attachment;
	}

	public List<NoteUDT> getNote() {
		return note;
	}

	public void setNote(List<NoteUDT> note) {
		this.note = note;
	}
	
}
