public class PaymentCard {
    
    private double balance;

    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }

    public String toString(){
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably(){
        if (this.balance >= 2.60) {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily(){
        if (this.balance >= 4.60) {
            this.balance = this.balance - 4.60;
        }
    }

    public void addMoney(double amount){
        if (amount > 0){
            double total = this.balance + amount;
            if (total >= 150){
                this.balance = 150;
            } else {
                this.balance += amount;
            }
        }
    }
}
