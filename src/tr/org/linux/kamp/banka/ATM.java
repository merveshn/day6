package tr.org.linux.kamp.banka;

public class ATM {
	private User user;
	private User[] users = new User[3];
	private boolean isLogin=false;
	


	public ATM(User user) {
	this.user=user;
	}


	public User[] getUsers() {
		return users;
	}

	public void setUsers(User[] users) {
		this.users = users;
	}


	public void login(User user) {
		
		for(int i=0;i<users.length;i++) {
			if(user.getCardid().equals(users[i].getCardid())) {
				if(user.getPassword().equals(users[i].getPassword())) {
					isLogin=true;
					this.user=users[i];
					System.out.println("Logged in successfully.");
				}		
				else {
					System.out.println("youve already logged in.");
				}
			}
			else {
				System.out.println("card id or password is wrong.");
			}
		}
	}
	
	
	public void logout() {
		isLogin=false;
	}
	
	
}
