import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method
		/*
		Room r1 = new OneRoom("AjouA", 30, 25.5, 1, "lala");
		Room r2 = new OneRoom("AjouB", 60, 35.6, 1, "land");
		Room r3 = new OneRoom("AjouC", 55, 35.6, 0, "lala");
		Room r4 = new Officetel("AjouD", 30, 25.5, 1, "land");
		Room r5 = new Officetel("AjouE", 70, 45.7, 1, "lala");
		Room r6 = new RooftopRoom("AjouF", 60, 35.6, 0, "land");
		Room r7 = new RooftopRoom("AjouG", 40, 45.7, 0, "lala");
		
		*/
		
		//int 방타입
		//string 이름
		//double
		//double
		//int
		//string
		
		Scanner sc = new Scanner(System.in);
		
		Room[] roomList = new Room[100];
		
		
		int roomCount = 0;
		
		while(true) {
			int userInputRoomType = sc.nextInt();
			
			if(userInputRoomType == 0) {
				break;
			}
			
			String name = sc.next();
			double montlyRend = sc.nextDouble();
			double area = sc.nextDouble();
			int option = sc.nextInt();
			String local = sc.next();
			
			Room newRoom = null;
			if(userInputRoomType == 1) {
				newRoom = new OneRoom(name, montlyRend, area, option, local);
				
			}
			else if(userInputRoomType == 2) {
				newRoom = new Officetel(name, montlyRend, area, option, local);
			}
			else if(userInputRoomType == 3) {
				newRoom = new RooftopRoom(name, montlyRend, area, option, local);
			}
			
			roomList[roomCount] = newRoom;
			roomCount++;
		}
		
		double bestScore = 0;
		String bestRoom = "";
		for (int i = 0; i < roomCount; i++) {
			Room room = roomList[i];
			room.show();
			room.roomScore();
			if (room.sum < bestScore) {
				continue;
			}
			else {
				bestScore = room.sum;
				bestRoom = room.name;
			}
		}
		
		System.out.printf("%n%n%n여러 옵션을 고민한 결과 %s가 선정되었습니다.", bestRoom);





	}

}
