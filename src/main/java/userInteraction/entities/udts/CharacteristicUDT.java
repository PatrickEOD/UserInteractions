package userInteraction.entities.udts;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import com.datastax.driver.core.DataType;

@UserDefinedType("characteristic")
public class CharacteristicUDT {

	@CassandraType(type = DataType.Name.TEXT)
	private String name;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
