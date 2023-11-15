package one.java;

public class Elf {
    private int total;

    public Elf(){
        total = 0;
    }

    public void addFood(int calories){
        total += calories;
    }

    public int getTotal(){
        return total;
    }
}
