package it.units.project.server;

import it.units.project.response.CommandResponse;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server implements CommandProcessor {

  protected static ExecutorService executorService;
  protected final int port;

  public Server(int port) {
	this.port = port;
	executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
  }

  public void start() throws IOException {
	try (ServerSocket serverSocket = new ServerSocket(port)) {
	  while (true) {
		try {
		  Socket socket = serverSocket.accept();
		  System.out.print(acceptedConnectionMessage(socket));
		  ClientHandler clientHandler = new ClientHandler(socket, this);
		  clientHandler.start();
		} catch (IllegalThreadStateException e) {
		  System.err.println(e.getMessage());
		} catch (IOException e) {
		  System.err.print(refusedConnectionMessage(e));
		}
	  }
	} finally {
	  executorService.shutdown();
	}
  }

  @Override
  public CommandResponse process(String input) {
	return null;
  }

  private synchronized String acceptedConnectionMessage(Socket socket) {
	return String.format(
			"[%1$tH:%1$tM:%1$tS %1$tA, %1$td %1$tB %1$tY] New connection from Client: %2$s:%3$d.%4$s",
			new Date(), socket.getInetAddress(), socket.getPort(), System.lineSeparator()
	);
  }

  private synchronized String refusedConnectionMessage(Exception e) {
	return String.format(
			"[%1$tH:%1$tM:%1$tS %1$tA, %1$td %1$tB %1$tY] Cannot accept connection due to %2$s.%3$s",
			new Date(), e, System.lineSeparator()
	);
  }
}
