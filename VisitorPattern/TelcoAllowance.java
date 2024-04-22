package VisitorPattern;

public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double money, int dataAllowance) {
        String allowance = telcoName + " offers a data allowance of "+ dataAllowance +"GB for ₱"+ money +" per month.";
        return allowance;
    }
}

