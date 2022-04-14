public class Student {
    private String name;
    private String address;
    private int grades[];

    public void setName(String a){
        name = a;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String a){
        address = a;
    }
    public String getAddress(){
        return address;
    }

    public void setGrades(int [] a){
        grades = a;
    }

    public int [] getGrades(){
        return grades;
    }

    public Student(String name,String address){
        setName(name);
        setAddress(address);
    }
    public double getAverage(){
        int total =0;
        for(int grade : grades){
            total+=grade;
        }
        return(double)total/grades.length;
    }
    public String toString(){
        return "學生姓名: "+name+" 總平均為: "+getAverage();
    }
}
