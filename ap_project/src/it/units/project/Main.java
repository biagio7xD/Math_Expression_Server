package it.units.project;

import it.units.project.server.ProcessingServer;
import it.units.project.server.Server;


public class Main {

  public static void main(String[] args) throws Exception {
	// write your code here
	if (args.length == 1) {
	  int port = Integer.parseInt(args[0]);
	  if (port > 0) {
		Server server = new ProcessingServer(port);
		server.start();
	  } else {
		System.err.println("Port doesn't set correctly");
	  }
	} else {
	  System.err.println("Too many argument line specified");
	}
  }
}

