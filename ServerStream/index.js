var express = require('express');
var app = express();
var path = require('path');
var fs = require('fs');
var mediaserver = require('mediaserver');

app.use(express.static('public'));
app.use('/jquery',express.static(path.join(__dirname,'node_modules','jquery','dist')));

app.get('/',function(req, res){
    res.sendFile(path.join(__dirname,'/index.html'));
});

app.get('/musiques',function(req, res){
    fs.readFile(path.join(__dirname,'musiques.json'),'utf8',function(err, musiques) {
        if(err) throw err;
        res.json(JSON.parse(musiques));
    })
});

app.get('/musiques/:nom', function(req, res) {
    var musique = path.join(__dirname,'musiques', req.params.nom);
    mediaserver.pipe(req,res,musique);
})

app.listen(3000,function(){
    console.log('Application En cours d\'execution');
});