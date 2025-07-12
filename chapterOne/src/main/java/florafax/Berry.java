package florafax;

public class Berry {

    private int weight = 0;
    private String color = "";
    private String shape = "";

    public Berry(int weight, String color, String shape) {
        this.weight = weight;
        this.color = color;
        this.shape = shape;
    }

    public String toString() {
        return String.format("Berry{color='%s', weight=%d, shape=%s}", color, weight, shape);
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }
}
