package Analyseur;
import javax.ws.rs.*;
import java.net.URI;
import javax.ws.rs.core.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Path("/analyseRequete")
public class Analyse
{
	@Path("/{speech}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Action requete(@PathParam("speech") String speech)
	{
		List<String> actions= Arrays.asList("augmente","baisse","joue","jouer","pause","reprendre","continue","stopper","stoppé","supprimer","supprime","écouter","arrête","lance");
		String[] s=speech.split(" ");
		Action a = new Action();
		String tmp = "";
			
		if(s.length>0)
		{
			
			int i=0;
			
			while(i<s.length)
			{
				if(!actions.contains(s[i]))
				{
					tmp += s[i]+" ";
					i++;
				}
				else
				break;
			}
			if(i<s.length)
				tmp += s[i];
			

			if(i < s.length)
			{
				switch(s[i])
				{
					case "augmente":
						if(s.length > i + 1)
						{
							a.setAction("augmente");
							a.setMusique(speech.substring(tmp.length()+1,speech.length()));
						}
						break;
							
					case "baisse":
						if(s.length > i + 1)
						{
							a.setAction("baisse");
							a.setMusique(speech.substring(tmp.length()+1,speech.length()));
						}
						break;
						
					case "jouer":
						if(s.length > i + 1)
						{
							a.setAction("jouer");
							a.setMusique(speech.substring(tmp.length()+1,speech.length()));
						}
						break;
					
					case "joue":
						if(s.length > i + 1)
						{
							a.setAction("jouer");
							a.setMusique(speech.substring(tmp.length()+1,speech.length()));
						}
						break;
							
					case "écouter":
						if(s.length > i + 1)
						{
							a.setAction("jouer");
							a.setMusique(speech.substring(tmp.length()+1,speech.length()));
						}
						break;
							
					case "lance":
						if(s.length > i + 1)
						{
							a.setAction("jouer");
							a.setMusique(speech.substring(tmp.length()+1,speech.length()));
						}
						break;
						
					case "supprime":
						if(s.length > i + 1)
						{
							a.setAction("supprimer");
							a.setMusique(speech.substring(tmp.length()+1,speech.length()));
						}
						break;
							
					case "supprimer":
						if(s.length > i + 1)
						{
							a.setAction("supprimer");
							a.setMusique(speech.substring(tmp.length()+1,speech.length()));
						}
						break;
							
					case "pause":
						if(s.length > i)
						{
							a.setAction("pause");
							a.setMusique("current");
						}
						break;
								
					case "reprendre":
						if(s.length > i)
						{
							a.setAction("reprendre");
							a.setMusique("current");
						}
						break;

					case "continue":
						if(s.length > i)
						{
							a.setAction("reprendre");
							a.setMusique("current");
						}
						break;
								
					case "stopper":
						if(s.length > i)
						{
							a.setAction("stopper");
							a.setMusique("current");
						}
						break;
						
					case "stoppé":
						if(s.length > i)
						{
							a.setAction("stopper");
							a.setMusique("current");
						}
						break;

					case "arrête":
						if(s.length > i)
						{
							a.setAction("stopper");
							a.setMusique("current");
						}
						break;							
				}
			}
			
		}
		return a;
	}
}
