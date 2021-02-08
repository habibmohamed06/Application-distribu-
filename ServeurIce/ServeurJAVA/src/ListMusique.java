import java.net.*;
import java.io.*;
import java.net.InetAddress;
import java.util.*;
import java.util.List;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.zeroc.Ice.Current;
import mp3.Musique;

public class ListMusique implements mp3.Printer
{
    //La liste qui va contenir la liste de musique 
     private ArrayList<Musique> musiques;

    public ListMusique()
    {
        this.musiques = new ArrayList<Musique>();
       
    }

    public Connection Connexion()
    {
        Connection con=null;
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        con = DriverManager.getConnection("jdbc:mysql://localhost/Musiques?user=root&password=root&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
    

    //charger la liste de musique sur la BDD
    public void chargerMusique()
    {
        try
        {
            Connection con = Connexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Musique");
            while(rs.next())
                musiques.add(new Musique(rs.getString("Titre"),rs.getString("Artiste"),rs.getString("Album"),rs.getString("AnneeSortie"),rs.getString("Path")));
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public Musique[] getMusiques(Current current) {
        return musiques.toArray(new Musique[0]);
    }
    
    public boolean isEmpty()
    {
        return musiques.isEmpty();
    }
    
    public boolean addMusique(Musique musique,Current current) 
    {
        try
        {
            Connection con = Connexion();
            Statement st = con.createStatement();

            // the mysql insert statement
            String query = " insert into Musique (Titre, Artiste, Album, AnneeSortie, Path)"
                + " values (?, ?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, musique.Titre);
            preparedStmt.setString(2, musique.Artiste);
            preparedStmt.setString(3, musique.Album);
            preparedStmt.setString(4, musique.AnneeSortie);
            preparedStmt.setString(5, musique.Path);

            // execute the preparedstatement
            preparedStmt.execute();
            this.musiques.add(musique);
            con.close();
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return false;
    }
    
    public Musique[] SearchByTitle(String Titre, Current current)
    {
        ArrayList<Musique> songlisttmp = new ArrayList<>();
        try
        {
            for(Musique musique : musiques)
            {
                if(musique.Titre.equalsIgnoreCase(Titre))
                songlisttmp.add(musique);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return songlisttmp.toArray(new Musique[0]);
    }

    public Musique[] SearchByArtist(String Artiste, Current current)
    {
        ArrayList<Musique> songlisttmp = new ArrayList<>();
        try
        {
            for(Musique musique : musiques)
            {
                if(musique.Artiste.equalsIgnoreCase(Artiste))
                songlisttmp.add(musique);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return songlisttmp.toArray(new Musique[0]);
    }

    public Musique[] SearchByAlbum(String Album, Current current)
    {
        ArrayList<Musique> songlisttmp = new ArrayList<>();
        try
        {
            for(Musique musique : musiques)
            {
                if(musique.Album.equalsIgnoreCase(Album))
                songlisttmp.add(musique);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return songlisttmp.toArray(new Musique[0]);
    }

    public Musique[] SearchByAnnee(String AnneeSortie, Current current)
    {
        ArrayList<Musique> songlisttmp = new ArrayList<>();
        try
        {
            for(Musique musique : musiques)
            {
                if(musique.AnneeSortie.equalsIgnoreCase(AnneeSortie))
                songlisttmp.add(musique);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return songlisttmp.toArray(new Musique[0]);
    }
    
    public boolean removeMusique(String Titre, Current current)
    {
        try
        {
            Connection con = Connexion();
            Statement st = con.createStatement();
            String query = "delete from Musique where Titre = ?";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, Titre);
            preparedStmt.execute();
            con.close();
            for(Musique musique : musiques)
                if(musique.Titre.equalsIgnoreCase(Titre))
                {
                    this.musiques.remove(musique);
                    return true;
                }
                return false;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "";
        for(Musique musique : musiques)
            s += musique.toString() + System.getProperty("line.separator");
        System.out.println(s);
        return s;
    }

}
