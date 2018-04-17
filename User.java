public class User {
	protected String userName;
	protected String password;
 
	/**
	 * @param un Username
	 * @param pw Password
	 */
	public User(String un, String pw) {
		this.userName = un;
		this.password = pw;
	}
 
	/**
	 * @param un Username
	 * @param pw Password
	 * @return <b>true</b> if correct account, <b>false</b> otherwise
	 */
	public boolean authenticate(String un, String pw) {
		return un.equals(this.userName) && pw.equals(this.password);
	}
 
	/**
	 * @return true
	 */
	public boolean hasPermission1() {
		return true;
	}
	/**
	 * @return false
	 */
	public boolean hasPermission2() {
		return false;
	}
	/**
	 * @return false
	 */
	public boolean hasPermission3() {
		return false;
	}
}
