package Custom_Exception;

public class Test2_without_handling {

	public static int age = 18;

	public static void main(String[] args)throws AgeInvalidException {
//		AgeInvalidException ae = new AgeInvalidException("Voter is not eligible to vote");
//		if (age > 18) {
//			System.out.println("Voter is eligible to vote");
//		} else {
//			System.out.println(ae.getMessage());
//		}
		try {
			if (age > 18) {
				System.out.println("Voter is eligible to vote");
			} else {
				throw new AgeInvalidException("Voter is not eligible to vote");
			}
		} catch (AgeInvalidException a) {
			System.out.println(a.getMessage());
		}
	}
}