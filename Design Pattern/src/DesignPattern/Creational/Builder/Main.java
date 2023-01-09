package DesignPattern.Creational.Builder;

public class Main {
    public static void main(String[] args) throws Exception {
        Student s = Student.builder().setAge(25)
                .setName("Abhijit").
                setId(2).
                setPsp(80).
                setYoe(2022).
                build();

        System.out.println(s.getAge());
        System.out.println(s.getName());

    }
}
