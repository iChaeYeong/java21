package exam14_인터페이스4_tight_coupling;

public class MySQLDAO implements DBDAO {

	public void connectDB() {
		System.out.println("MySQLDAO.connectMySQL()");
	}
	
}
