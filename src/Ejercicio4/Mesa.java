package Ejercicio4;

public class Mesa {
    int numPatas;
    String color;

    public Mesa(int numPatas, String color) {
        this.numPatas = numPatas;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "numPatas=" + numPatas +
                ", color='" + color + '\'' +
                '}';
    }
}
