package stages;

import java.util.Calendar;

public class ImplemStage extends Stage {

    AnalysisStage analysisStage;

    public ImplemStage(Calendar startDate, Calendar endDate, AnalysisStage analysisStage) {
        super(startDate, endDate);
        this.analysisStage = analysisStage;
        calculateCost();
    }

    @Override
    public void calculateCost() {
        cost = (endDate.compareTo(analysisStage.getEndDate()) <= 0) ? 7200.00 : (1.20 * 7200.00);
    }
}
