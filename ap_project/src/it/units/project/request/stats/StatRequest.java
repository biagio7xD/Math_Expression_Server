package it.units.project.request.stats;

import it.units.project.request.AbstractRequest;
import it.units.project.request.CommandType;
import it.units.project.response.AbstractResponse;
import it.units.project.response.CommandResponse;
import it.units.project.response.SuccessfulResponse;

public class StatRequest extends AbstractRequest {

  private final StatType statType;

  public StatRequest(StatType statType, double[] stats) {
	super(stats, CommandType.STATS);
	this.statType = statType;

  }

  @Override
  public CommandResponse compute() {
	double result = switch (statType) {
	  case STAT_REQS -> stats[0];
	  case STAT_MAX_TIME -> stats[2];
	  case STAT_AVG_TIME -> (stats[1] / stats[0]);
	};
	AbstractResponse response = new SuccessfulResponse(
			formatValue(result, 3),
			this.finalizeRequestExecutionTime()
	);
	return new CommandResponse(response, commandType);
  }
}
