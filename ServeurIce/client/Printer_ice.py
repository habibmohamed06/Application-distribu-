# -*- coding: utf-8 -*-
#
# Copyright (c) ZeroC, Inc. All rights reserved.
#
#
# Ice version 3.7.2
#
# <auto-generated>
#
# Generated from file `Printer.ice'
#
# Warning: do not edit this file.
#
# </auto-generated>
#

from sys import version_info as _version_info_
import Ice, IcePy

# Start of module mp3
_M_mp3 = Ice.openModule('mp3')
__name__ = 'mp3'

if 'Musique' not in _M_mp3.__dict__:
    _M_mp3.Musique = Ice.createTempClass()
    class Musique(Ice.Value):
        def __init__(self, Titre='', Artiste='', Album='', AnneeSortie='', Path=''):
            self.Titre = Titre
            self.Artiste = Artiste
            self.Album = Album
            self.AnneeSortie = AnneeSortie
            self.Path = Path

        def ice_id(self):
            return '::mp3::Musique'

        @staticmethod
        def ice_staticId():
            return '::mp3::Musique'

        def __str__(self):
            return IcePy.stringify(self, _M_mp3._t_Musique)

        __repr__ = __str__

    _M_mp3._t_Musique = IcePy.defineValue('::mp3::Musique', Musique, -1, (), False, False, None, (
        ('Titre', (), IcePy._t_string, False, 0),
        ('Artiste', (), IcePy._t_string, False, 0),
        ('Album', (), IcePy._t_string, False, 0),
        ('AnneeSortie', (), IcePy._t_string, False, 0),
        ('Path', (), IcePy._t_string, False, 0)
    ))
    Musique._ice_type = _M_mp3._t_Musique

    _M_mp3.Musique = Musique
    del Musique

if '_t_songList' not in _M_mp3.__dict__:
    _M_mp3._t_songList = IcePy.defineSequence('::mp3::songList', (), _M_mp3._t_Musique)

_M_mp3._t_Printer = IcePy.defineValue('::mp3::Printer', Ice.Value, -1, (), False, True, None, ())

if 'PrinterPrx' not in _M_mp3.__dict__:
    _M_mp3.PrinterPrx = Ice.createTempClass()
    class PrinterPrx(Ice.ObjectPrx):

        def addMusique(self, musique, context=None):
            return _M_mp3.Printer._op_addMusique.invoke(self, ((musique, ), context))

        def addMusiqueAsync(self, musique, context=None):
            return _M_mp3.Printer._op_addMusique.invokeAsync(self, ((musique, ), context))

        def begin_addMusique(self, musique, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3.Printer._op_addMusique.begin(self, ((musique, ), _response, _ex, _sent, context))

        def end_addMusique(self, _r):
            return _M_mp3.Printer._op_addMusique.end(self, _r)

        def SearchByTitle(self, Titre, context=None):
            return _M_mp3.Printer._op_SearchByTitle.invoke(self, ((Titre, ), context))

        def SearchByTitleAsync(self, Titre, context=None):
            return _M_mp3.Printer._op_SearchByTitle.invokeAsync(self, ((Titre, ), context))

        def begin_SearchByTitle(self, Titre, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3.Printer._op_SearchByTitle.begin(self, ((Titre, ), _response, _ex, _sent, context))

        def end_SearchByTitle(self, _r):
            return _M_mp3.Printer._op_SearchByTitle.end(self, _r)

        def SearchByArtist(self, Artiste, context=None):
            return _M_mp3.Printer._op_SearchByArtist.invoke(self, ((Artiste, ), context))

        def SearchByArtistAsync(self, Artiste, context=None):
            return _M_mp3.Printer._op_SearchByArtist.invokeAsync(self, ((Artiste, ), context))

        def begin_SearchByArtist(self, Artiste, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3.Printer._op_SearchByArtist.begin(self, ((Artiste, ), _response, _ex, _sent, context))

        def end_SearchByArtist(self, _r):
            return _M_mp3.Printer._op_SearchByArtist.end(self, _r)

        def SearchByAlbum(self, Album, context=None):
            return _M_mp3.Printer._op_SearchByAlbum.invoke(self, ((Album, ), context))

        def SearchByAlbumAsync(self, Album, context=None):
            return _M_mp3.Printer._op_SearchByAlbum.invokeAsync(self, ((Album, ), context))

        def begin_SearchByAlbum(self, Album, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3.Printer._op_SearchByAlbum.begin(self, ((Album, ), _response, _ex, _sent, context))

        def end_SearchByAlbum(self, _r):
            return _M_mp3.Printer._op_SearchByAlbum.end(self, _r)

        def SearchByAnnee(self, AnneeSortie, context=None):
            return _M_mp3.Printer._op_SearchByAnnee.invoke(self, ((AnneeSortie, ), context))

        def SearchByAnneeAsync(self, AnneeSortie, context=None):
            return _M_mp3.Printer._op_SearchByAnnee.invokeAsync(self, ((AnneeSortie, ), context))

        def begin_SearchByAnnee(self, AnneeSortie, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3.Printer._op_SearchByAnnee.begin(self, ((AnneeSortie, ), _response, _ex, _sent, context))

        def end_SearchByAnnee(self, _r):
            return _M_mp3.Printer._op_SearchByAnnee.end(self, _r)

        def removeMusique(self, Titre, context=None):
            return _M_mp3.Printer._op_removeMusique.invoke(self, ((Titre, ), context))

        def removeMusiqueAsync(self, Titre, context=None):
            return _M_mp3.Printer._op_removeMusique.invokeAsync(self, ((Titre, ), context))

        def begin_removeMusique(self, Titre, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3.Printer._op_removeMusique.begin(self, ((Titre, ), _response, _ex, _sent, context))

        def end_removeMusique(self, _r):
            return _M_mp3.Printer._op_removeMusique.end(self, _r)

        def getMusiques(self, context=None):
            return _M_mp3.Printer._op_getMusiques.invoke(self, ((), context))

        def getMusiquesAsync(self, context=None):
            return _M_mp3.Printer._op_getMusiques.invokeAsync(self, ((), context))

        def begin_getMusiques(self, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3.Printer._op_getMusiques.begin(self, ((), _response, _ex, _sent, context))

        def end_getMusiques(self, _r):
            return _M_mp3.Printer._op_getMusiques.end(self, _r)

        @staticmethod
        def checkedCast(proxy, facetOrContext=None, context=None):
            return _M_mp3.PrinterPrx.ice_checkedCast(proxy, '::mp3::Printer', facetOrContext, context)

        @staticmethod
        def uncheckedCast(proxy, facet=None):
            return _M_mp3.PrinterPrx.ice_uncheckedCast(proxy, facet)

        @staticmethod
        def ice_staticId():
            return '::mp3::Printer'
    _M_mp3._t_PrinterPrx = IcePy.defineProxy('::mp3::Printer', PrinterPrx)

    _M_mp3.PrinterPrx = PrinterPrx
    del PrinterPrx

    _M_mp3.Printer = Ice.createTempClass()
    class Printer(Ice.Object):

        def ice_ids(self, current=None):
            return ('::Ice::Object', '::mp3::Printer')

        def ice_id(self, current=None):
            return '::mp3::Printer'

        @staticmethod
        def ice_staticId():
            return '::mp3::Printer'

        def addMusique(self, musique, current=None):
            raise NotImplementedError("servant method 'addMusique' not implemented")

        def SearchByTitle(self, Titre, current=None):
            raise NotImplementedError("servant method 'SearchByTitle' not implemented")

        def SearchByArtist(self, Artiste, current=None):
            raise NotImplementedError("servant method 'SearchByArtist' not implemented")

        def SearchByAlbum(self, Album, current=None):
            raise NotImplementedError("servant method 'SearchByAlbum' not implemented")

        def SearchByAnnee(self, AnneeSortie, current=None):
            raise NotImplementedError("servant method 'SearchByAnnee' not implemented")

        def removeMusique(self, Titre, current=None):
            raise NotImplementedError("servant method 'removeMusique' not implemented")

        def getMusiques(self, current=None):
            raise NotImplementedError("servant method 'getMusiques' not implemented")

        def __str__(self):
            return IcePy.stringify(self, _M_mp3._t_PrinterDisp)

        __repr__ = __str__

    _M_mp3._t_PrinterDisp = IcePy.defineClass('::mp3::Printer', Printer, (), None, ())
    Printer._ice_type = _M_mp3._t_PrinterDisp

    Printer._op_addMusique = IcePy.Operation('addMusique', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (((), _M_mp3._t_Musique, False, 0),), (), ((), IcePy._t_bool, False, 0), ())
    Printer._op_SearchByTitle = IcePy.Operation('SearchByTitle', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (((), IcePy._t_string, False, 0),), (), ((), _M_mp3._t_songList, False, 0), ())
    Printer._op_SearchByArtist = IcePy.Operation('SearchByArtist', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (((), IcePy._t_string, False, 0),), (), ((), _M_mp3._t_songList, False, 0), ())
    Printer._op_SearchByAlbum = IcePy.Operation('SearchByAlbum', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (((), IcePy._t_string, False, 0),), (), ((), _M_mp3._t_songList, False, 0), ())
    Printer._op_SearchByAnnee = IcePy.Operation('SearchByAnnee', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (((), IcePy._t_string, False, 0),), (), ((), _M_mp3._t_songList, False, 0), ())
    Printer._op_removeMusique = IcePy.Operation('removeMusique', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (((), IcePy._t_string, False, 0),), (), ((), IcePy._t_bool, False, 0), ())
    Printer._op_getMusiques = IcePy.Operation('getMusiques', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (), (), ((), _M_mp3._t_songList, False, 0), ())

    _M_mp3.Printer = Printer
    del Printer

# End of module mp3