HABIB Mohamed.

## langage de programmation:

Le serveur a été fait en Java.

Le client en Python.

L'interface Ice : Printer.ice.

Base de données : Mysql.

Environnement de travail : Linux Ubuntu 16.04

1. ## Le travail réalisé : 
    Développement d'une application permettant de gérer une base de données de musiques. 
L'application est composée d'un client qui envoi des demande de recherche,jout ...etc et d'un serveur qui gère ces demandes.

    1. ### Serveur:
        Côté Serveur on a différentes classe :

        **Musique.java** : c'est un lasse basique qui défini les différents attribut d'une musique(Titre,Artiste...) et des setteurs et getteurs. 
        
        **ListMusiques.java** : cette classe contient les différentes méthodes qu'on va utiliser.

        Connexion() : pour se connecter a la base de données,celle-si il faudra la modifié pour qu'elle marche(créer une bases de données Musiques avec une table musique qui conient les différents attributs Titre, Artiste, Album, AnneeSortie, Path et changer le mdpde la BDD).

        chargerMusique() : va à la base de données et récupere les musiques.

        addMusique() : permet d'ajouter une musique à la base de données.
        
        SearchBy...() : permet la recheche de musiques par artiste, titre, album ou année de sortie.

        removeMusique() : permet la suppression d'unemusique via un titre.

        Start() : pour demarer le streaming.

        musiquesList() : affiche la liste de musiques.

        **Server.java** : cette classe permet de demarer le serveur.

        **Printer.ice** : c'est l'interface qui va permettre la communication entre le client et le serveur.
    
    2. ### Client:
        il y'a juste une classe **client.py** qui permet de faire les tests et l'interface slice (**Printer.ice**).
    



1. ## Les difficultés rencontrées :
   J'ai trouvé des difficulté au niveau du fonctionnement de Ice, mais avec la documentation j'ai pu comprendre comment ça fonctionne.

2. ## Les perspectives d'amélioration :
   En ce qui concerne les amélioration je pense qu'il faudra ajouter une interface graphique côté client pour faciliter l'utilisation.

3. ## Réponses aux questions : 

    1. Y-a-t-il un intérêt à passer par un méta-serveur ? Que faire, dans ce cas, pour limiter le trafic sur le réseau ?

    Les clients ont souvent besoin de diffuser des informations à plusieurs destinataires, ainsi la mise à jour est difficile en mode synchrone. C'est pour ça on a utilisé le méta-serveur pour palier a ces difficultés car il se repose sur une communication asynchrone, ainsi il agit comme un médiateur entre les clients (publisher) et les serveurs(les subscribers). 



    2. Est ce qu'inclure la vidéo change quelque chose à l'application développée ?
   
    Non ça change rien car c'est même mode de fonctionnement.

    3. Quelle stratégie d'enregistrement des serveurs ? Comment faire pour découvrir à chaud de nouveaux serveurs ? Pour sécuriser l'accès aux serveurs ?

    Pour securiser l'accés aux serveurs il faudra placer des firewall.