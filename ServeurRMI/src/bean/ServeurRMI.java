package bean;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServeurRMI {
	public static void main(String[] args) {
		try {
	
			LocateRegistry.createRegistry(1099);
			//Instanciation des objets et enregistrement de ceux-ci dans le registre de nom
			UsersImpl user = new UsersImpl();
			Naming.rebind("rmi://localhost:1099/user", user);
			
			GroupesImpl groupe = new GroupesImpl();
			Naming.rebind("rmi://localhost:1099/groupe", groupe);
			
			AnimationsImpl animation = new AnimationImpl();
			Naming.rebind("rmi://localhost:1099/animation", animation);
			
			ReservationsImpl reservation = ReservationImpl();
			Naming.rebind("rmi://localhost:1099/reservation", reservation);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
