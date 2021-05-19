package it.units.project;

import it.units.project.server.ProcessingServer;
import it.units.project.server.Server;


public class Main {

  public static void main(String[] args) throws Exception {
	// write your code here
	if (args.length == 1) {
	  try {
		int port = Integer.parseInt(args[0]);
		if (port > 0) {
		  Server server = new ProcessingServer(port);
		  System.out.println("Server started..");
		  server.start();
		} else {
		  System.err.println("Port doesn't set correctly");
		}
	  } catch (NumberFormatException e) {
		System.err.println("Argument isn't an Integer. Impossible to parse it.");
	  }
	} else {
	  System.err.println("Wrong argument line specified");
	}
  }
}

