import java.io.IOException;
import java.util.Arrays;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.Page;
import com.restfb.types.User;


public class FbClient {
	public void restFbClient()
	{
		System.out.println("Called function restFbClient");
	    String HarishAccessToken="";
		HarishAccessToken="CAACEdEose0cBAFvlELvI539S6WJeU60hiLGontjs8UfbObqTTjZBbmPHC78yAZCQ2ptczkkd5jlcEqAZCmEvKuZAQ9bAPVgbbeZCStZAFiRj6oUd3ZBXtJ1z2StYqjhL96HetsuNPyiENfWqZBqomPx7WCEfP1j5NrosrckTQ8ZCfeQOKd4q9mHot8hftfTpDTbJJ3zJRJgvY9fEr0ZBu65U0UGpPTX3Ge6pUZD";
		FacebookClient fbclient=new DefaultFacebookClient(HarishAccessToken);
		User user=fbclient.fetchObject("me", User.class);
		System.out.println("User Name:"+user.getName());
		Page page=fbclient.fetchObject("cocacola", Page.class);
		System.out.print("Page Likes"+page.getLikes());
		
		// Getting multiple objects 
		FetchObjectsResults fetchObjectResults=fbclient.fetchObjects(Arrays.asList("me","cocacola"), null, null);
		Connection<User> myFriends =fbclient.fetchConnection("me", User.class);
        
		System.out.println("All my friends"+myFriends.getData());
		
	}
	
	public static void main(String args[])throws IOException{
		
		System.out.print("Calling rest fb client");
		FbClient objFbClient=new FbClient();
		objFbClient.restFbClient();
		
	}

}
