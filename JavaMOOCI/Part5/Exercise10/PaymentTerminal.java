package JavaMOOCI.Part5.Exercise10;

public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double cheapMeal = 2.50;
        if (payment >= cheapMeal){
            affordableMeals++;
            this.money+= cheapMeal;
            return payment - cheapMeal;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double cheapMeal = 2.50;
        if (card.balance() >= cheapMeal){
            affordableMeals++;
            card.takeMoney(cheapMeal);
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double expensiveMeal = 4.30;
        if (payment >= expensiveMeal){
            heartyMeals++;
            this.money+= expensiveMeal;
            return payment - expensiveMeal;
        } else {
            return payment;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double expensiveMeal = 4.30;
        if (card.balance() >= expensiveMeal){
            heartyMeals++;
            card.takeMoney(expensiveMeal);
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum <= 0){
            return;
        }
        card.addMoney(sum);
        this.money+= sum;
    }

    // Code below was given by UoH
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}

