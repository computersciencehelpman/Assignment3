
public class UserPOJO {
	
	private String userName;
	private String password;
	private String name;
	
	public String getUsername() {
		return userName;
	}
	
	public void setUsername(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "UserPOJO [userName=" + userName + ", password=" + password + ", name=" + name + "]";
	}
}
