package market.member;

// UserInit에서 호출되는 생성자를 보고 필드타입과 생성자 파라미터 개수를 확인하고 필드 선언 및 생성자 생성
public class User extends Person {
    private String name;
    private int phone;
    private String address;

    public User(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getPhone() {
        return phone;
    }
    @Override
    public String getAddress() {
        return address;
    }
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
}