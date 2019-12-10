package springconstructor;

public class SchoolService {
	
	SportService sprt;
	CarruculamService crcs;
	
	public SchoolService(SportService sprt ,CarruculamService crcs) {
		
		super();
		this.sprt = sprt;
		this.crcs = crcs;
	}
	
	public void showAll() {
		crcs.myService();
		sprt.showService();
		
	}

}
