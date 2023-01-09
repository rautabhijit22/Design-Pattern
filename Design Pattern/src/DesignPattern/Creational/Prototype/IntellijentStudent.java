package DesignPattern.Creational.Prototype;

public class IntellijentStudent extends Student {
    private int iq;

    public IntellijentStudent() {
    }

    public IntellijentStudent(IntellijentStudent student) {
        super(student); //copy all attributes present in parent (student)
        this.iq = student.iq;  // copy attribute present in child (intelligentstudent)
    }

    public IntellijentStudent clone(){
        return new IntellijentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
