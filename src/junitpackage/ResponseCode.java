package junitpackage;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class ResponseCode {
	
	String link="https://www.google.com";
	
	@Test
	public void test() throws Exception
	{
		URI Ob=new URI(link);
		 HttpURLConnection con= (HttpURLConnection)Ob.toURL().openConnection();
		 int code=con.getResponseCode();
		 System.out.println("response code="+code);
	}

}


//how to find link response code
