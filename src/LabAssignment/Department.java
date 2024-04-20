package LabAssignment;

import java.util.Arrays;
class Department{

    private String dName;
    private String dHead;
    private static PcLab pcLabs[];
    private int counter=0;



    Department(){
        this.dName=dName;
        this.dHead=dHead;
        this.pcLabs=new PcLab[100];
    }

    Department(String dName, PcLab[] pcLabs, String  dHead)
    {
        this.dName = dName;
        this.pcLabs=  new PcLab[pcLabs.length];
        for(int i=0;i<pcLabs.length;i++)
        {
            if(pcLabs[i]!=null)
                this.pcLabs[i]=pcLabs[i];

        }
        this.dHead = dHead;
    }


    public void setdName(String dName)
    {
        this.dName= dName;
    }

    public void setdHead(String dHead)
    {
        this.dHead=dHead;
    }

    public String getcName()
    {
        return dName;
    }

    public String getdHead()
    {
        return dHead;
    }



    public void addNewLab(PcLab lab){

        pcLabs[counter++]=lab;
    }


    @Override
    public String toString() {
        StringBuilder LabDetails  = new StringBuilder("\n\nLab Details\n");
        for (int i = 0; i <counter; i++) {
            LabDetails.append("\n").append(pcLabs[i]);
        }
        return String.format("Department Name: %s\nDepartment InCharge: %s",dName, dHead) + LabDetails;
    }

    public PcLab[] getLabs(){
        return pcLabs;
    }


    @Override
    public boolean equals(Object o){
        Department p=(Department)o;
        return this.dName.equals(p.dName) &&  this.dHead.equals(p.dHead) && Arrays.equals(pcLabs,p.pcLabs);
    }



    @Override
    public Object clone()
    {
        return new Department(this.dName,this.pcLabs.clone(),this.dHead);
    }
}

