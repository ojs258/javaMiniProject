package market.member;

// getter의 리턴타입 으로 필드타입 유추 후 선언, this 키워드 빠진 setter들 수정해주기
public class Person {
	private String name;
	private int phone;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}