package DesignPattern.Structural.Adapter;

public interface BankApiAdapter {
    float checkBalance(String accountNo, String pin);
    boolean authenticate(String accountNo, String pin);
    boolean transaction(String fromAccountNo, String toAccountNo);
}
