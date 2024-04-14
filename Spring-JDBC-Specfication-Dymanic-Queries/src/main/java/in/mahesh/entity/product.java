package in.mahesh.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pId;
	private String catagory;
	private String pBrand;
	private Double price;
	private LocalDate mf;
	public product( String catagory, String pBrand, Double price, LocalDate mf) {
		super();
		this.catagory = catagory;
		this.pBrand = pBrand;
		this.price = price;
		this.mf = mf;
	}
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public String getpBrand() {
		return pBrand;
	}
	public void setpBrand(String pBrand) {
		this.pBrand = pBrand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getMf() {
		return mf;
	}
	public void setMf(LocalDate mf) {
		this.mf = mf;
	}
	@Override
	public String toString() {
		return "product [pId=" + pId + ", catagory=" + catagory + ", pBrand=" + pBrand + ", price=" + price + ", mf="
				+ mf + "]";
	}
	
	
	

}
