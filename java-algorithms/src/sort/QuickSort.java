package sort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args){

        String fileName = "quicksort.txt";
        ArrayList<Integer> nums = getNums(fileName);
        System.out.println(nums.size());

        for(int i = 0; i < 12; i++)
            System.out.println(getPivot(20,30));


    }

    public static void quickSort(ArrayList<Integer> nums, int low, int high){

        if(high > low){

            int p = getPivot(low,high);
            partition(nums,low,p,high);
            quickSort(nums,low,p);
            quickSort(nums,p,high);
        }

    }

    public static int getPivot(int low,int high){
        
        return new Random().nextInt(high - low + 1) + low;

    }


    public static void partition(ArrayList<Integer> nums,int i, int p, int j){




    }

    public static ArrayList<Integer> getNums(String fileName) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File(fileName));
            ArrayList<Integer> nums = new ArrayList<>();

            while(sc.hasNext())
                nums.add(sc.nextInt());

            return nums;

        } catch (FileNotFoundException e) {

            e.printStackTrace();
            return new ArrayList<>();
        }

    }


}
