package LabAssignment;

import java.util.Scanner;

class Input{
    private int userinput;
    private University U1= new University();
    private Campus C1= new Campus();
    private Department D1= new Department();
    private PcLab P1= new PcLab();
    private Pc pc1= new Pc();

    private Scanner inputvalues = new Scanner(System.in);

    public void menu(){
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add University\n2. Add Campus\n3. Add Department\n4. Add PcLab\n5. Add Pcs\n6. Display Universities\n7. Display Campuses\n8. Display Departments\n9. Display PcLabs\n10. Display Pcs\n0. Exit");

            userinput= inputvalues.nextInt();
            switch(userinput)
            {
                case 1:
                    System.out.println("Enter univeristy name");
                    U1.setUni(inputvalues.next());

                    break;


                case 2:
                    C1= new Campus();
                    System.out.println("Enter campus name");
                    C1.setcName(inputvalues.next());
                    System.out.println("Enter campus head");
                    C1.setcHead(inputvalues.next());
                    System.out.println("Enter campus Address");
                    C1.setAddress(inputvalues.next());
                    System.out.println("Enter campus Phone number");
                    C1.setphone_no(inputvalues.nextInt());
                    U1.addNewCampus(C1);
                    break;

                case 3:
                    D1= new Department();
                    System.out.println("Enter Department Name");
                    D1.setdName(inputvalues.next());
                    System.out.println("Enter Department head name");
                    D1.setdHead(inputvalues.next());

                    Campus[] camp = U1.getCampuses();

                    System.out.println("Enter the array index of the campus to add the department:");
                    int campusIndex = inputvalues.nextInt();

                    camp[campusIndex].addNewDepartment(D1);

//C1.addNewDepartment(D1);
                    break;

                case 4:
                    P1= new PcLab();
                    System.out.println("Enter lab Name");
                    P1.setLabName(inputvalues.next());

                    System.out.println("Enter lab Assistant name");
                    P1.setLabAssistant(inputvalues.next());

                    System.out.println("Enter lab incharge name");
                    P1.setLabInCharge(inputvalues.next());

                    Department[] dep = C1.getCampus();


                    System.out.println("Enter the array index of the department to add the PCLAB:");
                    int depIndex= inputvalues.nextInt();
                    dep[depIndex].addNewLab(P1);
                    //D1.addNewLab(P1);

                    break;

                case 5:
                    pc1= new Pc();
                    System.out.println("Enter id:");
                    pc1.setId(inputvalues.nextInt());
                    System.out.println("Enter CPU:");
                    pc1.setCpu(inputvalues.next());

                    System.out.println("Enter RAM:");
                    pc1.setRam(inputvalues.next());

                    System.out.println("Enter storage:");
                    pc1.setStorage(inputvalues.next());

                    System.out.println("Enter LCD maker:");
                    pc1.setLcdMaker(inputvalues.next());

                    System.out.println("Does it have GPU? (true/false):");
                    pc1.setGpu(inputvalues.nextBoolean());

                    PcLab[] lab = D1.getLabs();
                    System.out.println("Enter the array index of the PCLAB to add the PCs:");

                    int labIndex= inputvalues.nextInt();
                    lab[labIndex].addPc(pc1);

                    //P1.addPc(pc1);
                    break;

                case 6:
                    System.out.println(U1);
                    break;
                case 7:
                    System.out.println(C1);
                    break;
                case 8:
                    System.out.println(D1);
                    break;
                case 9:
                    System.out.println(P1);
                    break;
                case 10:
                    System.out.println(pc1);
                    break;
            }
        } while (userinput != 0);
    }
}












