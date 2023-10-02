
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);
        System.out.println("Enter a list of numbers:");
        String List = var.nextLine();
        System.out.println("previous list enter by the user: "+List);
        System.out.println("the average of this list is: "+averageList(List));

        var.close();
    }

    public static int averageList (String stringList){
        ArrayList<String> newStringList = new ArrayList<>(Arrays.asList(stringList.split(" ")));
        ArrayList<Integer> newIntList = new ArrayList<>();
        newStringList.forEach((item) -> newIntList.add(Integer.parseInt(item)));
        int average=0;
        for (int i=0;i<newIntList.size();i++){
            average+=newIntList.get(i);
        }
        //System.out.println(newIntList.size());
        //System.out.println(average);
        return average/newIntList.size();
    }
}