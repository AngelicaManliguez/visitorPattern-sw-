package VisitorPattern;

public class UnliCallTextPackage implements UnliCallsTextOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (telcoName.equals("Smart")) {
            return unliCallText ? "Unlimited calls and texts." : "No unlimited calls and texts. They do not offer any free calls or texts, and you will be charged per use.";
        } else if (telcoName.equals("Globe")) {
            return unliCallText ? "Unlimited calls and texts. This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra." : "No unlimited calls and texts. They do not offer any free calls or texts, and you will be charged per use.";
        } else if (telcoName.equals("Ditto")) {
            return unliCallText ? "Unlimited calls and texts. This plan includes unlimited calls and texts to all networks within the country." : "No unlimited calls and texts. They do not offer any free calls or texts, and you will be charged per use.";
        } else {
            return "Unknown Telco";
        }
    }
}
