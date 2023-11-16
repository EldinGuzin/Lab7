package task1;
import java.util.*;

public  record RecordLogger(String name) implements Logger {

	@Override
	public void logMessage(LoggingFunction loggingFunction) {
		loggingFunction.log(name + ": This is a log message from RecordLogger");
		
	}

	
	
	
	

}
