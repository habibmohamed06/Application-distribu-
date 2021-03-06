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

public interface PrinterPrx extends com.zeroc.Ice.ObjectPrx
{
    default boolean addMusique(Musique musique)
    {
        return addMusique(musique, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default boolean addMusique(Musique musique, java.util.Map<String, String> context)
    {
        return _iceI_addMusiqueAsync(musique, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> addMusiqueAsync(Musique musique)
    {
        return _iceI_addMusiqueAsync(musique, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> addMusiqueAsync(Musique musique, java.util.Map<String, String> context)
    {
        return _iceI_addMusiqueAsync(musique, context, false);
    }

    /**
     * @hidden
     * @param iceP_musique -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> _iceI_addMusiqueAsync(Musique iceP_musique, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "addMusique", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeValue(iceP_musique);
                     ostr.writePendingValues();
                 }, istr -> {
                     boolean ret;
                     ret = istr.readBool();
                     return ret;
                 });
        return f;
    }

    default Musique[] SearchByTitle(String Titre)
    {
        return SearchByTitle(Titre, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default Musique[] SearchByTitle(String Titre, java.util.Map<String, String> context)
    {
        return _iceI_SearchByTitleAsync(Titre, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Musique[]> SearchByTitleAsync(String Titre)
    {
        return _iceI_SearchByTitleAsync(Titre, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Musique[]> SearchByTitleAsync(String Titre, java.util.Map<String, String> context)
    {
        return _iceI_SearchByTitleAsync(Titre, context, false);
    }

    /**
     * @hidden
     * @param iceP_Titre -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Musique[]> _iceI_SearchByTitleAsync(String iceP_Titre, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Musique[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "SearchByTitle", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_Titre);
                 }, istr -> {
                     Musique[] ret;
                     ret = songListHelper.read(istr);
                     istr.readPendingValues();
                     return ret;
                 });
        return f;
    }

    default Musique[] SearchByArtist(String Artiste)
    {
        return SearchByArtist(Artiste, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default Musique[] SearchByArtist(String Artiste, java.util.Map<String, String> context)
    {
        return _iceI_SearchByArtistAsync(Artiste, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Musique[]> SearchByArtistAsync(String Artiste)
    {
        return _iceI_SearchByArtistAsync(Artiste, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Musique[]> SearchByArtistAsync(String Artiste, java.util.Map<String, String> context)
    {
        return _iceI_SearchByArtistAsync(Artiste, context, false);
    }

    /**
     * @hidden
     * @param iceP_Artiste -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Musique[]> _iceI_SearchByArtistAsync(String iceP_Artiste, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Musique[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "SearchByArtist", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_Artiste);
                 }, istr -> {
                     Musique[] ret;
                     ret = songListHelper.read(istr);
                     istr.readPendingValues();
                     return ret;
                 });
        return f;
    }

    default Musique[] SearchByAlbum(String Album)
    {
        return SearchByAlbum(Album, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default Musique[] SearchByAlbum(String Album, java.util.Map<String, String> context)
    {
        return _iceI_SearchByAlbumAsync(Album, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Musique[]> SearchByAlbumAsync(String Album)
    {
        return _iceI_SearchByAlbumAsync(Album, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Musique[]> SearchByAlbumAsync(String Album, java.util.Map<String, String> context)
    {
        return _iceI_SearchByAlbumAsync(Album, context, false);
    }

    /**
     * @hidden
     * @param iceP_Album -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Musique[]> _iceI_SearchByAlbumAsync(String iceP_Album, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Musique[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "SearchByAlbum", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_Album);
                 }, istr -> {
                     Musique[] ret;
                     ret = songListHelper.read(istr);
                     istr.readPendingValues();
                     return ret;
                 });
        return f;
    }

    default Musique[] SearchByAnnee(String AnneeSortie)
    {
        return SearchByAnnee(AnneeSortie, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default Musique[] SearchByAnnee(String AnneeSortie, java.util.Map<String, String> context)
    {
        return _iceI_SearchByAnneeAsync(AnneeSortie, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Musique[]> SearchByAnneeAsync(String AnneeSortie)
    {
        return _iceI_SearchByAnneeAsync(AnneeSortie, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Musique[]> SearchByAnneeAsync(String AnneeSortie, java.util.Map<String, String> context)
    {
        return _iceI_SearchByAnneeAsync(AnneeSortie, context, false);
    }

    /**
     * @hidden
     * @param iceP_AnneeSortie -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Musique[]> _iceI_SearchByAnneeAsync(String iceP_AnneeSortie, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Musique[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "SearchByAnnee", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_AnneeSortie);
                 }, istr -> {
                     Musique[] ret;
                     ret = songListHelper.read(istr);
                     istr.readPendingValues();
                     return ret;
                 });
        return f;
    }

    default boolean removeMusique(String Titre)
    {
        return removeMusique(Titre, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default boolean removeMusique(String Titre, java.util.Map<String, String> context)
    {
        return _iceI_removeMusiqueAsync(Titre, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> removeMusiqueAsync(String Titre)
    {
        return _iceI_removeMusiqueAsync(Titre, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> removeMusiqueAsync(String Titre, java.util.Map<String, String> context)
    {
        return _iceI_removeMusiqueAsync(Titre, context, false);
    }

    /**
     * @hidden
     * @param iceP_Titre -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> _iceI_removeMusiqueAsync(String iceP_Titre, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "removeMusique", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_Titre);
                 }, istr -> {
                     boolean ret;
                     ret = istr.readBool();
                     return ret;
                 });
        return f;
    }

    default Musique[] getMusiques()
    {
        return getMusiques(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default Musique[] getMusiques(java.util.Map<String, String> context)
    {
        return _iceI_getMusiquesAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Musique[]> getMusiquesAsync()
    {
        return _iceI_getMusiquesAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Musique[]> getMusiquesAsync(java.util.Map<String, String> context)
    {
        return _iceI_getMusiquesAsync(context, false);
    }

    /**
     * @hidden
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Musique[]> _iceI_getMusiquesAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Musique[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getMusiques", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     Musique[] ret;
                     ret = songListHelper.read(istr);
                     istr.readPendingValues();
                     return ret;
                 });
        return f;
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PrinterPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), PrinterPrx.class, _PrinterPrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PrinterPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), PrinterPrx.class, _PrinterPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PrinterPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), PrinterPrx.class, _PrinterPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PrinterPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), PrinterPrx.class, _PrinterPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static PrinterPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, PrinterPrx.class, _PrinterPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static PrinterPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, PrinterPrx.class, _PrinterPrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default PrinterPrx ice_context(java.util.Map<String, String> newContext)
    {
        return (PrinterPrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default PrinterPrx ice_adapterId(String newAdapterId)
    {
        return (PrinterPrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default PrinterPrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (PrinterPrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default PrinterPrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (PrinterPrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default PrinterPrx ice_invocationTimeout(int newTimeout)
    {
        return (PrinterPrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default PrinterPrx ice_connectionCached(boolean newCache)
    {
        return (PrinterPrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default PrinterPrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (PrinterPrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default PrinterPrx ice_secure(boolean b)
    {
        return (PrinterPrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default PrinterPrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (PrinterPrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default PrinterPrx ice_preferSecure(boolean b)
    {
        return (PrinterPrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default PrinterPrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (PrinterPrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default PrinterPrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (PrinterPrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default PrinterPrx ice_collocationOptimized(boolean b)
    {
        return (PrinterPrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default PrinterPrx ice_twoway()
    {
        return (PrinterPrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default PrinterPrx ice_oneway()
    {
        return (PrinterPrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default PrinterPrx ice_batchOneway()
    {
        return (PrinterPrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default PrinterPrx ice_datagram()
    {
        return (PrinterPrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default PrinterPrx ice_batchDatagram()
    {
        return (PrinterPrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default PrinterPrx ice_compress(boolean co)
    {
        return (PrinterPrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default PrinterPrx ice_timeout(int t)
    {
        return (PrinterPrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default PrinterPrx ice_connectionId(String connectionId)
    {
        return (PrinterPrx)_ice_connectionId(connectionId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except it's a fixed proxy bound
     * the given connection.@param connection The fixed proxy connection.
     * @return A fixed proxy bound to the given connection.
     **/
    @Override
        default PrinterPrx ice_fixed(com.zeroc.Ice.Connection connection)
    {
        return  (PrinterPrx)_ice_fixed(connection);
    }

    static String ice_staticId()
    {
        return "::mp3::Printer";
    }
}
