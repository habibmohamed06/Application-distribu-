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

import android.os.Build;
import android.support.annotation.RequiresApi;

/**
 * Helper class for marshaling/unmarshaling songList.
 **/
public final class songListHelper
{
    public static void write(com.zeroc.Ice.OutputStream ostr, Musique[] v)
    {
        if(v == null)
        {
            ostr.writeSize(0);
        }
        else
        {
            ostr.writeSize(v.length);
            for(int i0 = 0; i0 < v.length; i0++)
            {
                ostr.writeValue(v[i0]);
            }
        }
    }

    public static Musique[] read(com.zeroc.Ice.InputStream istr)
    {
        final Musique[] v;
        final int len0 = istr.readAndCheckSeqSize(1);
        v = new Musique[len0];
        for(int i0 = 0; i0 < len0; i0++)
        {
            final int fi0 = i0;
            istr.readValue(value -> v[fi0] = value, Musique.class);
        }
        return v;
    }

    public static void write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<Musique[]> v)
    {
        if(v != null && v.isPresent())
        {
            write(ostr, tag, v.get());
        }
    }

    public static void write(com.zeroc.Ice.OutputStream ostr, int tag, Musique[] v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            songListHelper.write(ostr, v);
            ostr.endSize(pos);
        }
    }


    public static java.util.Optional<Musique[]> read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            Musique[] v;
            v = songListHelper.read(istr);
            return java.util.Optional.of(v);
        }
        else
        {
            return java.util.Optional.empty();
        }
    }
}