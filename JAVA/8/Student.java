public class Student {
    private String name;
    private String subject;
    private static int count=0;

    public Student(String name){
        setName(name);
        count++;
    }

    public Student(String name, String subject){
        setName(name);
        setSubject(subject);
        count++;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    public static int getCount(){
        return count;
    }

    public String toString(){
        if(getSubject()==null){return "學生姓名："+getName()+" 不分系";}
        else{return "學生姓名："+getName()+" 系級："+getSubject();}
    }
}
