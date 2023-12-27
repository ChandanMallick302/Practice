package String;

import java.util.Arrays;
import java.util.stream.Stream;

public class String_ {

	public static void main(String[] args) {
		String str = new String("Welcome");

		// chatAt()
		System.out.println(str.charAt(1));// e

		// compareTo()
		System.out.println(str.compareTo("Hello"));// 15

		// compareToIgnoreCase
		System.out.println(str.compareToIgnoreCase("HELLO")); // 15

		// concat()
		System.out.println(str.concat(" World!!")); // Welcome World!!

		// contains()
		System.out.println(str.contains("Hello"));// false

		// contentEqual()
		System.out.println(str.contentEquals("Welcome")); // true

       // endWith()
		System.out.println(str.endsWith("e")); // true
		
		//equals()
		System.out.println(str.equals("welcome")); // false
		
		//equalsIgnoreCase()
		System.out.println(str.equalsIgnoreCase("welcome")); //true
		
		//format()
		System.out.println(str.format("name is %30s", str, args));
		System.out.println(str.format("value is %f",32.334340, args));
		System.out.println(str.format("value is %32.12f",32.33434, args));
		System.out.println(str.format("%8s%10d", str,1212, args));
		
		//indexOf()
		System.out.println(str.indexOf("l")); //2
		
		//valueOf()
		System.out.println(str.valueOf(str)); //Welcome
		
		//lastIndexOf()
		System.out.println(str.lastIndexOf("e")); //6
		
		//length()
		System.out.println(str.length());//7
		
		//replace()
		System.out.println(str.replace('e', 'f'));//Wflcomf
		
		//replaceFirst()
		System.out.println(str.replaceFirst( "W", "*"));// *elcome
		
		//replaceAll()
		System.out.println(str.replaceAll("Wel", "Hel"));//Helcome
		
		//split()
		String str2="Hello World !!";
		System.out.println(Arrays.toString(str2.split(" ",3))); //[Hello, World, !!]
		
        //startWith()
		System.out.println(str.startsWith("W"));//TRUE
		
		//endsWith()
		System.out.println(str.endsWith("e"));//TRUE
		
		//subSequence()
		System.out.println(str.subSequence(0, 6));//Welcom
		
		//subString()
		System.out.println(str.substring(2));//lcome
		
		//toLowerCase()
		System.out.println(str.toLowerCase()); //welcome
		
		//toUpperCase
		System.out.println(str.toUpperCase()); //WELCOME
		
		//toString()
		System.out.println(str.toString()); //Welcome
		
		//trim()
		String str3=" Hello   Brother ";
		System.out.println(str3);       // Hello   Brother 
		System.out.println(str3.trim());//Hello   Brother
		
		//isEmpty()
		if(str.isEmpty()) {
			System.out.println("Field is empty");
		}
		else {
			System.out.println("Field is not empty");//Field is not empty
		}
		
		//isBlank()
		String str4="  ";
		System.out.println(str4.isBlank());//true
		
		//lines()
		String str5
        = " Geeks \n For \n Geeks \r Technical \r\n content \r writer \n Internship";
		Stream<String> lines=str5.lines();
		lines.forEach(System.out::println);
		
		//repeat(n)
		System.out.println(str.repeat(2));//WelcomeWelcome
		
		//strip()
		String str6=" # Hello World !! # ";
		System.out.println(str6);                // # Hello World !! #
		System.out.println(str6.strip());        //# Hello World !! #
		
		//stripLeading()
		System.out.println(str6.stripLeading()); //# Hello World !! # 
		
		//stripTrailing()
		System.out.println(str6.stripTrailing());// # Hello World !! #
		
		//stripIndent()
		System.out.println(str6.stripIndent());  //# Hello World !! #
		
	}

}
