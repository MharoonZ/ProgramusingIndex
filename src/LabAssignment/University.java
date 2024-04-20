package LabAssignment;



class University{

    private String Uni_name;
    private Campus campus[];
    private int counter=0;



    University()
    {
        this.Uni_name=Uni_name;
        this.campus= new Campus[100]; }

    University(String Uni_name, Campus[] campus)
    {
        this.Uni_name = Uni_name;
        this.campus=  new Campus[campus.length];
        for(int i=0;i<campus.length;i++)
        {
            if(campus[i]!=null)
                this.campus[i]=campus[i];

        }
    }


    public void addNewCampus(Campus camp){
        campus[counter++]= camp;
    }

    public Campus[] getCampuses() {
        return campus;
    }

    @Override
    public boolean equals(Object o){
        University p=(University)o;
        return this.Uni_name.equals(Uni_name);
    }


    @Override
    public Object clone()
    {
        return new University(this.Uni_name,this.campus.clone());
    }



    public void setUni(String Uni_name){
        this.Uni_name=Uni_name;
    }

    public String getUni(){
        return Uni_name;
    }

    @Override
    public String toString() {
        StringBuilder pcDetails = new StringBuilder("\n\nCampus Details\n");
        for (int i = 0; i < counter; i++) {
            pcDetails.append("\n").append(campus[i]);
        }
        return String.format("University Name: %s",Uni_name) + pcDetails;
    }
}
