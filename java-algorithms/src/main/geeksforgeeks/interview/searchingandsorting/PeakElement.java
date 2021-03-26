package geeksforgeeks.interview.searchingandsorting;

//Given an array A of N integers. The task is to find a peak element in it in O( log N ) .
//An array element is peak if it is not smaller than its neighbours. For corner elements,
// we need to consider only one neighbour.
public class PeakElement {

    public int peakElement(int[] a,int n)
    {
        if(a.length == 1)
            return 0;

        if(a[0] >= a[1])
            return 0;

        for(int i = 1; i < a.length-1; i++){

            if(a[i-1] <= a[i] && a[i+1] <= a[i])
                return i;

        }

        if(a[a.length-1] >= a[a.length-2])
            return a.length-1;

        return 0;
    }

}
