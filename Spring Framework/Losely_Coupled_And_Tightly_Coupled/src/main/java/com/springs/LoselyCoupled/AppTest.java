package com.springs.LoselyCoupled;

/**
 * Hello world!
 *
 */
public class AppTest 
{
    public static void main( String[] args )
    {
        Journey j=new Journey();
        j.c.travel();
        
//      here to use travel method in Travel Class the Car Object need to create
        // And if need changes in journey travel method then car tavel method need to chage
        
        // so it the example of tightly coupled
    }
}
