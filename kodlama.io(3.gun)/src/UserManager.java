
public class UserManager {
	public void logIn(User user) {
		System.out.println(user.firstName+" "+user.lastName+" isimli kullan�c� sisteme giri� yapt�.");
	}
	
	public void logOut(User user) {
		System.out.println(user.firstName+" "+user.lastName+" isimli kullan�c� sistemden ��k�� yapt�.");
	}
}
