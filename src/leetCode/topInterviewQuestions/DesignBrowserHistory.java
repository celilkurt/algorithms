package leetCode.topInterviewQuestions;

import java.util.ArrayList;

public class DesignBrowserHistory {

    public static void main(String[] args){

        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
        browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
        browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
        System.out.println(browserHistory.back(1));                   // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
        System.out.println(browserHistory.back(1));                   // You are in "facebook.com", move back to "google.com" return "google.com"
        System.out.println(browserHistory.forward(1));                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
        browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
        System.out.println(browserHistory.forward(2));                // You are in "linkedin.com", you cannot move forward any steps.
        System.out.println(browserHistory.back(2));                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
        System.out.println(browserHistory.back(7));                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"


    }

}

class BrowserHistory {

    ArrayList<String> visitList;
    int curPage;


    public BrowserHistory(String homepage) {

        curPage = 0;
        visitList = new ArrayList<>();
        visitList.add(homepage);
    }

    public void visit(String url) {

        for(int i = curPage+1; i < visitList.size();i++)
            visitList.remove(i);

        visitList.add(url);
        curPage++;

    }

    public String back(int steps) {


        if(curPage-steps >= 0){
            curPage -= steps;
            return visitList.get(curPage);
        }else if(!visitList.isEmpty()){
            curPage = 0;
            return visitList.get(0);

        }else{
            return null;
        }


    }

    public String forward(int steps) {

        if(curPage + steps < visitList.size()){
            curPage += steps;
            return visitList.get(curPage);
        }else if(!visitList.isEmpty()){
            curPage = visitList.size()-1;
            return visitList.get(curPage);
        }else
            return null;

    }
}
