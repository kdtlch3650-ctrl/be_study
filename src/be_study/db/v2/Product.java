package be_study.db.v2;

//DTO (Data Transfer Object)

//    	 	ProductDTO
public class Product {

	int pCode;  //p_code
	String pName; //p_name
	int pPrice; //p_price
	
	public int getpCode() {
		return pCode;
	}
	public void setpCode(int pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [pCode=" + pCode + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
	
	
}
