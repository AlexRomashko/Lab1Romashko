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

        System.out.println("Всего хорошего!");
    }
}
