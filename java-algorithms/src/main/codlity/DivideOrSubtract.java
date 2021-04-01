package main.codlity;

public class DivideOrSubtract {

    /****
     * String formatında verilen binary sayının aşağıdaki şartlara uygun olarak
     * sıfırlaması için gerekli işlem sayısı döndüren program.
     *
     * - Sayı çift ise 2'ye böl.
     * - Sayı tek ise 1 çıkar.
     *
     * Not: Testcase'lerden birinin 400000 basamaklı bir binary sayıyı içermesinden anlaşılıyor ki
     * sayı onluk tabana döndürülmemeli.
     *
     * ***/
    public int solution(String S){

        int cost = 0, len = S.length();
        int firstOneI = -1;

        //Sol baştan ilk bir bulunur çünkü ondan öncesinin sayısal bir değeri yoktur. '00010100', '000000'
        for(int i = 0; i < len; i++){
            if(S.charAt(i) == '1'){
                firstOneI = i;
                break;
            }
        }

        // String sadece sıfırdan oluşyorsa sıfarlama için hiç işlem gerekmiyordur.
        if(firstOneI == -1){
            return 0;
        }

        //Sağ baştan itibaren, bulunan ilk bire kadar hesaplanmaya başlanır.
        for(int i = len-1; i >= firstOneI; i--){
            if(S.charAt(i) == '1'){
                cost += 2;
            }else{
                cost += 1;
            }
        }

        return cost-1;
    }

}
