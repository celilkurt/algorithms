package main.codlity;

public class BinaryGap {


    public static void main(String[] args) {
        System.out.println(solution(1041));
    }


    public static int solution(int N) {

        char[] binaryArr = Integer.toBinaryString(N).toCharArray();
        int firstOneI = getFirstOneIndex(binaryArr, binaryArr.length);
        if(firstOneI == -1) return 0;

        return getMaxGap(binaryArr, firstOneI);

    }

    public static int getFirstOneIndex(char[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == '1') {
                return i;
            }
        }
        return -1;
    }

    public static int getMaxGap(char[] arr, int firstOneI) {

        int tempCount = 0;
        int maxCount = 0;
        int len = arr.length;
        for (int i = firstOneI+1; i  < len; i++) {

            if (arr[i] == '0') {
                tempCount++;
            } else {
                if (tempCount > maxCount) {
                    maxCount = tempCount;
                }
                tempCount = 0;
            }
        }
        return maxCount;
    }


}
