package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Test entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "TEST", schema = "CLASSICCARS")
public class Test implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private String age;

	// Constructors

	/** default constructor */
	public Test() {
	}

	/** full constructor */
	public Test(String name, String age) {
		this.name = name;
		this.age = age;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "AGE", length = 50)
	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}