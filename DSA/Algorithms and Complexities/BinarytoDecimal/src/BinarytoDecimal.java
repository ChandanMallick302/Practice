public class BinarytoDecimal {

	public int covertingToDecimal(String binary) {
		int conversion=0;
		int result=0;
		for(int i=1;i<=binary.length();i++) {
			if(binary.charAt(binary.length()-i)=='1') 
			result+=conversion;
			conversion*=2;
		}
		return result;
	}
	public int covertingToDecimalAlt(String binary) {
		int result=0;
		for(int i=1;i<=binary.length();i++) {
			if(binary.charAt(binary.length()-i)=='1') 
			result+=Math.pow(2, i-1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		BinarytoDecimal binaryToDecimal=new BinarytoDecimal();
		System.out.println(binaryToDecimal.covertingToDecimal("1010"));
		System.out.println(binaryToDecimal.covertingToDecimalAlt("1010"));

	}

}
