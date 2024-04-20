package LabAssignment;

import java.util.Arrays;

class Campus{
    private String cName;
    private String cHead;
    private String Address;
    private int phone_no;
    private static Department department[];
    private int counter=0;


    Campus()
    {
        this.cName=cName;
        this.cHead=cHead;
        this.Address=Address;
        this.phone_no=phone_no;
        this.department=new Department[100];
    }

    Campus(String cName, String cHead,Department []department, int phone_no)
    {
        this.cName = cName;
        this.cHead = cHead;
        this.department=  new Department[department.length];
        for(int i=0;i<department.length;i++)
        {
            if(department[i]!=null)
                this.department[i]=department[i];

        }
        this.phone_no = phone_no;
    }


    public void setcName(String cName)
    {
        this.cName= cName;
    }

    public void setcHead(String cHead)
    {
        this.cHead= cHead;
    }

    public void setAddress(String Address) {

        this.Address= Address; }

    public void setphone_no(int phone_no) {


        this.phone_no= phone_no;
    }

    public String getCname()
    {
        return cName;
    }

    public String getChead()
    {
        return cHead;
    }

    public String getAddr()
    {
        return Address;
    }

    public int getPhone()
    {
        return phone_no;
    }





    @Override
    public String toString() {
        StringBuilder departmentDetails  = new StringBuilder("\n\nDepartment Details\n");
        for (int i = 0; i <counter; i++) {
            departmentDetails.append("\n").append(department[i]);
        }
        return String.format("Campus Name: %s\nCampus Head: %s\nCampus Address: %s\nPhone Number: %s",cName, cHead,Address,phone_no) + departmentDetails;
    }



    public void addNewDepartment(Department dep) {
        if (counter < department.length) {
            department[counter++] = dep;
        }
    }


    public Department[] getCampus(){
        return department;
    }
    @Override
    public boolean equals(Object o){
        Campus p=(Campus)o;

        return this.phone_no==p.phone_no && this.cName.equals(p.cName) &&  this.cHead.equals(p.cHead) && this.Address.equals(p.Address)  && Arrays.equals(this.department, p.department);
    }



    @Override
    public Object clone()
    {
        return new Campus(this.cName,this.cHead,this.department.clone(),this.phone_no);
    }
}


