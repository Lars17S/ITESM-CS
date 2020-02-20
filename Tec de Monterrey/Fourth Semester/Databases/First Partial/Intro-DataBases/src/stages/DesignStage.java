package stages;

import java.util.Calendar;

public class DesignStage extends Stage {
    Integer numComponents;

    public DesignStage(Calendar startDate, Calendar endDate, Integer numComponents) {
        super(startDate, endDate);
        this.numComponents = numComponents;
        calculateCost();
    }

    @Override
    public void calculateCost() {
        cost = 850.00 * numComponents;
    }
}
