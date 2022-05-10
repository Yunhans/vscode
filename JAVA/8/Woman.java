public class Woman {
    private String name;
    private boolean housekeeping;

    public Woman(String name, boolean housekeeping){
        setName(name);
        setHouseKeeping(housekeeping);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHouseKeeping(boolean housekeeping){
        this.housekeeping = housekeeping;
    }

    public String getName(){
        return name;
    }

}
