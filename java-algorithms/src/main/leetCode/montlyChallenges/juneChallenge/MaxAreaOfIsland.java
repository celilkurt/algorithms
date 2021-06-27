package main.leetCode.montlyChallenges.juneChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

public class MaxAreaOfIsland {


    public static void main(String[] args) {

        int[][] grid = {{0, 0, 1}, {1,1,0}};

        System.out.println(maxAreaOfIsland(grid));
    }

    public static int maxAreaOfIsland(int[][] grid) {

        int len = (grid.length+1)*(grid[0].length+1);
        int[] nodes = new int[len];
        Arrays.fill(nodes, -1);

        int colLen = grid[0].length;
        int rowLen = grid.length;

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                findCons(nodes, grid, i, j, i*colLen+j);
            }
        }

        HashMap<Integer, Integer> consMap = new HashMap<>(nodes.length);
        int curCount;
        for (int i = 0; i < len; i++) {
            if (nodes[i] == -1) continue;
            curCount = consMap.getOrDefault(nodes[i], 0);
            consMap.put(nodes[i], curCount+1);
        }

        Optional<Integer> max = consMap.values().stream().max(Integer::compareTo);

        return max.orElse(0);
    }

    public static void findCons(int[] nodes, int[][] grid, int row, int col, int parentIndex) {
        int nodeIndex = row*grid[0].length+col;
        if (grid[row][col] == 1 && nodes[nodeIndex] == -1) {
            nodes[nodeIndex] = parentIndex;
            if (col+1 != grid[0].length) {
                findCons(nodes, grid, row, col+1, parentIndex);
            }
            if (col-1 >= 0) {
                findCons(nodes, grid, row, col-1, parentIndex);
            }
            if (row-1 >= 0) {
                findCons(nodes, grid, row-1, col, parentIndex);
            }
            if (row+1 != grid.length) {
                findCons(nodes, grid, row+1, col, parentIndex);
            }
        }

    }

}
