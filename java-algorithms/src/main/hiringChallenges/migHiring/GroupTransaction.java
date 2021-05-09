package main.hiringChallenges.migHiring;

import java.util.*;

/**
 *
 * Satılan ürünlerin isimlerinin bulunduğu listeden aşağıdaki formatta bir String list'i üretilmesi isteniyor:
 * "<ürün_ismi> <satın_alınma_sayısı>"
 *
 * String list'i satın alınma sayısı göre azalan olarak, aynı satın alınma sayısına sahip olan ürünler
 * ürün ismine göre artan şekilde sıralanacak
 *
 * Örnek girdi: "ram", "rom", "ram", "rom", "cpu"
 *
 * Örnek çıktı: "ram 2", "rom 2", "cpu 1"
 *
 * */
public class GroupTransaction {

    public static void main(String[] args) {

        for (String str: groupTransactions(Arrays.asList("ram", "rom", "ram", "rom", "cpu"))) {
            System.out.println(str);
        }


    }



    // İlk çözüm
    public static List<String> groupTransactions(List<String> transactions) {

        // TreeMap<String, TransactionWithOccur> occurs = new TreeMap<>();
        // occurs.firstEntry();

        HashMap<String, TransactionWithOccur> occurs = new HashMap<>();

        for (String transaction: transactions) {

            if (occurs.containsKey(transaction)) {
                occurs.get(transaction).count++;
            } else {
                occurs.put(transaction, new TransactionWithOccur(transaction, 1));
            }

        }
        ArrayList<TransactionWithOccur> sortedList = new ArrayList<>(occurs.values());
        Collections.sort(sortedList);
        List<String> sortedStrList = new ArrayList<>(sortedList.size());
        sortedList.forEach(elem -> { sortedStrList.add(elem.transaction + " " + elem.count);
                }
        );

        return sortedStrList;

    }

    // İyileştirilmiş
    public static List<String> groupTransactions2(List<String> transactions) {

        // TreeMap<String, TransactionWithOccur> occurs = new TreeMap<>();
        // occurs.firstEntry();

        HashMap<String, Integer> occurs = new HashMap<>();
        int curOccur;

        for (String transaction: transactions) {
            curOccur = occurs.getOrDefault(transaction, 0);
            occurs.put(transaction, curOccur+1);
        }


        ArrayList<TransactionWithOccur> transactionList = new ArrayList<>(occurs.size());
        for (Map.Entry<String, Integer> entry: occurs.entrySet()) {
            transactionList.add(new TransactionWithOccur(entry.getKey(), entry.getValue()));
        }

        Collections.sort(transactionList);
        List<String> sortedStrList = new ArrayList<>(transactionList.size());
        transactionList.stream().forEach(elem -> { sortedStrList.add(elem.transaction + " " + elem.count);
                }
        );

        return sortedStrList;

    }

}

class TransactionWithOccur implements Comparable<TransactionWithOccur> {
    String transaction;
    Integer count;

    public TransactionWithOccur(String transaction, Integer count) {
        this.transaction = transaction;
        this.count = count;
    }

    public int compareTo(TransactionWithOccur other) {

        if (other.count != this.count) {
            return -this.count.compareTo(other.count);
        } else {
            return this.transaction.compareTo(other.transaction);
        }
    }


}
