package sort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args){

        String fileName = "quicksort.txt";
        ArrayList<Integer> nums = getNums(fileName);
        System.out.println(nums.size());

        quickSort(nums,0,nums.size());

        nums.forEach((Integer num) -> {
            System.out.print(num + " ");
        });


    }

    public static void quickSort(ArrayList<Integer> nums, int i, int j){

        if(j > i){

            int p = (i+j)/2;
            partition(nums,i,p,j);
            quickSort(nums,i,p);
            quickSort(nums,p,j);
        }

    }


    public static void partition(ArrayList<Integer> nums,int i, int p, int j){

        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        int pivot = nums.get(p);
        for(int k = i; k < j; k++)
            if(nums.get(k) > pivot)
                greater.add(nums.get(k));
            else
                smaller.add(nums.get(k));

        int meter = i;

        for(int num:smaller)
            nums.set(meter++,num);


        for(int num:greater)
            nums.set(meter++,num);


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
