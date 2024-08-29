public class GiftCard implements GiftBox{
    private double moneyAmount;
    private String companyName;

    public GiftCard(double moneyAmount, String companyName) {
        this.moneyAmount = moneyAmount;
        this.companyName = companyName;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void activateGiftBox() {
        if(moneyAmount > 0){
            System.out.println("You got a gift card! Congratulations!");
            moneyAmount = 0;
        }
    }
}
