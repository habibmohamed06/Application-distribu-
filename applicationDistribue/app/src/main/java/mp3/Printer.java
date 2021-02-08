//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.2
//
// <auto-generated>
//
// Generated from file `Printer.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package mp3;

public interface Printer extends com.zeroc.Ice.Object
{
    boolean addMusique(Musique musique, com.zeroc.Ice.Current current);

    Musique[] SearchByTitle(String Titre, com.zeroc.Ice.Current current);

    Musique[] SearchByArtist(String Artiste, com.zeroc.Ice.Current current);

    Musique[] SearchByAlbum(String Album, com.zeroc.Ice.Current current);

    Musique[] SearchByAnnee(String AnneeSortie, com.zeroc.Ice.Current current);

    boolean removeMusique(String Titre, com.zeroc.Ice.Current current);

    Musique[] getMusiques(com.zeroc.Ice.Current current);

    /** @hidden */
    static final String[] _iceIds =
    {
        "::Ice::Object",
        "::mp3::Printer"
    };

    @Override
    default String[] ice_ids(com.zeroc.Ice.Current current)
    {
        return _iceIds;
    }

    @Override
    default String ice_id(com.zeroc.Ice.Current current)
    {
        return ice_staticId();
    }

    static String ice_staticId()
    {
        return "::mp3::Printer";
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_addMusique(Printer obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        final com.zeroc.IceInternal.Holder<Musique> icePP_musique = new com.zeroc.IceInternal.Holder<>();
        istr.readValue(v -> icePP_musique.value = v, Musique.class);
        istr.readPendingValues();
        inS.endReadParams();
        Musique iceP_musique = icePP_musique.value;
        boolean ret = obj.addMusique(iceP_musique, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeBool(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_SearchByTitle(Printer obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_Titre;
        iceP_Titre = istr.readString();
        inS.endReadParams();
        Musique[] ret = obj.SearchByTitle(iceP_Titre, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        songListHelper.write(ostr, ret);
        ostr.writePendingValues();
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_SearchByArtist(Printer obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_Artiste;
        iceP_Artiste = istr.readString();
        inS.endReadParams();
        Musique[] ret = obj.SearchByArtist(iceP_Artiste, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        songListHelper.write(ostr, ret);
        ostr.writePendingValues();
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_SearchByAlbum(Printer obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_Album;
        iceP_Album = istr.readString();
        inS.endReadParams();
        Musique[] ret = obj.SearchByAlbum(iceP_Album, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        songListHelper.write(ostr, ret);
        ostr.writePendingValues();
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_SearchByAnnee(Printer obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_AnneeSortie;
        iceP_AnneeSortie = istr.readString();
        inS.endReadParams();
        Musique[] ret = obj.SearchByAnnee(iceP_AnneeSortie, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        songListHelper.write(ostr, ret);
        ostr.writePendingValues();
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_removeMusique(Printer obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_Titre;
        iceP_Titre = istr.readString();
        inS.endReadParams();
        boolean ret = obj.removeMusique(iceP_Titre, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeBool(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_getMusiques(Printer obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        inS.readEmptyParams();
        Musique[] ret = obj.getMusiques(current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        songListHelper.write(ostr, ret);
        ostr.writePendingValues();
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    /** @hidden */
    final static String[] _iceOps =
    {
        "SearchByAlbum",
        "SearchByAnnee",
        "SearchByArtist",
        "SearchByTitle",
        "addMusique",
        "getMusiques",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "removeMusique"
    };

    /** @hidden */
    @Override
    default java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceDispatch(com.zeroc.IceInternal.Incoming in, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        int pos = java.util.Arrays.binarySearch(_iceOps, current.operation);
        if(pos < 0)
        {
            throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return _iceD_SearchByAlbum(this, in, current);
            }
            case 1:
            {
                return _iceD_SearchByAnnee(this, in, current);
            }
            case 2:
            {
                return _iceD_SearchByArtist(this, in, current);
            }
            case 3:
            {
                return _iceD_SearchByTitle(this, in, current);
            }
            case 4:
            {
                return _iceD_addMusique(this, in, current);
            }
            case 5:
            {
                return _iceD_getMusiques(this, in, current);
            }
            case 6:
            {
                return com.zeroc.Ice.Object._iceD_ice_id(this, in, current);
            }
            case 7:
            {
                return com.zeroc.Ice.Object._iceD_ice_ids(this, in, current);
            }
            case 8:
            {
                return com.zeroc.Ice.Object._iceD_ice_isA(this, in, current);
            }
            case 9:
            {
                return com.zeroc.Ice.Object._iceD_ice_ping(this, in, current);
            }
            case 10:
            {
                return _iceD_removeMusique(this, in, current);
            }
        }

        assert(false);
        throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
    }
}