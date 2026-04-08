package exam14_인터페이스4_loose_coupling;

public class DBService {
	MySQLDAO dao;
	
	public void setDao(MySQLDAO dao) {
		this.dao = dao;
	}
	

	
	public void connect() {
		dao.connectMySQL();
	}
}
