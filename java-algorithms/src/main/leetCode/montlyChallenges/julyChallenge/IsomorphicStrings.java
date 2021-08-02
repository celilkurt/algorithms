package main.leetCode.montlyChallenges.julyChallenge;

import java.util.Arrays;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        int len = s.length();

        if (len != t.length()) return false;

        int[] sOccurs = new int[256];
        int[] tOccurs = new int[256];

        for (int i = 0; i < len; i++) {
            sOccurs[s.charAt(i)] += 1;
        }

        for (int i = 0; i < len; i++) {
            tOccurs[t.charAt(i)] += 1;
        }

        Arrays.sort(sOccurs);
        Arrays.sort(tOccurs);

        for (int i = 0; i < 256; i++) {
            if (sOccurs[i] != tOccurs[i]) {
                return false;
            }
        }

        return true;
    }


}
