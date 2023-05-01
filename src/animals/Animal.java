package animals;

public abstract class Animal implements Speakers{
    protected int height;
    protected int weight;
    protected String eyesColor;
    protected int id;
    public static int counter;

    static {
        counter = 0;
    }


    public Animal(int height, int weight, String eyesColor) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
        counter++;
        id = counter;
    }
    public Animal(){
        this(0, 0, "Unknown");
    }

    public String getType() {
        return super.getClass().getSimpleName();
    }

    public int getId() {
        return id;
    }
}
