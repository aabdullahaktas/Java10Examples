package lesson32.singelton.lazy;

public class EvHalki extends Thread {
	
	@Override
	public void run() {
		robotCagir();
	}

	public static void robotCagir() {
		Robot.getRobot().calis();
	}
	
}
