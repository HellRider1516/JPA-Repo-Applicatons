package in.mahesh.bindings;

public class Books {
	private String bName;
	private String bAuthor;
	private Double bPrice;
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	public Double getbPrice() {
		return bPrice;
	}
	public void setbPrice(Double bPrice) {
		this.bPrice = bPrice;
	}
	@Override
	public String toString() {
		return "Books [bName=" + bName + ", bAuthor=" + bAuthor + ", bPrice=" + bPrice + "]";
	}
	
	

}
