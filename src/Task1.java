public class Task1 {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        //Задание №1: Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды. (Заменить кол-во аппетита у кота)

        Cat cat = new Cat("Barsik", 95);
        Plate plate = new Plate(100);
        plate.info();

        if (cat.getAppetite() <= plate.getFood()) {
            System.out.println("Кот покушал, в тарелке осталось: " + (plate.getFood() - (cat.getAppetite())));
        }
        else {
            System.out.println("В тарелке меньше еды, чем хочет съесть кот");
        }
    }
}