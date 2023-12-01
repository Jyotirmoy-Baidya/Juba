import java.util.*;
class Assignment6e{
    public static void main(String args[]){
        String str1 = "Computer Is Fun";
        String vowels = "AEIOUaeiou";
        String[] arrOfWord = str1.split(" ");
        int max_vowels_count=0;
        String max_word ="";
        for( String i : arrOfWord){
            int n = i.length();
            int vowel_count=0;
            for(int j=0;j<n;j++){
                String c = String.valueOf(i.charAt(j));
                if(vowels.contains(c)){
                    vowel_count++;
                }
            }
            if(vowel_count>max_vowels_count){
                max_word=i;
                max_vowels_count=vowel_count;
            }
        }
        System.out.println(max_word);
    }
}