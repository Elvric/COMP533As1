package task4;

/**
 * The Logger class is a class that contains the means of logging data. It must
 * contain a log method.
 * 
 * @author Song
 */
public class Logger {
    
	/**
	 * Mandatory in order to make the Logging aspect work. Takes a string and output
	 * it somewhere for display, storage, communication, etc.
	 * @param stringToLog The string that will be logged.
	 */
	public static void log(String stringToLog){
		System.out.println(stringToLog);
	}
}
