package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordPro {

    public static void main(String[] args){

        ArrayList<String> letter_3 = new ArrayList<>();
        ArrayList<String> letter_4 = new ArrayList<>();
        ArrayList<String> letter_5 = new ArrayList<>();
        ArrayList<String> letter_6 = new ArrayList<>();


        try {
            Scanner sc = new Scanner(new File("C:\\Users\\asus\\Desktop\\romeoandjuliet.txt"));
            int[] countArr = new int[90-65+1];

            while(sc.hasNext()){

                String str = sc.nextLine();
                findCountOfLetters(countArr,str);


                if(str.length() == 3)
                    letter_3.add(str);
                else if(str.length() == 4)
                    letter_4.add(str);
                else if(str.length() == 5)
                    letter_5.add(str);
                else
                    letter_6.add(str);
            }

            System.out.println("list of 3 length: " + letter_3.size());
            System.out.println("list of 4 length: " + letter_4.size());
            System.out.println("list of 5 length: " + letter_5.size());
            System.out.println("list of 6 length: " + letter_6.size());
            int sum = letter_3.size() + letter_4.size() + letter_5.size() + letter_6.size();
            System.out.println("sum of lists's lengths : " + (sum));

            for(int i = 0; i < countArr.length; i++)
                System.out.println("Count of " + (char)(i+65) + ": " + countArr[i]);

            letter_3.sort(String::compareTo);

            letter_3.forEach( (String s)->{
                System.out.println(s);
            });


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static int[] findCountOfLetters(int[] countArr, String str){

        for(char c: str.toCharArray())
            if((int)c >= 65 && (int)c <= 90)
                countArr[(int)c-65] += 1;




        return countArr;

    }



}
