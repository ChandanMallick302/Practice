package Custom_Exception;

public class Test1_with_handing {

	public static int age = 18;

	public static void main(String[] args) throws AgeInvalidException {
//		AgeInvalidException ae = new AgeInvalidException("Voter is not eligible to vote");
//		if (age > 18) {
//			System.out.println("Voter is eligible to vote");
//		} else {
//			System.out.println(ae.getMessage());
//		}
			if (age > 18) {
				System.out.println("Voter is eligible to vote");
			} else {
				throw new AgeInvalidException("Voter is not eligible to vote");
			}
	}
}