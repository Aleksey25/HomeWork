package zzz;

/**
 * Created by student on 5/21/2017.
 */
public enum Season {
    WINTER(-5), SPRING(9), SUMMER(25){
        public void getDescription(){
            System.out.println("Теплое время года");
                    }}, AUTUMN(6);
    private int temp;

    Season(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
    public void getDescription(){
        System.out.println("Холодное время года");
    }
}
