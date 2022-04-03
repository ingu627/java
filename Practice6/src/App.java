
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Room r1 = new OneRoom("AjouA", 30, 25.5, 1, "lala");
		Room r2 = new OneRoom("AjouB", 60, 35.6, 1, "land");
		Room r3 = new OneRoom("AjouC", 55, 35.6, 0, "lala");
		Room r4 = new Officetel("AjouD", 30, 25.5, 1, "land");
		Room r5 = new Officetel("AjouE", 70, 45.7, 1, "lala");
		Room r6 = new RooftopRoom("AjouF", 60, 35.6, 0, "land");
		Room r7 = new RooftopRoom("AjouG", 40, 45.7, 0, "lala");
		
		
		Room list[] = {r1, r2, r3, r4, r5, r6, r7};
		
		String bestRoom= "";
		double bestScore = 0;
	    
		for (Room i: list) {
			i.show();
			i.roomScore();
			if (i.sum < bestScore) {
				continue;
			}
			else {
				bestScore = i.sum;
				bestRoom = i.name;
			}
		}
		
		System.out.printf("%n%n%n여러 옵션을 고민한 결과 %s가 선정되었습니다.", bestRoom);
		
		

	}

}
