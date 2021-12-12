package Romashko1A.var18;

public class Main {

    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20]; //создаём массим из обьектов Food

        //проверяем введённые аргументы и заносим в массив breakfast (если аргументы еда)
        for (int i = 0; i < args.length; i++) {
            String[] parts = args[i].split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[i] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[i] = new Apple(parts[1]);
            } else if (parts[0].equals("Coffee")) {
                breakfast[i] = new Coffee(parts[1]);
            }
        }

        //употребляем продукты
        for (Food item : breakfast) {
            if (item != null)
                item.consume();
            else
                break;
        }

        System.out.println();

        Food[] foods = new Food[6];

        //массив (со всеми возможными параметрами) продуктов
        foods[0] = new Coffee("восточный");
        foods[1] = new Coffee("насыщенный");
        foods[2] = new Coffee("горький");
        foods[3] = new Apple("маленькое");
        foods[4] = new Apple("среднее");
        foods[5] = new Apple("большое");

        //проверяем кол-во продуктов с заданным параметром и выводим их кол-во
        System.out.println(foods[0] + ": " + countFoods(breakfast, foods[0]));
        System.out.println(foods[1] + ": " + countFoods(breakfast, foods[1]));
        System.out.println(foods[2] + ": " + countFoods(breakfast, foods[2]));
        System.out.println(foods[3] + ": " + countFoods(breakfast, foods[3]));
        System.out.println(foods[4] + ": " + countFoods(breakfast, foods[4]));
        System.out.println(foods[5] + ": " + countFoods(breakfast, foods[5]));

        System.out.println();

        printFoods(breakfast); //считаем кол-во заданных продуктов

        System.out.println();

        System.out.println("Всего хорошего!");
    }

    //подсчёт продуктов с одинаковыми параметрами
    static Integer countFoods(Food[] breakfast, Food food) {
        Integer count = 0;
        for(int i = 0; i < breakfast.length; i++) {
            if(food.equals(breakfast[i]))
            {
                count++;
            }
        }
        return count;
    }

    // подсчёт одинаковых продуктов
    static void printFoods(Food[] breakfast){
        int c = 0;
        int a = 0;
        int co = 0;
        for(int i = 0; i < breakfast.length; i++) {

            if(breakfast[i] instanceof Cheese){
                c++;
            }
            else if (breakfast[i] instanceof Apple){
                a++;
            }
            else if (breakfast[i] instanceof Coffee){
                co++;
            }
        }
        System.out.println("CЫР - " + c);
        System.out.println("ЯБЛОКО - " + a);
        System.out.println("КОФЕ - " + co);
    }
}
