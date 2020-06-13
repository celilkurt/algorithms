package hackerrank.java;

import java.util.ArrayList;

public class CheckPattern {

    public static void main(String[] args){

        System.out.println("for '[]{()}': " + checkPattern("[]{()}"));

    }

    static boolean checkPattern(String input){
        //check pattern with stack
        //balanced sample: "[]{()}","()[]" unbalanced sample: "[[]()"
        ArrayList<Character> list = new ArrayList<>();
        list.add('-');

        for(int i = 0; i < input.length(); i++){

            switch(input.charAt(i)){

                case '(':
                    list.add('(');
                    break;
                case ')':
                    if(list.get(list.size()-1) == '(')
                        list.remove(list.size()-1);
                    else
                        list.add(')');
                    break;
                case '}':
                    if(list.get(list.size()-1) == '{')
                        list.remove(list.size()-1);
                    else
                        list.add('}');
                    break;
                case '{':
                    list.add('{');
                    break;
                case '[':
                    list.add('[');
                    break;
                case ']':
                    if(list.get(list.size()-1) == '[')
                        list.remove(list.size()-1);
                    else
                        list.add(']');
                    break;

            }
        }
        return list.size() == 1;

    }

}
