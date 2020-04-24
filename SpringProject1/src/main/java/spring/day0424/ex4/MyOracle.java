package spring.day0424.ex4;

public class MyOracle {
	private String driver;
	private String url;
	private String username;
	private String password;
	
	public MyOracle(String driver, String url) {
		super();
		this.driver = driver;
		this.url = url;
	}

	@Override
	public String toString() {
		return "MyOracle [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ "]";
	}

	
	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
