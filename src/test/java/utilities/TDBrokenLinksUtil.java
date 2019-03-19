package utilities;

import java.net.HttpURLConnection;
import java.net.URL;

public class TDBrokenLinksUtil{
	
	public static void verifyingActiveLinks(String linkUrl) {
		
		try 
		{
			URL url = new URL(linkUrl);
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(3000);
			httpURLConnect.connect();

			if(httpURLConnect.getResponseCode()==200) {
				System.out.println(linkUrl + "-" + httpURLConnect.getResponseMessage());
				
			}
			
			if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + "-" + httpURLConnect.getResponseMessage() + "-" + HttpURLConnection.HTTP_NOT_FOUND);
				
				
			}
			
			
			
			
			
		}
		catch (Exception e) {
			
		}
		
		
	}
	
	

}
