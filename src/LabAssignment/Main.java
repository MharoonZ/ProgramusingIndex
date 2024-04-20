package LabAssignment;

class Main {
    public static void main(String[] args) {

        Input Obj = new Input();
        Obj.menu();

    }

}






















































































/*
public class Main {
    public static void main(String[] args) {
        // Create departments for comparison
        Department department1 = new Department();
        department1.setdName("Department ");
        department1.setdHead("Head 1");

        Department department2 = new Department();
        department2.setdName("Department 1");
        department2.setdHead("Head 1");

        // Create PC labs for comparison
        PcLab pcLab1 = new PcLab();
        pcLab1.setLabName("Lab 1");
        pcLab1.setLabAssistant("Assistant 1");
        pcLab1.setLabInCharge("In Charge 1");

        PcLab pcLab2 = new PcLab();
        pcLab2.setLabName("Lab 1");
        pcLab2.setLabAssistant("Assistant 1");
        pcLab2.setLabInCharge("In Charge 1");

        // Assign PC labs to departments
        department1.addNewLab(pcLab1);
        department2.addNewLab(pcLab2);

        // Create campuses for comparison
        Campus campus1 = new Campus();
        campus1.setcName("Main Campus");
        campus1.setcHead("Head 1");
        campus1.setAddress("123 Main Street");
        campus1.setphone_no(1234567890);
        campus1.addNewDepartment(department1);

        Campus campus2 = new Campus();
        campus2.setcName("Main Campus");
        campus2.setcHead("Head 1");
        campus2.setAddress("123 Main Street");
        campus2.setphone_no(1234567890);
        campus2.addNewDepartment(department2);

        // Test equality
        System.out.println("Are campuses equal? " + campus1.equals(campus2));
    }
}
*/
