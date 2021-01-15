package hackerrank.java;

public class SubstringComparison {

    public static void main(String[] args){

        System.out.println(getSmallestAndLargest("39872689427823",3));

    }

    //Java Substring Comparisons
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        String subStr;

        for (int i = 0; i < s.length() - k + 1; i++) {

            subStr = s.substring(i, k + i);
            int comLar = subStr.compareTo(largest);
            int comSma = subStr.compareTo(smallest);

            if (comLar > 0)
                largest = new String(subStr);

            if (comSma < 0)
                smallest = new String(subStr);

        }

        return smallest + "\n" + largest;
    }

}
