package userInteraction.entities.udts;

import java.util.Date;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import com.datastax.driver.core.DataType;

@UserDefinedType("note")
public class NoteUDT {

	@CassandraType(type = DataType.Name.TIMESTAMP)
	private Date date;

	@CassandraType(type = DataType.Name.TEXT)
	private String author;

	@CassandraType(type = DataType.Name.TEXT)
	private String text;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
