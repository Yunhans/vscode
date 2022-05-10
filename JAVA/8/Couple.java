public class Couple {
    private Man man;
    private Woman woman;

    public Couple(Man man, Woman woman){
        setMan(man);
        setWoman(woman);
    }

    public void setMan(Man man){
        this.man = man;
    }

    public void setWoman(Woman woman){
        this.woman = woman;
    }

    public void changeMan(Man man){
        this.man = man;
    }

    public String toString(){
        return String.format("%s and %s are now in love.", woman.getName(), man.getName());
    }
}
