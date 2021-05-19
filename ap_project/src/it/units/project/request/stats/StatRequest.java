package it.units.project.request.stats;

import it.units.project.request.AbstractRequest;
import it.units.project.request.CommandType;
import it.units.project.response.AbstractResponse;
import it.units.project.response.CommandResponse;
import it.units.project.response.SuccessfulResponse;

public class StatRequest extends AbstractRequest {

  private final StatType statType;
  private final double[] stats;

  public StatRequest(StatType statType, double[] stats) {
	super(CommandType.STATS);
	this.statType = statType;
	this.stats = stats;
  }

  @Override
  public CommandResponse process() {
	double result = switch (statType) {
	  case STAT_REQS -> stats[0];
	  case STAT_MAX_TIME -> stats[2];
	  case STAT_AVG_TIME -> (stats[1] / stats[0]);
	};
	final AbstractResponse response = new SuccessfulResponse(result, this.finalizeRequestExecutionTime());
	return new CommandResponse(response, commandType);
  }
}
