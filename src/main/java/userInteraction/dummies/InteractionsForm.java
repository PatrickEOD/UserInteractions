package userInteraction.dummies;

import java.util.List;

import userInteraction.dummies.udts.NoteUDTForm;

public class InteractionsForm {

	private String id;
	private String href;
	private String sourceInteractionId;
	private String sourceSystemId;
	private String sourceSystem;
	private String baseType;
	private String type;
	private String schemaLocation;
	private List<String> interactionDate;
	private String description;
	private String reason;
	private String status;
	private String subStatus;
	private String statusChangeDate;
	private String direction;
	private List<NoteUDTForm> note;
	

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

	public String getSourceInteractionId() {
		return sourceInteractionId;
	}

	public void setSourceInteractionId(String sourceInteractionId) {
		this.sourceInteractionId = sourceInteractionId;
	}

	public String getSourceSystemId() {
		return sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getBaseType() {
		return baseType;
	}

	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSchemaLocation() {
		return schemaLocation;
	}

	public void setSchemaLocation(String schemaLocation) {
		this.schemaLocation = schemaLocation;
	}

	public List<String> getInteractionDate() {
		return interactionDate;
	}

	
	public void setInteractionDate(List<String> interactionDate) {
		this.interactionDate = interactionDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubStatus() {
		return subStatus;
	}

	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

	public String getStatusChangeDate() {
		return statusChangeDate;
	}

	public void setStatusChangeDate(String statusChangeDate) {
		this.statusChangeDate = statusChangeDate;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public List<NoteUDTForm> getNote() {
		return note;
	}

	public void setNote(List<NoteUDTForm> note) {
		this.note = note;
	}
	
}
