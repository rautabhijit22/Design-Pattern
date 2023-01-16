package DesignPattern.Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new YesBankAdapter());
    }
}
