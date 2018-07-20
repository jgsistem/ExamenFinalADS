package examenfinal.student.application.dto;

import java.math.BigDecimal;
import java.sql.Date;

import examenfinal.common.application.dto.RequestBaseDto;

public class StudentDto extends RequestBaseDto {

	private long id;
	private String firstName;
	private String lastName;	
	private Date birthDate;
	private String documentNumber;
	private Boolean isactive;
	private String cellphone;
	private String email;
	private String id_tipo;
	
	
	public void setId_tipo(String id_tipo) {
		this.id_tipo = id_tipo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	     
}
