package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Model implements IModel {
	
	public String getMessage() throws Throwable {
		String chemin = Model.class.getResource("message.txt").getFile();
		InputStream flux=new FileInputStream("test.txt"); 
		InputStreamReader lecture=new InputStreamReader(flux);
		BufferedReader buff=new BufferedReader(lecture);
		String ligne;
		String res = "";
		while ((ligne=buff.readLine())!=null){
			res+= ligne;
		}
		buff.close();
		return res;
	}
}
