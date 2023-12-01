class Assign7a{
    public static void main(String args[]){
        String str = "Aluakn";
        int arr[]=new int[122];
        int n = str.length();
        int u=0;
        for(int i= 0;i<n;i++){
            int a = str.charAt(i);
            if(arr[a]!=0){
                System.out.println("Not Unique");
                u=1;
                break;
            }
            arr[a]=1;
        }
        if(u==0){
            System.out.println("Unique");
        }
    }
}