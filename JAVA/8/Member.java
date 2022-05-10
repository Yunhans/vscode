public class Member {
    private String name;
    private int fee;

    public Member(String name, int fee){
        this.name = name;
        this.fee = fee;
    }

    public String getName(){
        return name;
    }

    public int getFee(){
        return fee;
    }

    public String toString(){
        return String.format("%s\tMembership fee: %d\n", getName(), getFee());
    }
}
