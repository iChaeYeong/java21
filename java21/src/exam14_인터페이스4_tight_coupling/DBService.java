package exam14_인터페이스4_tight_coupling;

public class DBService {
	//MySQLDAO dao;
	
	DBDAO dao;
	
	public void setDao(DBDAO dao) {
		this.dao = dao;
	}
	
	public void connect() {
		dao.connectDB();
	}
}
