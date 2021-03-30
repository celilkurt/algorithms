package main.hackerrank.codeCrunchingWithMentees;

public class HuffmanDecoding {


    void decode(String s, Node root) {

        Node tempRoot = root;

        for (char c: s.toCharArray()) {

            if (c == '1') {
                if (tempRoot.right == null) {
                    System.out.print(tempRoot.data);
                    tempRoot = root;
                }
                tempRoot = tempRoot.right;

            } else {
                if (tempRoot.left == null) {
                    System.out.print(tempRoot.data);
                    tempRoot = root;
                }
                tempRoot = tempRoot.left;
            }
        }

        System.out.print(tempRoot.data);

    }


}
