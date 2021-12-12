package Romashko1A.var18;

public class Apple extends Food {

    private String size; //параметр яблока

    // проверка на совпадение параметра
    public boolean equals(Object obj) {
        if (!(obj instanceof Apple)) {
            return false;
        } else if (size == null || ((Apple) obj).size == null) {  // размер не задан
            return false;
        }
        else if (!(size.equals(((Apple) obj).size))) {
            return false;
        }
        return super.equals(obj);
    }

    public Apple(String size) {
        super("Яблоко"); //переход к конструктору класса предка Food
        this.size = size;
    }

    //функция сьедение (определена для Apple)
    public void consume() {
        System.out.println(this + " съедено");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}
