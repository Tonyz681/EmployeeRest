package mx.com.proyecti.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Yo le estoy indicando a Java que esta clase se va a
		//comportar como una entidad
@Table(name = "employee") //Indica que la clase corresponde 
						// a una tabla contenida en bd
public class Employee {
	
	@Id //Identifica al id de mi tabla dentro de mi clase
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE) //Auto incremento
	private long id;
	private String firstname;
	private String lastname;
	private Date birthdate;
	private double salary;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
