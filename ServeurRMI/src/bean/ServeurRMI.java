package bean;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServeurRMI {
	public static void main(String[] args) {
		try {
	
			LocateRegistry.createRegistry(1099);
			//Instanciation des objets et enregistrement de ceux-ci dans le registre de nom
			UserImpl user = new UserImpl();
			Naming.rebind("rmi://localhost:1099/user", user);
			
			GroupeImpl groupe = new GroupeImpl();
			Naming.rebind("rmi://localhost:1099/groupe", groupe);
			
			AnimationImpl animation = new AnimationImpl();
			Naming.rebind("rmi://localhost:1099/animation", animation);
			
			ReservationImpl reservation = new ReservationImpl();
			Naming.rebind("rmi://localhost:1099/reservation", reservation);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
