public class Cat {
    private String name;
    private int appetite;

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat() { }
}
