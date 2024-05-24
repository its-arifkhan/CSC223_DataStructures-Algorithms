/**
*
* Student name:  Mohammad Arif Khogiani
* Completion date: 05-23-2024
*
* TriangleTest.txt: the template file of TriangleTest.java
* Student tasks: 
* - Write 20 JUnit test cases for Triangle class 
* - Then run this file on the command line with the jar files provided
*
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class MohammadArifKhogianiTriangleTest {

	@Test
	public void test1(){
		Triangle triangle = new Triangle("12","12","12");
		assertEquals("This is an equilateral triangle. ",triangle.triangleType());	
	}//end test
	
	@Test
	public void test2(){
		Triangle triangle = new Triangle("3","3","5");
		assertEquals("This is an isosceles triangle. ",triangle.triangleType());
	 	
	}//end test
	
	@Test
	public void test3(){
		Triangle triangle = new Triangle("4","5","6");
		assertEquals("This is a scalene triangle. ", triangle.triangleType());
		// expected value: "This is a scalene triangle. "  
		// value returned from the method: triangle.triangleType() 
	}//end test
	
    @Test
    public void test4(){
        Triangle triangle = new Triangle("5","5","5");
        assertEquals("This is an equilateral triangle. ", triangle.triangleType());
    }//end test
	
    @Test
    public void test5(){
        Triangle triangle = new Triangle("-2","3","4");
        assertEquals("At least one side is negative!\nNot a valid triangle!\n", triangle.triangleType());
    }//end test
	
    @Test
    public void test6(){
        Triangle triangle = new Triangle("a","b","c");
        assertEquals("The side 1 is not an integer number.\n\nThe side 2 is not an integer number.\n\nThe side 3 is not an integer number.\n\nNot a valid triangle!\n", triangle.triangleType());
    }//end test
	
    @Test
    public void test7(){
        Triangle triangle = new Triangle("0","0","0");
        assertEquals("Not a valid triangle!\n", triangle.triangleType());
    }//end test
	
    @Test
    public void test8(){
        Triangle triangle = new Triangle("a","2","4");
        assertEquals("The side 1 is not an integer number.\n\nNot a valid triangle!\n", triangle.triangleType());
    }//end test
    
    @Test
    public void test9(){
        Triangle triangle = new Triangle("0","0","0");
        assertEquals("Not a valid triangle!\n", triangle.triangleType());
    }//end test
    
    @Test
    public void test10(){
        Triangle triangle = new Triangle("0","0","1");
        assertEquals("Not a valid triangle!\n", triangle.triangleType());
    }//end test
	
    @Test
    public void test11(){
        Triangle triangle = new Triangle("0","1","1");
        assertEquals("Not a valid triangle!\n", triangle.triangleType());
    }//end test
    
    @Test
    public void test12(){
        Triangle triangle = new Triangle("-2","3","4");
        assertEquals("At least one side is negative!\nNot a valid triangle!\n", triangle.triangleType());
    }//end test
    
    @Test
    public void test13(){
        Triangle triangle = new Triangle("2","-3","4");
        assertEquals("At least one side is negative!\nNot a valid triangle!\n", triangle.triangleType());
    }//end test
	
    @Test
    public void test14(){
        Triangle triangle = new Triangle("2.5","3.5","4.5");
        assertEquals("The side 1 is not an integer number.\n\nThe side 2 is not an integer number.\n\nThe side 3 is not an integer number.\n\nNot a valid triangle!\n", triangle.triangleType());
    }//end test
    
    @Test
    public void test15(){
        Triangle triangle = new Triangle("2147483647","2147483647","2147483647");
        assertEquals("Not a valid triangle!\nThis triangle is too big.\n", triangle.triangleType());
    }//end test
    
    @Test
    public void test16(){
        Triangle triangle = new Triangle("1","1","3");
        assertEquals("Not a valid triangle!\n", triangle.triangleType());
    }//end test
    
    @Test
    public void test17(){
        Triangle triangle = new Triangle("1","2","5");
        assertEquals("Not a valid triangle!\n", triangle.triangleType());
    }//end test
    
    @Test
    public void test18(){
        Triangle triangle = new Triangle("-1","-2","-3");
        assertEquals("At least one side is negative!\nNot a valid triangle!\n", triangle.triangleType());
    }//end test
    
    @Test
    public void test19(){
        Triangle triangle = new Triangle("1000","5","5");
        assertEquals("Not a valid triangle!\nThis triangle is too big.\n", triangle.triangleType());
    }//end test
    
    @Test
    public void test20(){
        Triangle triangle = new Triangle("-1","2","-3");
        assertEquals("At least one side is negative!\nNot a valid triangle!\n", triangle.triangleType());
    }//end test

}
