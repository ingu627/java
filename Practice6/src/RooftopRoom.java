
public class RooftopRoom extends Room {

	public RooftopRoom(String name, double monthlyRent, double area, int option, String local) {
		super(name, monthlyRent, area, option, local);
		// TODO Auto-generated constructor stub
		this.sum = monthlyRentScore()+areaScore()*1.5+optionScore()+localScore();
	}
	
	@Override
	public void roomScore() {
		System.out.printf("(%s) RooftopRoom Score: %.1f%n",this.name, this.sum);
	}

}
