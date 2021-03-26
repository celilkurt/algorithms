package main.hackerrank.algorithms.graphs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JourneyToMoon {

    static int journeyToMoon(int n, int[][] astronaut) {

        int n_back = n;
        ArrayList<ArrayList<Integer>> cons = new ArrayList<>();
        boolean key;
        for (int[] pair: astronaut) {
            key = false;
            for ( ArrayList<Integer> conList: cons ) {
                if (conList.contains(pair[0]) && conList.contains(pair[1])){
                    key = true;
                    break;
                }else if (conList.contains(pair[0])){
                    conList.add(pair[1]);
                    key = true;
                    break;
                }else if(conList.contains(pair[1])){
                    conList.add(pair[0]);
                    key = true;
                    break;
                }
            }

            //Eğer herhangi bir listeye atanmamışlarsa yani var olan bir gruba dahil deyillerse
            if(!key){
                ArrayList<Integer> conList = new ArrayList<>();
                conList.add(pair[0]);
                conList.add(pair[1]);
                cons.add(conList);
            }

        }



        ArrayList<Integer> sizeList = new ArrayList<>();
        for (ArrayList<Integer> conList: cons) {
            int size = conList.size();
            n -= size;
            sizeList.add(size);
        }

        for (int i = 0; i < n; i++){
            sizeList.add(1);
        }

        int count = 0;


        for (int sizeOf : sizeList) {
            n_back -= sizeOf;
            count += sizeOf * n_back;

        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] np = scanner.nextLine().split(" ");

        int n = Integer.parseInt(np[0]);

        int p = Integer.parseInt(np[1]);

        int[][] astronaut = new int[p][2];

        for (int i = 0; i < p; i++) {
            String[] astronautRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int astronautItem = Integer.parseInt(astronautRowItems[j]);
                astronaut[i][j] = astronautItem;
            }
        }

        int result = journeyToMoon(n, astronaut);

        System.out.println(result);


        scanner.close();
    }
    
}
