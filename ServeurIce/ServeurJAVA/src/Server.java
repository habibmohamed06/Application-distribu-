import java.sql.SQLException;
/**
 *
 * @author habib
 */
public class Server {
    public static void main(String[] args) throws SQLException
    {

        try(com.zeroc.Ice.Communicator communicator = com.zeroc.Ice.Util.initialize(args))
        {
            com.zeroc.Ice.ObjectAdapter adapter = communicator.createObjectAdapterWithEndpoints("SimplePrinterAdapter", "default -p 10000");
            ListMusique list = new ListMusique();
            list.chargerMusique();
            com.zeroc.Ice.Object object = list;
            adapter.add(object, com.zeroc.Ice.Util.stringToIdentity("SimplePrinter"));
            adapter.activate();
            communicator.waitForShutdown();
        }
        
    }
}
