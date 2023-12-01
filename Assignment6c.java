import java.util.*;
class Assignment6c{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str1=sc.nextLine();
        String[] arrOfWord = str1.split(" ");
        for( String i : arrOfWord ){
            StringBuffer s1 = new StringBuffer(i);
            s1.reverse();
            String s2 = s1.toString();
            if(i.equals(s2)){
                System.out.println(i);
            }
        }
    }
}
