import sys, Ice
import mp3
 
with Ice.initialize(sys.argv) as communicator:
    base = communicator.stringToProxy("SimplePrinter:default -p 10000") #pour un client distant : tcp -h 10.0.2.15
    printer = mp3.PrinterPrx.checkedCast(base)
    if not printer:
        raise RuntimeError("Invalid proxy")
    #recherche par titre
    print (printer.SearchByTitle("paradis"))
    #ajoute un morceau a la BDD
    printer.addMusique(mp3.Musique("song 1", "artist 1", "album1", "year", "path"))
    #supprime un morceau de la BDD
    printer.removeMusique("a")
    
