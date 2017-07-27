package tr.org.linux.kamp.banka;

public class Test {
	public static void main(String[] args) {
		User user=new User("2","123");
		ATM atm=new ATM(user);
		generate(atm);
		print(atm);
	}
	
	public static void generate(ATM atm) {
		User u;
		for(int i=0;i<atm.getUsers().length ;i++) {
			u = new User(Integer.toString(i+1), Integer.toString(i+1),100);
			atm.getUsers()[i]=u;
		
		}
	}
	
	public static void print(ATM atm) {
		System.out.println("-------Costumers:-------- ");
		for(int i=0;i<atm.getUsers().length ;i++) {
		
		System.out.println(atm.getUsers()[i].getCardid() + " "+  atm.getUsers()[i].getDeposit());
	
		}	
	}
}
