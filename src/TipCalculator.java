public class TipCalculator {
    //Instance Variables //
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip;

    //Initializing variables//
    public TipCalculator(int numPeople double tip) {
        this.numPeople = numPeople;
        this.tipPercentage =tip;
        totalBillBeforeTip = 0.0;
    }

    //Methods that will be used in the main class//
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }
    public double getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }
    public double tipAmount() {
        return totalBillBeforeTip * tipPercentage;
    }
    public double totalBill() {
        return totalBillBeforeTip + tipAmount();
    }
    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip / numPeople;
    }
    public double perPersonTipAmount() {
        return tipAmount() / numPeople;
    }
    public double perPersonTotalCost() {
        return perPersonCostBeforeTip() + perPersonTipAmount();
    }
}
