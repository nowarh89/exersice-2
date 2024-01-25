package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	@Test
  //שווה צלעות
	public void equilateralTriangle(){
        int a = 8;
        int b = 8;
        int c=8;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        org.junit.Assert.assertEquals(expected, result.toString());
    }
	@Test
	//שונה צלעות
	public void check_Scalene(){
        int a = 3;
        int b = 4;
        int c=5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        org.junit.Assert.assertEquals(expected, result.toString());
    }
	
	@Test
	//שווה שוקיים
	public void check_isosceles(){
		int a=8;
		int b=5;
		int c=8;
		triangle.classifyTriangle(a, b, c);
		String expected=Triangle_Types.isosceles.toString();
		String result=triangle.get_type().toString();
        org.junit.Assert.assertEquals(expected, result.toString());		
	}
	@Test
	//תקינות משולש
	public void check_IsTriangle(){
		int a=3;
		int b=5;
		int c=8;
		triangle.classifyTriangle(a, b, c);
		String expected=Triangle_Types.Nottriangle.toString();
		String result=triangle.get_type().toString();
        org.junit.Assert.assertEquals(expected, result.toString());		
	}
}  