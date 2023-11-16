package task1;

public class Main {

	public static void main(String[] args) {
		
		RecordLogger recordLogger = new RecordLogger("recordLogger");
		
		ClassLogger classLogger = new ClassLogger("ClassLoger");
		
        recordLogger.logMessage(message -> System.out.println(message));
        classLogger.logMessage(message -> System.out.println(message));
	}

}
