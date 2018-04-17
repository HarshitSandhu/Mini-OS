public class Admin extends User {
 
	/**
	 * @param un Username
	 * @param pw Password
	 */
	public Admin(String un, String pw) {
		super(un, pw);
	}
 
	@Override
	public boolean hasPermission1() {
		return true;
	}
	@Override
	public boolean hasPermission2() {
		return true;
	}
	@Override
	public boolean hasPermission3() {
		return true;
	}
 
}
