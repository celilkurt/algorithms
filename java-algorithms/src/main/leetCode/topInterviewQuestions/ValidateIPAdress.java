package leetCode.topInterviewQuestions;


//Write a function to check whether an input string is a valid IPv4 address or IPv6 address or neither
public class ValidateIPAdress {


    public static String validIPAddress(String IP) {

        String[] str = IP.split(".");
        if(str.length == 4){

            //Eğer yan yana veya sonlarda, başlarda nokta varsa bulur.
            int dotCount = 0;
            for(char c:IP.toCharArray())
                if(c == '.')
                    dotCount++;
            if(dotCount != 3)
                return "Neither";

            //str'lerin her biri için önce uzunluğu üçe eşit mi, her karakeri digit mi ve sayı 255'den küçük mü
            //kontrolü yapmak gerekebilir.


            for(int i = 0; i < 4; i++){
                int num = Integer.valueOf(str[i]);
                if(num < 0 || num > 255)
                    return "Neither";

            }

            return "IPv4";

        }else if(str.length > 1){

            return "Neither";

        }else{

            String[] str2 = IP.split(":");

            if(str2.length == 8){

                int colonsCount = 0;
                for(char c: IP.toCharArray())
                    if(c == ':')
                        colonsCount++;

                if(colonsCount != 7)
                    return "Neither";

                for(String tempStr: str2)
                    if(str2.length > 4)
                        return "Neither";

                return "IPv6";

            }else
                return "Neither";

        }






    }
}
