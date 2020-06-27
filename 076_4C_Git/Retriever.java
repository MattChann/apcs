import java.time.*;

public class Retriever extends Pet{
    public String speak() {
		int hour = LocalDateTime.now().getHour();
		if(hour > 9 && hour <= 21) {
            return "arf"; // Dog is awake between 9 AM and 9 PM.
		} else {
            return "zzz"; // Dog is asleep.
		}
    }
}
