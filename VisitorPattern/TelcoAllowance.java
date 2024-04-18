package VisitorPattern;

public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(TelcoSubscription subscription) {
        return subscription.getDataAllowance() +"GB for "+ subscription.getPromoPrice() + " per month";
    }
}

