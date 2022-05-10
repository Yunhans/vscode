public class Man {
    private String name;
    private int income;

    public Man(String name, int income){
        setName(name);
        setIncome(income);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIncome(int income){
        this.income = income;
    }

    public String getName(){
        return name;
    }

    public int getIncome(){
        return income;
    }

}
