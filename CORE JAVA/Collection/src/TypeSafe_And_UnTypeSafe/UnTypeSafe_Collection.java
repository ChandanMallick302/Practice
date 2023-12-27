package TypeSafe_And_UnTypeSafe;

import java.util.ArrayList;
import java.util.List;

public class UnTypeSafe_Collection {

	public static void main(String[] args) {
		List name = new ArrayList();
		name.add("dsds");
		// Because of String un type safe you can use other the data type also
		name.add(564); 
		name.add(45.1510);
		name.add(true);

		System.out.println(name);
		
		//TypeCasting
		int str = (int) name.get(2);//un-boxing type-casting
		System.out.println(str);
		
	}
}