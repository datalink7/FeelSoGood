package spring.day0424.ex5;

public class Cart {
	private Shop shop;
	private int cnt;
	
	Cart(Shop shop)
	{
		this.shop=shop;
	}
	
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	public void wirte()
	{
		System.out.println("** Shop 정보 **");
		System.out.println("상품 : "+shop.getSangpum());
		System.out.println("단가 : "+shop.getPrice());
		System.out.println("구입갯수 : "+cnt);
	}
}
