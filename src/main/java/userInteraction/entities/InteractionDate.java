package userInteraction.entities;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import com.datastax.driver.core.DataType;
//import com.datastax.driver.mapping.annotations.Field;
//import com.datastax.driver.mapping.annotations.UDT;

//@UDT(keyspace = "interactions", name = "informationDate")
@UserDefinedType("interactionDate")
public class InteractionDate {
	
//	@Field(name = "startDateTime")
	@CassandraType(type = DataType.Name.TIMESTAMP)
	private String startDateTime;
	
//	@Field(name = "endDateTime")
	@CassandraType(type = DataType.Name.TIMESTAMP)
	private String endDateTime;

	public String getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

	public String getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}

}
