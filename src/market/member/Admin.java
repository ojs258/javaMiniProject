package market.member;

// 생성자 만들어 주기 Admin(String id, String password)
public class Admin extends Person {
	private final String id = "admin";
	private final String  password = "-1";

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}
}