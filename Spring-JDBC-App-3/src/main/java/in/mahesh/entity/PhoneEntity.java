package in.mahesh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PhoneEntity {
	@Id
	private Integer pId;
	private Integer price;
	private Integer ram;
	private String os;
	private String pBrand;
	
	
	public PhoneEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhoneEntity(Integer pId, Integer price, Integer ram, String os, String pBrand) {
		super();
		this.pId = pId;
		this.price = price;
		this.ram = ram;
		this.os = os;
		this.pBrand = pBrand;
	}
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getpBrand() {
		return pBrand;
	}
	public void setpBrand(String pBrand) {
		this.pBrand = pBrand;
	}
	@Override
	public String toString() {
		return "PhoneEntity [pId=" + pId + ", price=" + price + ", ram=" + ram + ", os=" + os + ", pBrand=" + pBrand
				+ "]";
	}
	
	

}
