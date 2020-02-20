package stages;

import java.util.Calendar;

public class AnalysisStage extends Stage {
    Integer extraDays;

    public AnalysisStage(Calendar startDate, Calendar endDate, Integer extraDays) {
        super(startDate, endDate);
        this.extraDays = extraDays;
        calculateCost();
    }

    @Override
    public void calculateCost() {
        cost = 3700.00 + 450.00 * extraDays;
    }
}
