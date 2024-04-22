package VisitorPattern;

public interface TelcoSubscription {
    String accept(UsagePromo promo, double price);
    String accept(UnliCallsTextOffer unliPackage, boolean unliCallText);

    String getTelcoName();
    double getPromoPrice();
    boolean hasUnliCallText();
    int getDataAllowance();
}
