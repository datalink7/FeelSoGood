package spring.day0424.ex5;

public class Shop {
	private String sangpum;
	private int price;
	
	Shop(String sangpum) {
		this.sangpum = sangpum;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getSangpum() {
		return sangpum;
	}
	
	
	
}
