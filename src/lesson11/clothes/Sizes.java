package lesson11.clothes;


public enum Sizes {
    XXS(34) {
        public void getDescription() {
            System.out.println("Детский размер одежды");
        }
    }, XS(36), S(38), M(40), L(42);
    private int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void getDescription() {
        System.out.println("Взрослый размер одежды");
    }
}
