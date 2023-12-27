package Types_of_Aarray;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
//		                        Row Column 
		String a[][]= new String[2][2];
		a[0][0]="sas";
		a[0][0]="sasx";
		a[1][0]="sasda";		
		a[1][1]="daj";
		System.out.println(a[1][1]);
		
		//or
//		                 00    01      10     11
		String b[][]= {{"sas","dds"},{"daj","ddde"}};
		System.out.println(b[1][0]);
	}

}
