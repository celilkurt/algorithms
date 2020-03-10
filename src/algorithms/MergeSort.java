
package algorithms;


public class MergeSort {
    
    public static void mergeSort(int[] arr , int p, int r){
     
        if(r-p > 1){
            
            int q = (r+p)/2;
            mergeSort(arr,p,q);
            mergeSort(arr,q,r);
            sort(arr,p,q,r);
        }
        
        
    }
    
    private static void sort(int[] arr, int p, int q, int r){
        
        int[] left = new int[q-p];
        int[] right = new int[r-q];
        
        for(int i = 0; i < left.length; i++){
            left[i] = arr[i+p];
        }
        
        for(int i = 0; i < right.length; i++){
            right[i] = arr[i+q];
        }
        
        int leftI = 0;
        int rightI = 0;
        
        for(int i = p; i < r;i++){
            
            if(leftI < left.length && rightI < right.length){
                
                if(right[rightI] < left[leftI]){
                    arr[i] = right[rightI++];
                }else{
                    arr[i] = left[leftI++];
                }
                
            }else if(leftI < left.length){
                arr[i] = left[leftI++];
            }else{
                arr[i] = right[rightI++];
            }
            
            
        }
        
    }   
}
