package main.hackerrank.hiringChallenge;


/**
 * Verilen string'in önce ters çevrilip daha sonra da her bir
 * karakterin aşağıda belirtilen dengiyle değiştirilmesi bekleniyor.
 * C - G
 * T - A
 *
 * Örnek girdi: "GTCAG"
 *
 * Örnek çıktı: "CTGAC"
 *
 * */
public class DNAComplement {

    public static void main(String[] args) {
        System.out.println(dnaComplement("GTCAG"));
    }


    public static String dnaComplement(String s) {

        int len = s.length();
        StringBuilder stringBuild = new StringBuilder(len);
        for (int i = len-1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'A':
                    stringBuild.append('T');
                    break;
                case 'C':
                    stringBuild.append('G');
                    break;
                case 'T':
                    stringBuild.append('A');
                    break;
                case 'G':
                    stringBuild.append('C');
                    break;
            }
        }

        return stringBuild.toString();

    }
}
