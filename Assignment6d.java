import java.util.*;
class Assignment6d{
    public static void main(String args[]){
        String str1 = "Computer Is Fun";
        String[] arrOfWord = str1.split(" ");
        for(int i= arrOfWord.length-1 ;i>=0;i--){
            System.out.print(arrOfWord[i] + " ");
        }
    }
}