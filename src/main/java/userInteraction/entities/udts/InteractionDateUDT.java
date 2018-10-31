package userInteraction.entities.udts;

import java.util.Date;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import com.datastax.driver.core.DataType;

@UserDefinedType("interactionDate")
public class InteractionDateUDT {
	
	@CassandraType(type = DataType.Name.TIMESTAMP)
	private Date startDateTime;
	
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
