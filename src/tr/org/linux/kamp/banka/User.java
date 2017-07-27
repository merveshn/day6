package tr.org.linux.kamp.banka;

public class User {

	private String cardid;
	private String password;
	private int deposit;
	
	

	public User(String cardid, String password, int deposit) {
		super();
		this.cardid = cardid;
		this.password = password;
		this.deposit = deposit;
	}

	public User( String cardid, String password) {
		this.cardid = cardid;
		this.password = password;
	}
	
	public String getCardid() {
		return cardid;
	}
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	
	
	
}
