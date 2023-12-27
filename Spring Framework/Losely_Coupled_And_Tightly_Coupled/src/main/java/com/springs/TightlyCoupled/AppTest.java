package com.springs.TightlyCoupled;

/**
 * Hello world!
 *
 */
public class AppTest 
{
    public static void main( String[] args )
    {
       Person r=new Ram();
       r.eat();
       r.run();
       
       Person s=new Shyam();
       s.eat();
       s.run();
       
//       Here ram & sham are not dependent with each other for accessing method
       
       // the example of loosely coupled are interface and Spring IOC
    }
}
