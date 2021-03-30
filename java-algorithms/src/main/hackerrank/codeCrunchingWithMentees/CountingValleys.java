package main.hackerrank.codeCrunchingWithMentees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ResultCV {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int level = 0;
        int count = 0;
        for (char c: path.toCharArray()) {
            if (c == 'D') {
                level--;
            } else {
                level++;
                if(level == 0){
                    count++;
                }
            }
        }

        return count;
    }

}

public class CountingValleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = ResultCV.countingValleys(steps, path);

        System.out.println(result);

        bufferedReader.close();
    }
}
