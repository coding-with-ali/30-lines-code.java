package advancedJava.TcpExample;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

class RemImpl extends UnicastRemoteObject implements RemMethodInt{

    protected RemImpl() throws RemoteException {super();}
    public static void main(String[] args) {
        try { RemImpl obj = new RemImpl();
            Registry reg = LocateRegistry.createRegistry(3454);
            reg.bind("adder", obj);}
        catch (RemoteException | AlreadyBoundException e) {e.printStackTrace();}
    }

    @Override
    public void markAttendance (String name) throws RemoteException {
        System.out.println(name + "is present");
    }
}

interface RemMethodInt extends java.rmi.Remote {
    public void markAttendance(String name) throws RemoteException;
}