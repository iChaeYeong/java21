package exam14_인터페이스4_tight_coupling;

public class OracleDAO implements DBDAO{
	public void connectDB() {
		System.out.println("OracleDAO.connectOracle()");
	}
}
