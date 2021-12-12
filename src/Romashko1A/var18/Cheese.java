package Romashko1A.var18;

public class Cheese extends Food {
    public Cheese() {
        super("Сыр"); //переход к конструктору класса предка Food
    }

    //функция сьедение (определена для Cheese)
    public void consume() {
        System.out.println(this + " съеден");
    }
}
