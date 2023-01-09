package DesignPattern.Structural.Adapter;

import DesignPattern.Structural.Adapter.thirdParty.banks.YesBankApi;

public class YesBankAdapter implements BankApiAdapter{

    private YesBankApi yesBankApi;

    public YesBankAdapter() {
        this.yesBankApi = yesBankApi;
    }

    @Override
    public float checkBalance(String accountNo, String pin) {
        //write logic to check balance using yes bank
        return 0;
    }

    @Override
    public boolean authenticate(String accountNo, String pin) {
        //write logic to authenticate  using yes bank
        return false;
    }

    @Override
    public boolean transaction(String fromAccountNo, String toAccountNo) {
        //write logic to transaction  using yes bank
        return false;
    }
}
