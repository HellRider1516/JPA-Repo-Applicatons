package in.mahesh.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bId;
	private Double bPrice;
	private String bName;
	private LocalDate publisheDate;
	@JoinColumn
	@ManyToOne
	private Author author;
	
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(Double bPrice, String bName, LocalDate publisheDate) {
		super();
		this.bPrice = bPrice;
		this.bName = bName;
		this.publisheDate = publisheDate;
	}

	


	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}

	public Double getbPrice() {
		return bPrice;
	}

	public void setbPrice(Double bPrice) {
		this.bPrice = bPrice;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public LocalDate getPublisheDate() {
		return publisheDate;
	}

	public void setPublisheDate(LocalDate publisheDate) {
		this.publisheDate = publisheDate;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Books [bId=" + bId + ", bPrice=" + bPrice + ", bName=" + bName + ", publisheDate=" + publisheDate
				+ ", author=" + author + "]";
	}
	
	
	

}
