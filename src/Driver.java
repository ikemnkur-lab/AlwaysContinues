import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Driver {
	
	DateTimeFormatter formattedDateTime = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
	LocalDateTime showDateTime = LocalDateTime.now();
	String formattedDateTimeFinal = showDateTime.format(formattedDateTime);
   
	public String printTime() {
		return  "Current Date/Time: " + formattedDateTimeFinal;
	}

	public void sleepForThreeSec() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
