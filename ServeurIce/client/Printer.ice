module mp3

{

    class Musique
	{
	    string Titre;
	    string Artiste;
	    string Album;
	    string AnneeSortie;
	    string Path;
    }	

	sequence<Musique> songList;

    interface Printer
    {
        bool addMusique(Musique musique);
        songList SearchByTitle(string Titre);
        songList SearchByArtist(string Artiste);
        songList SearchByAlbum(string Album);
        songList SearchByAnnee(string AnneeSortie);
        bool removeMusique(string Titre);
		songList getMusiques();
    }
}
 