package userInteraction.dummies;

import java.sql.Timestamp;
import java.util.List;

import com.datastax.driver.core.UDTValue;

//import java.util.UUID;

public class InteractionsForm {

//	private UUID id;
	private String id;
	private String href;
	private String sourceInteractionId;
	private String sourceSystemId;
	private String sourceSystem;
	private String baseType;
	private String type;
	private String schemaLocation;
//	private List<UDTValue> interactionDate;
//	private List<Timestamp> interactionDate;
	private List<String> interactionDate;
	
//    private String description;
//    private BigDecimal price;
//    private String imageUrl;

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
//	public UUID getId() {
//		return id;
//	}

//	public void setId(UUID id) {
//		this.id = id;
//	}

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

//	public List<UDTValue> getInteractionDate() {
//		return interactionDate;
//	}
	
//	public List<Timestamp> getInteractionDate() {
//		return interactionDate;
//	}
	
	public List<String> getInteractionDate() {
		return interactionDate;
	}

//	public void setInteractionDate(List<UDTValue> interactionDate) {
//		this.interactionDate = interactionDate;
//	}
	
//	public void setInteractionDate(List<Timestamp> interactionDate) {
//		this.interactionDate = interactionDate;
//	}
	
	public void setInteractionDate(List<String> interactionDate) {
		this.interactionDate = interactionDate;
	}
	
//    public String getDescription() {
//        return description;
//    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

//    public BigDecimal getPrice() {
//        return price;
//    }

//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }

//    public String getImageUrl() {
//        return imageUrl;
//    }

//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
}
