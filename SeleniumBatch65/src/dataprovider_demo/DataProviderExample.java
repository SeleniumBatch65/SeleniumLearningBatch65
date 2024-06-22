package dataprovider_demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider = "testData1")
	public void userDetails(String place, String userName, String phone) {
		//String userDetails[][] = {{"Bhanu","Madanapalli"},{"Bavaji","Piler"},{"Syed","Piler"},{"Lakshmi","Piler"},{"Vijaya","Piler"},{"Anuradha","Bihar"}};
		
		System.out.println(userName +"  " +place+"  "+ phone);
		
		
	}
	
	
	
	@DataProvider
	public Object[][] testData1(){
		
		/*
		String details[][] = new String[6][2];
		details[0][0] = "Bhanu";
		details[0][1] = "Madanapalli";
		
		details[1][0] = "Bavaji";
		details[1][1] = "Piler";
		*/
		String userDetails[][] = {{"Bhanu","Madanapalli","12345677"}};
		
		int x[][] = {{}};
		
		return userDetails;
		
	}
	
	@DataProvider
	public Object[][] testData2(){
		
		/*
		String details[][] = new String[6][2];
		details[0][0] = "Bhanu";
		details[0][1] = "Madanapalli";
		
		details[1][0] = "Bavaji";
		details[1][1] = "Piler";
		*/
		String productDetails[][] = {{"Bhanu","Madanapalli"},{"Bavaji","Piler"},{"Syed","Piler"},{"Lakshmi","Piler"},{"Vijaya","Piler"},{"Anuradha","Bihar"}};
		
		int x[][] = {{}};
		
		return productDetails;
		
	}
	
		
	

}
