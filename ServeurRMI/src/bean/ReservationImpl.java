package bean;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReservationImpl extends UnicastRemoteObject implements IReservationRemote{
	private static final long serialVersionUID = 1L;

	protected ReservationImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
