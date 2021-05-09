package main.hackerrank;

public class BearAndSteadyGene {


    public static int steadyGene(String gene) {

        int[] geneCounts = new int[]{0, 0, 0, 0};


        for (char c: gene.toCharArray()) {
            switch (c) {
                case 'G':
                    geneCounts[0] += 1;
                    break;
                case 'C':
                    geneCounts[1] += 1;
                    break;
                case 'T':
                    geneCounts[2] += 1;
                    break;
                case 'A':
                    geneCounts[3] += 1;
                    break;
            }
        }

        int missingGeneCount = 0;

        boolean[] isCompleted = new boolean[4];
        for (int i = 0; i < 4; i++) {
            if (geneCounts[i] != gene.length()/4) {
                missingGeneCount += gene.length()/4 - geneCounts[i];
                isCompleted[i] = false;
            }
        }

        /**
         * GAAATAAA
         * 01110111 -> subarr toplamı kayıp gen sayısına eşit olan en küçük substring büyüklüğü bulunmalı
         *
         * */
        int availablePosCount = 0;
        int tempCost = 0;
        int minCost = Integer.MAX_VALUE;
        for (char c: gene.toCharArray()) {

        }




        return 0;

    }


}
