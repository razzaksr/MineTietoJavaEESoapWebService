package mysoap;

import app.mybank.entity.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class ListCreditCard {
    private List<CreditCard>creditCards=new ArrayList<>();

    @Override
    public String toString() {
        return "ListCreditCard{" +
                "creditCards=" + creditCards +
                '}';
    }

    public ListCreditCard() {
    }

    public ListCreditCard(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
}
