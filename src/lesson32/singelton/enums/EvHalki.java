package lesson32.singelton.enums;

public class EvHalki extends Thread {
	
	@Override
	public void run() {
		robotCagir();
	}

	public static void robotCagir() {
		Robot.ROBOT.calis();
	}
	
}
