import java.lang.*;
import javax.ws.rs.client.*;
import org.glassfish.jersey.client.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.MediaType;
import java.net.URI;
import java.net.URISyntaxException;
import javax.xml.bind.*;
import javax.ws.rs.core.MediaType;

public class Clnt 
{	
		public static void main(String[] args)
		{
			ClientConfig cliConf = new ClientConfig();
			Client client = ClientBuilder.newClient(cliConf);
			URI uri=null;
            
            try 
            {http://habib-virtualbox:8080/Analyseur/
				uri = new URI("http://localhost:8080/Analyseur");
			}
            catch (URISyntaxException e)
            {
				System.out.println("URI Syntax Error: " + e.getMessage());
            }
			WebTarget webTarg = client.target(uri);
			Contact contact = new Contact("HABIB", "478");
			
			Response result = webTarg.path("carnet/supprimer").request().put(Entity.entity(contact,MediaType.APPLICATION_JSON),Response.class);
			String s = result.readEntity(String.class);
			System.out.println("le resultat obtenu : "+s);
		}
}