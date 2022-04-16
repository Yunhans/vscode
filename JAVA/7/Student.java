public class Student {
    private String name;
    private String subject;

    public Student(String name){
        setName(name);
    }

    public Student(String name, String subject){
        setName(name);
        setSubject(subject);
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

    public String toString(){
        if(getSubject()==null){return "學生姓名："+getName()+" 不分系";}
        else{return "學生姓名："+getName()+" 系級："+getSubject();}
    }
}
