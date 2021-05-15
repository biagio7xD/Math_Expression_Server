package it.units.project.server;

import it.units.project.response.CommandResponse;

@FunctionalInterface
public interface CommandProcessor {

  CommandResponse process(String input);
}
