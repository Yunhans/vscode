public class Course {
    private String courseName;
    private Student [] students = new Student [5];
    private String classmates="";

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(Student s){
        for( Student student : students ){
            if(student == null){
                student = s;
                classmates += "\n";
                classmates += s;
                break;
            }
        }
    }

    public String toString(){
        return String.format("課程：%s%s\n", courseName, classmates);
    }
}
