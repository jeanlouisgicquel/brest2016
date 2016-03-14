import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import service.IBanqueRemote;

public class ClientRMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			IBanqueRemote stub=(IBanqueRemote)Naming.lookup("rmi://localhost:1099/BK");
			System.out.println(stub.conversion(70));
			System.out.println(stub.getServerDate());

		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
