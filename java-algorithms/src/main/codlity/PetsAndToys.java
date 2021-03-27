package main.codlity;

import java.util.ArrayList;


/*
*  Codilty - Doge Challange
*
* */
public class PetsAndToys {

    int[] cons;
    public boolean solution(int[] P, int[] T, int[] A, int[] B) {


        cons = new int[P.length];
        for (int i = 0; i < P.length; i++) cons[i] = i;

        int len = A.length;
        for (int i = 0; i < len; i++) {

            connected(A[i], B[i]);
        }

        len = P.length;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < len; i++) {

            if (P[i] != T[i]){
                if(P[i] == 1){
                    list1.add(i);
                }else {
                    list2.add(i);
                }

            }
        }

        if(list1.size() != list2.size()) return false;


        for (int i = 0; i < list1.size(); i++) {

            for (int j = 0; j < list2.size(); j++) {
                if (find(list1.get(i)) == find(list2.get(j))){
                    list1.remove(i);
                    list2.remove(j);
                    i--;
                    break;
                }
            }
        }

        return list1.size() == 0 && list2.size() == 0;

    }

    void connected(int i, int j) {

        int iParent = find(i);
        int jParent = find(j);
        if (iParent < jParent){
            cons[j] = iParent;
        } else{
            cons[i] = jParent;
        }

    }


    int find(int i) {

        int parent = cons[i];
        while(parent != i){
            i = parent; //0
            parent = cons[parent];

        }

        return parent;

    }
}