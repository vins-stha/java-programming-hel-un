public class Cube {
    private int length;

    public Cube(int length) {
        this.length = length;
    }

    public int volume() {
        return this.length * this.length * this.length;
    }

    @Override
    public String toString() {
        return "The length of the edge is " + length + " and the volume " + this.volume();
    }
}

