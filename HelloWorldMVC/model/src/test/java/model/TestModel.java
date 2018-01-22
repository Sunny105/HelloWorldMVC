package model;

import org.testng.Assert;
import org.testng.annotations.Test;

import helloworldmvc.model.Model;

public class TestModel {
	
	@Test  
	public void testGetMessage() throws Throwable  {   
		Model model=new Model();   
		String m=model.getMessage();   
		Assert.assertNotNull(m); 
		Assert.assertEquals(m, "Hello World !"); 
	}
}
