public abstract class Clothing extends Item implements Comparable<Item> {

    public static enum Size {SMALL, MEDIUM, LARGE};

    private Size size;

    public Clothing(String name, Size size) {
        super(name);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Size:" + size;
    }

    @Override
    public int compareTo(Item item) {
        return 1;
    }
}
