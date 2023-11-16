package task1;

public class ClassLogger implements Logger {

	private String name;
	
	public ClassLogger(String name) {
		this.name = name;
	}

	@Override
	public void logMessage(LoggingFunction loggingFunction) {
		loggingFunction.log(name + ": This is a log message from ClassLoger");
		
	}
	
	
	
	

	
	
}
