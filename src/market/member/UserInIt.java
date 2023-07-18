package market.member;

public class UserInIt {
	private static User mUser;
	private static User customUser;

	public static void setmUser(User mUser) {
		UserInIt.mUser = mUser;
	}

	public static void init(String name, int phone) {
		mUser = new User(name, phone);
	}

	public static void customInit(String name, int phone) {
		customUser = new User(name, phone);
	}

	public static User getmUser() {
		return mUser;
	}

	public static User getCustomUser() {
		return customUser;
	}
}