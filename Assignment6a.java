import java.util.*;
class Assignment6a{
    public StringBuffer replace(String s1){
        StringBuffer s2 = new StringBuffer(s1);
        int n = s2.length();
        String vowels = "AEIOUaeiou";
        for(int i=0;i<n;i++){
            String c = String.valueOf(s2.charAt(i));
            if(vowels.contains(c)){
                s2.replace(i,i+1,"*");
            }
        }
        return s2;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Assignment6a a = new Assignment6a();
        String s1 = sc.nextLine();
        System.out.println(a.replace(s1));
    }
}


