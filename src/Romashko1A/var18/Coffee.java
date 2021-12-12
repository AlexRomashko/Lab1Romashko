package Romashko1A.var18;

public class Coffee extends Food{


    private String aroma; // параметр кофе (аромат)

    public String getAroma(){
        return aroma;
    }

    public void setAroma(String aroma){
        this.aroma = aroma;
    }

    public Coffee(String aroma){
        super ("Кофе"); //переход к конструктуру класса Food
        this.aroma = aroma;
    }

    //функция сьедение (определена для Coffee)
    public void consume(){
        System.out.println(this + " выпито");
    }

    public String toString() {
        return super.toString() + " c ароматом '" + aroma.toUpperCase() + "'";
    }

}
