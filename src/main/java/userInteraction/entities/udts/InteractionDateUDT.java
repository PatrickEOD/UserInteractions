package userInteraction.entities.udts;

import java.util.Date;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import com.datastax.driver.core.DataType;
//import com.datastax.driver.mapping.annotations.Field;
//import com.datastax.driver.mapping.annotations.UDT;

//@UDT(keyspace = "interactions", name = "informationDate")
@UserDefinedType("interactionDate")
public class InteractionDateUDT {
	
//	@Field(name = "startDateTime")
	@CassandraType(type = DataType.Name.TIMESTAMP)
	private Date startDateTime;
	
//	@Field(name = "endDateTime")
	@CassandraType(type = DataType.Name.TIMESTAMP)
	private Date endDateTime;

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}


}
