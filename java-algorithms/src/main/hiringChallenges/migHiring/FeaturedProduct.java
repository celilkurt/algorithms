package main.hiringChallenges.migHiring;

import java.util.*;

/**
 * List'in içerdiği elemanların sıklığı hesaplanacak ve en sık satın alınan ürünlerden,
 * ürün ismine göre sıralandıklarında en küçük olan ürün ismi döndürülecek.
 *
 * Örnek girdi: "ram", "ram", "rom", "gpu", "rom"
 *
 * Örnek çıktı: "rom"
 *
 * çünkü "ram" ve "rom" 2 kez tekrar ediliyor ve "rom", "ram" e göre alfabetik sıralamada daha sonra geliyor.
 * */
public class FeaturedProduct {

    public static void main(String[] args) {

        System.out.println(featuredProduct(Arrays.asList("ram", "ram", "rom", "gpu", "cpu", "rom")));
    }

    /**
     * En çok tekrar edilen product'lardan asc olarak en baştaki döndürülür.
     * */
    public static String featuredProduct(List<String> products) {

        if (products.isEmpty()) return null;

        HashMap<String, Integer> occurs = getOccurenceMapOfProduct(products);

        List<String> elemsWithMaxOccur = getElemsWithMaxOccurs(occurs);

        String minByAlphabetic = elemsWithMaxOccur.stream().max(String::compareTo).get();

        return minByAlphabetic;

    }




    public static HashMap<String, Integer> getOccurenceMapOfProduct(List<String> products) {

        HashMap<String, Integer> occurs = new HashMap<>();

        int currentOccur;
        for (String product: products) {
            currentOccur = occurs.getOrDefault(product, 0);
            occurs.put(product, currentOccur+1);
        }

        return occurs;

    }

    public static List<String> getElemsWithMaxOccurs(HashMap<String, Integer> occurs) {

        int maxOccur = occurs.values().stream().max(Integer::compareTo).get();
        List<String> elemsWithMaxOccur = new ArrayList<>();

        for (Map.Entry<String, Integer> entry: occurs.entrySet()) {

            if (entry.getValue() == maxOccur) {
                elemsWithMaxOccur.add(entry.getKey());
            }
        }

        return elemsWithMaxOccur;
    }
}
