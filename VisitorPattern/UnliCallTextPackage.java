package VisitorPattern;

public class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(TelcoSubscription subscription) {
        String offer = subscription.hasUnliCallText() ? "unlimited calls and texts" : "no unlimited calls and texts";
        return offer;
    }
}
