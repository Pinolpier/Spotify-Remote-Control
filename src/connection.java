import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class connection implements Runnable{
	//Variables
	SpotifyControler spotifyControler;
	
	Socket socket;
	InputStream input;
	BufferedReader read;
	public void run() {
		System.out.println("Thread succesfully launched.");
		try {
			spotifyControler = new SpotifyControler();
		}
		catch (AWTException e1) {
			System.out.println("Couldn't create SpotifyControler object! Probably bot couldn't be initialized in constructor. Exiting syste.");
			e1.printStackTrace();
			System.exit(2);
		}
		try {
			input = socket.getInputStream();
			read = new BufferedReader(new InputStreamReader(input));
			while (socket.isConnected()) {
				String msg = read.readLine().toLowerCase();
				if (msg.equals("play")||msg.equals("pause")) {
					spotifyControler.play();
				}
			}
		}
		catch (IOException e) {
			System.out.println("Socket couldn't supply InputStream");
			e.printStackTrace();
		}
	}
	
	public boolean setSocket(Socket arg) {
		socket = arg;
		return true;
	}
}