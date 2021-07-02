package main.leetCode.montlyChallenges.julyChallenge;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {


    public static void main(String[] args) {

        System.out.println(findClosestElements(new int []{1,2,3,4,5}, 4, 3));

    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        ArrayList<Difference> diffList = new ArrayList<>(arr.length);

        for (int num: arr) {

            diffList.add(new Difference(num, Math.abs(num-x)));

        }

        diffList.sort(Difference::compareTo);

        ArrayList<Integer> kClosest = new ArrayList<>(k);

        for (int i = 0; i < k; i++) {

            kClosest.add(diffList.get(i).num);
        }

        kClosest.sort(Integer::compareTo);

        return kClosest;

    }


}

class Difference implements Comparable<Difference>{

    int num;
    int diff;

    public Difference(int num, int diff) {
        this.diff = diff;
        this.num = num;
    }

    @Override
    public int compareTo(Difference other) {
        if (diff < other.diff) {
            return -1;
        } else if (diff > other.diff){
            return 1;
        }

        return 0;
    }
}