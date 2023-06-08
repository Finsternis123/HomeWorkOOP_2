public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("На тарелке: " + food);
    }

    public int getFood() {
        return food;
    }
}
