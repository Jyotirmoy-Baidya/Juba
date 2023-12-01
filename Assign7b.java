class Assign7b{
    public static int digitCalc(int n){
        int s=0;
        while(n>0){
            int d = n%10;
            s=s+(d*d);
            n=n/10;
        }
        return s;
    }
    public static void main(String[] args){
        String str = "VAT";
        int sum=0;
        for(int i=0;i<str.length();i++){
            int a = str.charAt(i)-64;
            sum = sum + digitCalc(a);
        }
        while(digitCalc(sum)<sum){
            sum = digitCalc(sum);
        }
        if(sum==1){
            System.out.println("Happy Word");
        }
        else
            System.out.println("Not Happy");

    }
}