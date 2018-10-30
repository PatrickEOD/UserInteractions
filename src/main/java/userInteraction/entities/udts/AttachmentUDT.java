package userInteraction.entities.udts;

import java.util.Date;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import com.datastax.driver.core.DataType;

@UserDefinedType("attachment")
public class AttachmentUDT {

	@CassandraType(type = DataType.Name.TEXT)
	private String id;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String href;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String name;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String description;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String type;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String mimeType;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String size;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String sizeUnit;
	
	@CassandraType(type = DataType.Name.TEXT)
	private String url;
	
	@CassandraType(type = DataType.Name.TIMESTAMP)
	private Date validForStartTime;
	
	@CassandraType(type = DataType.Name.TIMESTAMP)
	private Date validForEndTime;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSizeUnit() {
		return sizeUnit;
	}

	public void setSizeUnit(String sizeUnit) {
		this.sizeUnit = sizeUnit;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getValidForStartTime() {
		return validForStartTime;
	}

	public void setValidForStartTime(Date validForStartTime) {
		this.validForStartTime = validForStartTime;
	}

	public Date getValidForEndTime() {
		return validForEndTime;
	}

	public void setValidForEndTime(Date validForEndTime) {
		this.validForEndTime = validForEndTime;
	}
	
	
}
