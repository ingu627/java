
public class Officetel extends Room {

	public Officetel(String name, double monthlyRent, double area, int option, String local) {
		super(name, monthlyRent, area, option, local);
		// TODO Auto-generated constructor stub
		this.sum = monthlyRentScore()+areaScore()+optionScore()*1.5+localScore();
	}
	
	@Override
	public void showRoomScoreInformation() {
		System.out.printf("(%s) Officetel Score: %.1f%n",this.name, this.sum);
	}

}
