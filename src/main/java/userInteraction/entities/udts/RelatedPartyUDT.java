package userInteraction.entities.udts;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import com.datastax.driver.core.DataType;

@UserDefinedType("relatedParty")
public class RelatedPartyUDT {
	
	@CassandraType(type = DataType.Name.TEXT)
	private String id;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String href;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String referredType;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String role;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String name;

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

	public String getReferredType() {
		return referredType;
	}

	public void setReferredType(String referredType) {
		this.referredType = referredType;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "RelatedPartyUDTList [id=" + id + ", href=" + href + ", referredType=" + referredType + ", role=" + role
				+ ", name=" + name + "]";
	}
	
}
