package userInteraction.entities.udts;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import com.datastax.driver.core.DataType;

@UserDefinedType("channel")
public class ChannelUDT {

	@CassandraType(type = DataType.Name.TEXT)
	private String id;

	@CassandraType(type = DataType.Name.TEXT)
	private String href;

	@CassandraType(type = DataType.Name.TEXT)
	private String name;

	@CassandraType(type = DataType.Name.TEXT)
	private String role;

	@CassandraType(type = DataType.Name.TEXT)
	private String type;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
