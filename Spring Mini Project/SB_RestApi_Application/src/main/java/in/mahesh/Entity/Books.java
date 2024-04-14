package in.mahesh.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	private String name;
	private Double price;
	
	
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Books(Integer courseId, String name, Double price) {
		super();
		this.bookId = courseId;
		this.name = name;
		this.price = price;
	}
	public Integer getCourseId() {
		return bookId;
	}
	public void setCourseId(Integer courseId) {
		this.bookId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	

}
