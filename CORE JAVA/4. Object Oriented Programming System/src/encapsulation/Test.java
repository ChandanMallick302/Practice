package encapsulation;

public class Test {

	public static void main(String[] args) {
		Account acc =new Account();
		acc.setAcc_no(45454545);
		acc.setName("Chandan");
		acc.setEmail("cmallick88@gmail.com");
		acc.setAmount(121332321);
		
		System.out.println(acc.getName()+" " + acc.getEmail()+" "+acc.getAcc_no()+ " "+acc.getAmount()); //Chandan cmallick88@gmail.com 45454545 1.2133232E8
	}

}
