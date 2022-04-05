import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		Scanner sc = new Scanner(System.in);
		
		Room[] roomList = new Room[100];
		
		
		int roomCount = 0;
		
		while(true) {
			int userInputRoomType = sc.nextInt();
			
			if(userInputRoomType == 0) {
				break;
			}
			
			String name = sc.next();
			double montlyRent = sc.nextDouble();
			double area = sc.nextDouble();
			int option = sc.nextInt();
			String local = sc.next();
			
			Room newRoom = null;
			if(userInputRoomType == 1) {
				newRoom = new OneRoom(name, montlyRent, area, option, local);
				
			}
			else if(userInputRoomType == 2) {
				newRoom = new Officetel(name, montlyRent, area, option, local);
			}
			else if(userInputRoomType == 3) {
				newRoom = new RooftopRoom(name, montlyRent, area, option, local);
			}
			
			roomList[roomCount] = newRoom;
			roomCount++;
		}
		
		double bestScore = 0;
		String bestRoom = "";
		for (int i = 0; i < roomCount; i++) {
			Room room = roomList[i];
			System.out.println(room);
			room.showRoomScoreInformation();
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
