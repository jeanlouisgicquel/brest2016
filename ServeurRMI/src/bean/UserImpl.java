package bean;
//import annotation.NonVide;
//import annotation.Table;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//@Table(name="t_users")
public class UserImpl extends UnicastRemoteObject implements IUserRemote{
	private static final long serialVersionUID = 1L;
	
	Integer idUser;
	//	@NonVide(mess="Veuille saisir le titre du livre")
	String password;
	//	@NonVide(mess="Veuille saisir l'auteur du livre")
	String dateVisite;
	Boolean isAdmin;
	
	protected UserImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateVisite() {
		return dateVisite;
	}

	public void setDateVisite(String dateVisite) {
		this.dateVisite = dateVisite;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}
