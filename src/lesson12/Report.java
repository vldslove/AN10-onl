package lesson12;

public class Report {
    private int productionPlan;
    private int planFulfillment;
    private int salary;
    private int bonus;
    private boolean acquainted;

    public Report(int productionPlan, int planFulfillment, int salary,  boolean acquainted) {
        this.productionPlan = productionPlan;
        this.planFulfillment = planFulfillment;
        this.salary = salary;
        this.bonus = bonusAmount();
        this.acquainted = acquainted;
    }

    public int getProductionPlan() {
        return productionPlan;
    }

    public void setProductionPlan(int productionPlan) {
        this.productionPlan = productionPlan;
    }

    public int getPlanFulfillment() {
        return planFulfillment;
    }

    public void setPlanFulfillment(int planFulfillment) {
        this.planFulfillment = planFulfillment;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public boolean isAcquainted() {
        return acquainted;
    }

    public void setAcquainted(boolean acquainted) {
        this.acquainted = acquainted;
    }

    public int bonusAmount(){
        if (planFulfillment == 2 * productionPlan){
            bonus = salary;
        } else if (planFulfillment == 1.5 * productionPlan){
            bonus = (int) (salary * 0.5);
        } else if (planFulfillment == productionPlan) {
            bonus = 0;
        }
        return bonus;
    }

    @Override
    public String toString() {
        return  "План производства продуцкии: " + productionPlan +
                ", Количество произведенной продукции: " + planFulfillment +
                ", Зарплата: " + salary +
                ", Премия: " + bonus +
                ", Ознакомлен: " + acquainted + '\'' +
                '}';
    }
}
