package helloworldmvc;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class HelloWorldMVC {

	public static void main(String args[]) throws Throwable {   
		Controller c=new Controller(new View(), new Model());   
		c.run();  
	} 
}
