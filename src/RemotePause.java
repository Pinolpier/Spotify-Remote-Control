import java.awt.AWTException;
import java.util.Scanner;

public class RemotePause {
	//Variables
	static Scanner scan;
	static String input;
	static int wait;
	static SpotifyControler controler;
	public static void main(String[] args) throws AWTException {
		scan = new Scanner(System.in);
		System.out.println("Enter hours until automatic pause: ");
		wait = scan.nextInt()*60*60*1000;
		System.out.println("Enter minutes until automatic pause: ");
		wait += scan.nextInt()*60*1000;
		System.out.println("Enter seconds until automatic pause: ");
		wait += scan.nextInt()*1000;
		
		System.out.println("Waiting for " + wait + "ms now!");
		controler = new SpotifyControler();
		try {
			Thread.sleep(wait);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		controler.play();
		
	}
}