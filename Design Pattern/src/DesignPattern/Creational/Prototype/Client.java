package DesignPattern.Creational.Prototype;

public class Client {

    public static StudentRegistry fillUpRegistry(StudentRegistry studentRegistry){
        Student aprBatch = new Student();
        aprBatch.setAvgBatchPsp(80);
        aprBatch.setBatchName("apr-LLD");
        aprBatch.setYearOfEnroll(2022);
        studentRegistry.register(aprBatch);

        Student mayBatch = new Student();
        mayBatch.setAvgBatchPsp(85);
        mayBatch.setBatchName("may-LLD");
        mayBatch.setYearOfEnroll(2022);
        studentRegistry.register(mayBatch);

        IntellijentStudent intelliAprBatch = new IntellijentStudent();
        intelliAprBatch.setAvgBatchPsp(90);
        intelliAprBatch.setBatchName("Apr-LLD");
        intelliAprBatch.setYearOfEnroll(2022);
        intelliAprBatch.setIq(100);
        studentRegistry.register(intelliAprBatch);

        return studentRegistry;

    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();

        studentRegistry = fillUpRegistry(studentRegistry);

        Student aprBatchTemplate = studentRegistry.get("Apr-LLD");
        Student mayBatchTemplate = studentRegistry.get("may-LLD");
    }
}
