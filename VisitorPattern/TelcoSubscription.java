package VisitorPattern;

public interface TelcoSubscription {
    String accept(UsagePromo promo);
    String accept(UnliCallOffer offer);

    String getTelcoName();
    int getDataAllowance();
    double getPromoPrice();
    boolean hasUnliCallText();

}
