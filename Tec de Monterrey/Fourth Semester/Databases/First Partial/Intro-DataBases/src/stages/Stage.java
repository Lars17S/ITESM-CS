package stages;

import java.util.Calendar;

public abstract class Stage {
    Calendar startDate;
    Calendar endDate;
    Double cost;

    public Stage(Calendar startDate, Calendar endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public abstract void calculateCost();

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Double getCost() {
        return cost;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public Calendar getStartDate() {
        return startDate;
    }
}
