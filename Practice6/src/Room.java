
public class Room {
	protected String name;
	protected double monthlyRent;
	private double area;
	private int option;
	private String local;
	protected double sum;
	
	public Room(String name, double monthlyRent, double area, int option, String local) {
		this.name = name;
		this.monthlyRent = monthlyRent;
		this.area = area;
		this.option = option;
		this.local = local;
		this.sum = monthlyRentScore()+areaScore()+optionScore()+localScore();
		
	}
	
	public double getSum() {
		return sum;
	}

	public void show() {
		String bar = "-";
		System.out.println(bar.repeat(14));
		System.out.printf("Room: %s%nMonthly Rent: %.2f%nArea: %s%nOption: %d%nLocal: %s%n", this.name, this.monthlyRent, this.area, this.option, this.local);
		System.out.println(bar.repeat(14));
	}
	
	public double monthlyRentScore() {
		if (this.monthlyRent < 40) {
			return 4;
			}
		else if (this.monthlyRent >= 40 && this.monthlyRent < 60) {
			return 3;
		}
		else if (this.monthlyRent>=60) {
			return 2;
			}
		else {
			return 0;
		}
		}
	
	public double areaScore() {
		if (this.area == 25.5) {
			return 1;
		}
		else if (this.area == 35.6) {
			return 2;
		}
		else if (this.area == 45.7) {
			return 3;
		}
		else {
			return 0;
		}
			
		}
	
	public int optionScore() {
		return this.option;
	}
	
	public int localScore() {
		if (this.local.equals("lala")) {
			return 1;
		}
		else if (this.local.equals("land")) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	
	public void roomScore() {
		System.out.printf("(%s) roomScore: %.1f%n",this.name, this.sum);
	}
	
	

	
	

}
