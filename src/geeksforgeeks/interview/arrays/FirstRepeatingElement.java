package geeksforgeeks.interview.arrays;


import java.util.HashMap;

//return first repeating element in array if it exist
public class FirstRepeatingElement {


    public static int firstRepeated(int []arr, int n)
    {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr)
            if(map.containsKey(num))
                map.put(num,map.get(num)+1);
            else
                map.put(num,1);

        for(int i = 0; i < arr.length; i++){

            if(map.get(arr[i]) > 1)
                return i+1;

        }


        return -1;
    }



}
