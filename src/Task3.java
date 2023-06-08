public class Task3 {
    public static void main(String[] args) {
        System.out.println("Задание №2");
        //Задание №3: Создать массив котов и тарелку с едой,
        //попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль..
        Plate plate = new Plate(100);
        plate.info();

        Cat[] cats = {
                new Cat("Vasya", 40),
                new Cat("Myrzik",30),
                new Cat("Barsik", 40)
        };
        int temp = plate.getFood();
        for (Cat Cat: cats){
            if (Cat.getAppetite() < plate.getFood()){
                int i = temp - Cat.getAppetite();
                temp = i;
                if (temp > 0){
                    System.out.println("Котику " + (Cat.getName()) + " хватило еды!");
                }
                else {
                    System.out.println("Котику " + (Cat.getName()) + " не хватило еды:(");
                }
            }
        }
    }
}

