package main.hiringChallenges.migHiring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        HashMap<String, Integer> occurs = new HashMap<>();

        int currentOccur;
        for (String product: products) {

            currentOccur = occurs.getOrDefault(product, 0);
            occurs.put(product, currentOccur+1);
        }

        int maxOccur = 0;
        for (int occur: occurs.values()) {
            if (occur > maxOccur) {
                maxOccur = occur;
            }
        }

        String minStr = null;

        for (Map.Entry<String, Integer> entry: occurs.entrySet()) if (entry.getValue() == maxOccur) {

                if (minStr == null || minStr.compareTo(entry.getKey()) < 0) {
                    minStr = entry.getKey();
                }
        }

        return minStr;
    }
}
