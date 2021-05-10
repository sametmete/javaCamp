
public class UserManager {
	public void logIn(User user) {
		System.out.println(user.firstName+" "+user.lastName+" isimli kullanýcý sisteme giriþ yaptý.");
	}
	
	public void logOut(User user) {
		System.out.println(user.firstName+" "+user.lastName+" isimli kullanýcý sistemden çýkýþ yaptý.");
	}
}
