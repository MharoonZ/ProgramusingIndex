package LabAssignment;

import java.util.Arrays;

class PcLab {
    private  String labName;
    private  Pc pcList[];
    private  String labAssistant;
    private  String labInCharge;
    private int pcCount = 0;


    PcLab() {
        this.labName = labName;
        this.pcList = new Pc[100];
        this.labAssistant = labAssistant;
        this.labInCharge = labInCharge;
    }


    PcLab(String labName, Pc[] pcList, String labAssistant, String labInCharge)
    {
        this.labName = labName;
        this.pcList=  new Pc[pcList.length];
        for(int i=0;i<pcList.length;i++)
        {
            if(pcList[i]!=null)
                this.pcList[i]=pcList[i];

        }
        this.labAssistant = labAssistant;
        this.labInCharge = labInCharge;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(String labAssistant) {
        this.labAssistant = labAssistant;
    }

    public String getLabInCharge() {
        return labInCharge;
    }

    public void setLabInCharge(String labInCharge) {
        this.labInCharge = labInCharge;
    }

    public void addPc(Pc pcs) {
        pcList[pcCount++] = pcs;
    }

    @Override
    public String toString() {
        StringBuilder pcDetails = new StringBuilder("\n\nPC's Details\n");
        for (int i = 0; i < pcCount; i++) {
            pcDetails.append("\n").append(pcList[i]);
        }
        return String.format("Lab Name: %s\nLab InCharge: %s\nLab Assistant: %s", labName, labInCharge, labAssistant) + pcDetails;
    }

    public Pc[] getPcList(){
        return pcList;
    }

    public void setPcList(Pc newList[]){
        pcList=newList;

    }


    public  boolean equals(Object o)
    {
        PcLab p = (PcLab)o;
        return labName.equals(p.labName) &&  labAssistant.equals(p.labAssistant)  && labInCharge.equals(p.labInCharge) && Arrays.equals(pcList,p.pcList);
    }

    public Object clone()
    {
        return new PcLab(labName,pcList.clone(), labAssistant,labInCharge);

    }

}



