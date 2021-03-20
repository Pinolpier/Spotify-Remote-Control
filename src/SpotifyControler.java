import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class SpotifyControler {
	//Variables
	Robot bot;
	
	public SpotifyControler() throws AWTException {
		bot = new Robot();
		
	}
	
	public void play() {
		System.out.println("Opening Spotify");
		bot.keyPress(KeyEvent.VK_WINDOWS);
		bot.keyPress(KeyEvent.VK_5);
		bot.keyRelease(KeyEvent.VK_WINDOWS);
		bot.keyRelease(KeyEvent.VK_5);
		System.out.println("Waiting for 10 seconds.");
		try {
			Thread.sleep(10000);
		}
		catch (InterruptedException e) {
			System.out.println("Couldn't wait for the launch of Spotify. Sleep didn't work. Calculating useless shit now.");
			e.printStackTrace();
			for (int i=0; i>0; i++){
				i++;
			}
		}
		bot.keyPress(KeyEvent.VK_SPACE);
		bot.keyRelease(KeyEvent.VK_SPACE);
		try {
			Thread.sleep(500);
		}
		catch (InterruptedException e) {
			System.out.println("Probably even not a problem.");
			e.printStackTrace();
		}
		bot.keyPress(KeyEvent.VK_ALT);
		bot.keyPress(KeyEvent.VK_SPACE);
		try {
			Thread.sleep(100);
		}
		catch (InterruptedException e) {
			System.out.println("Probably even not a problem.");
			e.printStackTrace();
		}
		bot.keyPress(KeyEvent.VK_N);
		try {
			Thread.sleep(500);
		}
		catch (InterruptedException e) {
			System.out.println("Probably even not a problem.");
			e.printStackTrace();
		}
		bot.keyRelease(KeyEvent.VK_ALT);
		bot.keyRelease(KeyEvent.VK_SPACE);
		bot.keyRelease(KeyEvent.VK_N);
	}
}