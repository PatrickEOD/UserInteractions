package userInteraction.entities;

import java.io.Serializable;
//import java.sql.Timestamp;
//import java.util.UUID;
import java.util.List;

import com.datastax.driver.core.DataType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

//import com.datastax.driver.core.DataType;
//import com.datastax.driver.core.UDTValue;
//import com.datastax.driver.mapping.annotations.Frozen;

// cassandraInstance at local docker
//@Table("interactions")

// cassandra at cloud
@Table("user_interactions")
public class Interactions implements Serializable {

	@PrimaryKey
//    @CassandraType(type = DataType.Name.UUID)
//    private UUID id;
	private String id;
	private String href;
	private String sourceInteractionId;
	private String sourceSystemId;
	private String sourceSystem;
	private String baseType;
	private String type;
	private String schemaLocation;
	@CassandraType(type = DataType.Name.TIMESTAMP, userTypeName = "interactionDate")
	private List<InteractionDate> interactionDate;
//	@CassandraType(type = DataType.Name.UDT)
//	private List<UDTValue> interactionDate;
//	@CassandraType(type = DataType.Name.TIMESTAMP)
//	private List<Timestamp> interactionDate;
//	private List<String> interactionDate;
	
//    private String description;
//    private BigDecimal price;
//    private String imageUrl;

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
//    public UUID getId() {
//        return id;
//    }

//    public void setId(UUID id) {
//        this.id = id;
//    }
    

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

	public List<InteractionDate> getInteractionDate() {
		return interactionDate;
	}

	public void setInteractionDate(List<InteractionDate> interactionDate) {
		this.interactionDate = interactionDate;
	}
	
//	public List<UDTValue> getInteractionDate() {
//		return interactionDate;
//	}
	
//	public List<Timestamp> getInteractionDate() {
//		return interactionDate;
//	}
	
//	public List<String> getInteractionDate() {
//		return interactionDate;
//	}

//	public void setInteractionDate(List<UDTValue> interactionDate) {
//		this.interactionDate = interactionDate;
//	}
	
//	public void setInteractionDate(List<Timestamp> interactionDate) {
//		this.interactionDate = interactionDate;
//	}
	
//	public void setInteractionDate(List<String> interactionDate) {
//		this.interactionDate = interactionDate;
//	}

//	public Interactions() {
//        id = UUID.randomUUID();
//    }
	
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
