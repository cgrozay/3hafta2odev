package poliymorphismDemo;

public class CustomerManager {
	private BaseLogger baseLogger;

	public CustomerManager(BaseLogger baseLogger) {

		this.baseLogger = baseLogger;
	}

	public void Add() {
		System.out.println("Müşteri Eklendi...");
		this.baseLogger.Log("Log Mesajı");
	}
}
