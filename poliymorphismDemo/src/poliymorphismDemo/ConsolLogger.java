package poliymorphismDemo;

public class ConsolLogger extends BaseLogger{
	public void Log(String message) {
		System.out.println("Logged to console :"+message);
	}
}
