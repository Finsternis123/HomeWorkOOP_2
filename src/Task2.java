public class Task2 {

    public static void main(String[] args) {
        System.out.println("Задание №2");
        //Задание №2: Каждому коту нужно добавить поле сытость.
        //Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт.
        Plate plate = new Plate(100);
        plate.info();

        Cat[] cats = {
                new Cat("Vasya", 30),
                new Cat("Myrzik",30),
                new Cat("Barsik", 150)
        };
        for (Cat Cat: cats){
            if (Cat.getAppetite() > plate.getFood()){
                System.out.println((Cat.getName()) + " не поел, ему не хватает " + ((Cat.getAppetite() - plate.getFood())));
            }
            else{
                System.out.println((Cat.getName()) + " покушал, он съел " + ((plate.getFood() - Cat.getAppetite())));
            }
        }
    }
}