package task1;
import java.util.*;

public  record RecordLogger(String name) implements Logger {

	
	
	@Override
	public String logMessage(String message) {
		
		return message + " " + this.name;
	}

}
