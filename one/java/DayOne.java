package one.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class DayOne {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\theri\\Projects\\2022 Advent of Code\\one\\AOC2022_Day_1_Input.txt");
        Scanner scanner = new Scanner(file);

        List<Integer> calorieTotals = new ArrayList<>();
        Elf currentElf = new Elf();
        while(scanner.hasNext()){
            String nextLine = scanner.nextLine();
            if(nextLine.equals("")) {
                calorieTotals.add(currentElf.getTotal());
                currentElf = new Elf();
            }
            else{
                currentElf.addFood(Integer.parseInt(nextLine));
            }
        }
        int topCalories = 0;
        for(int elf : calorieTotals){
            if (elf > topCalories) topCalories = elf;
        }

        System.out.println(topCalories);
    }
}
