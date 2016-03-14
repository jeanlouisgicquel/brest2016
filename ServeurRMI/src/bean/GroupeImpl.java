package bean;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GroupeImpl extends UnicastRemoteObject implements IGroupeRemote{
	private static final long serialVersionUID = 1L;
	
	
	protected GroupeImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
}
