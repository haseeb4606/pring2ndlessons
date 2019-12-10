package springconstructor;

public class SportService {

	private SoccerService soccer;
	public void showService() {
		
		System.out.println("I am helping them to learn all typse of sports and lessons");
		
		soccer.playSorccer();
		
	}
	public SoccerService getSoccer() {
		return soccer;
	}
	public void setSoccer(SoccerService soccer) {
		this.soccer = soccer;
	}
	
}
