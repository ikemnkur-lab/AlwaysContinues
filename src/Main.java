
public class Main {

	public static void main(String[] args) {
		System.out.println("Shows the time when the 'W' key is not pressed.");
		Driver action = new Driver();
		int i = 0;
		while(i < 500) {
			i++;
			action.sleepForThreeSec();
			if (!IsKeyPressed.isWPressed()) {
			    System.out.println(action.printTime());
			}
		}
	}

}
