import javax.swing.JOptionPane;
public class Registration{
    public static void main(String [] args){
        int [] grades = new int [5];
        String name = JOptionPane.showInputDialog(null,"學生姓名");
        String address = JOptionPane.showInputDialog(null,"地址");
        Student s1 = new Student(name,address);

        for(int i=0; i<5; i++){
            grades[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"成績"+(i+1)));
        }
        s1.setGrades(grades);
        JOptionPane.showMessageDialog(null,s1);
    }
}
