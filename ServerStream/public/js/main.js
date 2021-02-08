$(function(){
    function loadSongs() {
        $.ajax({
            url : '/musiques'
        }).done(function(musiques){
            var liste = $('.liste-de-musiques');
            liste.empty();
            musiques.forEach(function(musique) {
                var NouvelElement = $('<li class="musique">'+musique.nom+'</li>');
                NouvelElement.appendTo(liste);
            })
        }).fail(function() {
            alert('Aucunes musique charger :(');
        })
    }
    loadSongs();
});