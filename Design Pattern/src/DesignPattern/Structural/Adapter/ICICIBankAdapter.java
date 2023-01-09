package DesignPattern.Structural.Adapter;

import DesignPattern.Structural.Adapter.thirdParty.banks.ICICIApi;

public class ICICIBankAdapter implements BankApiAdapter{

    private ICICIApi iciciApi;

    public ICICIBankAdapter() {
        this.iciciApi = iciciApi;
    }

    @Override
    public float checkBalance(String accountNo, String pin) {
        //write logic to check balance using icici
        return 0;
    }

    @Override
    public boolean authenticate(String accountNo, String pin) {
        //write logic to authenticate balance using icici
        return false;
    }

    @Override
    public boolean transaction(String fromAccountNo, String toAccountNo) {
        //write logic to transaction balance using icici
        return false;
    }
}
