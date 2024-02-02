package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	

	 @Test
	    public void test_Case1() {
	        int a = 1;
	        int b = 2;
	        int c = 3;
	        triangle.classifyTriangle(a, b, c);
	        String result = triangle.get_type().toString();
	        String expected =Triangle_Types.Nottriangle.toString();
	        org.junit.Assert.assertEquals(expected, result.toString());

	   
	    }

	    @Test
	    public void test_Case2() {
	        int a = 2;
	        int b = 1;
	        int c = 1;
	        triangle.classifyTriangle(a, b, c);
	        String result = triangle.get_type().toString();
	        String expected =Triangle_Types.Nottriangle.toString();
	        org.junit.Assert.assertEquals(expected, result.toString());

	    }
	    @Test
	    public void test_Case3() {
	        int a = 3;
	        int b = 6;
	        int c = 3;
	        triangle.classifyTriangle(a, b, c);
	        String result = triangle.get_type().toString();
	        String expected =Triangle_Types.Nottriangle.toString();
	        org.junit.Assert.assertEquals(expected, result.toString());

	    }
	    @Test
	    public void test_Case4() {
	        int a = 2;
	        int b = 2;
	        int c = 4;
	        triangle.classifyTriangle(a, b, c);
	        String result = triangle.get_type().toString();
	        String expected =Triangle_Types.Nottriangle.toString();
	        org.junit.Assert.assertEquals(expected, result.toString());

	    }
	 
	    @Test
	    public void test_Case5() {
	        int a = 2;
	        int b = 3;
	        int c = 4;
	        triangle.classifyTriangle(a, b, c);
	        String result = triangle.get_type().toString();
	        String expected =Triangle_Types.Scalene.toString();
	        org.junit.Assert.assertEquals(expected, result.toString());

	    }
	    @Test
	    public void test_Case6() {
	        int a = 1;
	        int b = 3;
	        int c = 3;
	        triangle.classifyTriangle(a, b, c);
	        String result = triangle.get_type().toString();
	        String expected =Triangle_Types.isosceles.toString();
	        org.junit.Assert.assertEquals(expected, result.toString());

	    }
	    @Test
	    public void test_Case7() {
	        int a = 5;
	        int b = 2;
	        int c = 5;
	        triangle.classifyTriangle(a, b, c);
	        String result = triangle.get_type().toString();
	        String expected =Triangle_Types.isosceles.toString();
	        org.junit.Assert.assertEquals(expected, result.toString());

	    }
	    @Test
	    public void test_Case8() {
	        int a = 2;
	        int b = 2;
	        int c = 1;
	        triangle.classifyTriangle(a, b, c);
	        String result = triangle.get_type().toString();
	        String expected =Triangle_Types.isosceles.toString();
	        org.junit.Assert.assertEquals(expected, result.toString());

	    }
	    @Test
	    public void test_Case9() {
	        int a = 3;
	        int b = 3;
	        int c = 3;
	        triangle.classifyTriangle(a, b, c);
	        String result = triangle.get_type().toString();
	        String expected =Triangle_Types.equilateral.toString();
	        org.junit.Assert.assertEquals(expected, result.toString());

	    }
	    
	    

	
}  