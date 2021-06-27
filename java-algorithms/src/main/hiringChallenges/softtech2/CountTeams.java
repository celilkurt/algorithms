package main.hiringChallenges.softtech2;

import java.util.*;

public class CountTeams {


    public static void main(String[] args) {
        System.out.println(countTeams(Arrays.asList(732, 217, 930, 274, 936, 432, 618, 283, 494, 780, 140, 376, 82, 736, 337), 6, 186, 973));
    }

    public static int countTeams(List<Integer> skills, int minPlayers, int minLevel, int maxLevel) {

        List<Integer> filteredList = new ArrayList<>();

        for (int skill: skills){

            if (skill >= minLevel && skill <= maxLevel) {
                filteredList.add(skill);
            }
        }

        int suitablePlayersCount = filteredList.size();

        if (suitablePlayersCount < minPlayers) return 0;

        int totalCombination = 0;
        for (int i = minPlayers; i <= suitablePlayersCount; i++) {

            totalCombination += calCombination(suitablePlayersCount, i);
        }

        return totalCombination;
    }

    public static int calCombination(int n, int r) {

        // n!/(r!*(n-r)!)
        return factorial(n)/(factorial(r)*factorial(n-r));

    }

    public static int factorial(int n) {

        int factorial = 1;

        if (n <= 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            for ( int i = 2; i <= n; i++) {
                factorial *= i;
            }
        }

        return factorial;
    }






}
