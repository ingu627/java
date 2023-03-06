
public class OneRoom extends Room {

	public OneRoom(String name, double monthlyRent, double area, int option, String local) {
		super(name, monthlyRent, area, option, local);
		// TODO Auto-generated constructor stub
		this.sum = monthlyRentScore()*1.5+areaScore()+optionScore()+localScore();
	}
	
	@Override
	public void showRoomScoreInformation() {
		System.out.printf("(%s) OneRoom Score: %.1f%n",this.name, this.sum);
	}
	
	

}
