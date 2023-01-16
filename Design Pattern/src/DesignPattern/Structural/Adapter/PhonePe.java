package DesignPattern.Structural.Adapter;

public class PhonePe {
    private BankApiAdapter bankApiAdapter;

    public PhonePe(BankApiAdapter bankApiAdapter) {
        this.bankApiAdapter = bankApiAdapter;
    }

    public boolean doTransaction(String fromAccountNo, String toAccountNo, int amount, String pin){
        if(bankApiAdapter.authenticate(fromAccountNo, pin)){
            float balance = bankApiAdapter.checkBalance(fromAccountNo, pin);
            if(balance >= amount){
                if(bankApiAdapter.transaction(fromAccountNo, toAccountNo)){
                    return true;
                }
            }
        }
        return false;
    }
}
