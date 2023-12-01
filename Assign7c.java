import java.util.*;
class Assign7c{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str1=sc.nextLine();
        String[] arrOfWord = str1.split(" ");
        for( String i : arrOfWord ){
            int n = i.length();
            for(int j = 0;j<n-1;j++){
                int a=i.charAt(j);
                int b=i.charAt(j+1);
                if(Math.abs(a-b)==1){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}