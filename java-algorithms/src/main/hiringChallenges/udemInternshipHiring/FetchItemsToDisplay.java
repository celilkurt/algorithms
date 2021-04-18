package main.hiringChallenges.udemInternshipHiring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FetchItemsToDisplay {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int itemsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int itemsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> items = new ArrayList<>();

        IntStream.range(0, itemsRows).forEach(i -> {
            try {
                items.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int sortParameter = Integer.parseInt(bufferedReader.readLine().trim());

        int sortOrder = Integer.parseInt(bufferedReader.readLine().trim());

        int itemsPerPage = Integer.parseInt(bufferedReader.readLine().trim());

        int pageNumber = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = fetchItemsToDisplay(items, sortParameter, sortOrder, itemsPerPage, pageNumber);



        bufferedReader.close();
    }




    public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int itemsPerPage, int pageNumber) {

        if (sortOrder == 0) {
            sortOrder = -1;
        }

        int finalSortOrder = sortOrder;
        items.sort((strings, t1) -> {
            if (sortParameter > 0) {
                return finalSortOrder * Integer.valueOf(strings.get(sortParameter)).compareTo(Integer.valueOf(t1.get(sortParameter)));
            } else {
                return finalSortOrder * strings.get(sortParameter).compareTo(t1.get(sortParameter));
            }
        });

        List<String> retVal = new ArrayList<>();
        int len = items.size();
        for (int i = itemsPerPage*(pageNumber+1); i < len; i++) {
            retVal.add(items.get(i).get(0));
        }


        return retVal;

    }



}
