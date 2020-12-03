package codlity;

import java.util.Arrays;

public class Equality {

    /*****
     * Verilen dizi içerisinde sayısal değeri ve
     * frekansı eşit olan en büyük sayının döndürülmesi probleminin çözümüdür.
     * Şartı sağalyan sayı yoksa 0 döndürülür.
     *
     * Girdi: [0,1,2,3,3,2,5]
     * Çıktı: 2
     *
     */

    public int solution(int[] A){

        Arrays.sort(A);

        int fre = 1;
        for(int i = A.length - 2; i >= 0; i--){

            if(A[i] == A[i+1]){
                fre++;
            }else{
                if(fre == A[i+1]){
                    return A[i+1];
                }else{
                    fre = 1;
                }
            }
        }

        if(fre == A[0]){
            return A[0];
        }

        return 0;
    }

}
