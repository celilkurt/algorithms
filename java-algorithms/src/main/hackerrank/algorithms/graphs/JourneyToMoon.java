package main.hackerrank.algorithms.graphs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JourneyToMoon {

    // Hackerrank - Journey To The Moon
    static long journeyToMoon(int n, int[][] astronaut) {

        int n_back = n;
        ArrayList<ArrayList<Integer>> cons = new ArrayList<>();
        boolean key;
        for (int[] pair: astronaut) {
            key = false;
            for ( int i = 0; i < cons.size(); i++) {
                ArrayList<Integer> conList = cons.get(i);
                if (conList.contains(pair[0]) && conList.contains(pair[1])){
                    key = true;
                    break;
                }else if (conList.contains(pair[0])){
                    for (int j = i+1; j < cons.size(); j++){
                        if(cons.get(j).contains(pair[1])) {
                            conList.addAll(cons.get(j));
                            conList.remove(Integer.valueOf(pair[1]));
                            cons.remove(j);
                            i--;
                            break;
                        }
                    }
                    conList.add(pair[1]);
                    key = true;
                    break;
                }else if(conList.contains(pair[1])){
                    for (int j = i+1; j < cons.size(); j++){
                        if(cons.get(j).contains(pair[0])) {
                            conList.addAll(cons.get(j));
                            conList.remove(Integer.valueOf(pair[0]));
                            cons.remove(j);
                            i--;
                            break;
                        }
                    }
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


        long count = 0;

        for (int sizeOf : sizeList) {
            n_back -= sizeOf;
            count += (long) sizeOf * n_back;

        }

        if (n_back != 0) {
            n_back--;
            count += ((long) n_back *(n_back+1))/2;
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

        long result = journeyToMoon(n, astronaut);

        System.out.println(result);


        scanner.close();
    }
    
}
