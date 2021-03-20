import java.io.IOException;
import java.net.ServerSocket;

public class server {
	//Variables
	static ServerSocket server;
	public static void main(String[] args) {
		try {
			server = new ServerSocket(2154);
			System.out.println("Server running...");
			while (true) {
				connection conection = new connection();
				Thread thread = new Thread(conection);
				conection.setSocket(server.accept());
				System.out.println("New client accepted, launching Thread now...");
				thread.start();
			}
		}
		catch (IOException e) {
			System.out.println("Couldn't create server on startup!");
			e.printStackTrace();
		}
	}
}