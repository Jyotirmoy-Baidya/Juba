class Assignment6b{
    public static void main(String args[]){
        String str="Jyoti Is A Gooddddddd";
        int max_length=0;
        String max_length_word="";
        String[] arrOfWord = str.split(" ");
        for ( String i : arrOfWord){
            int n = i.length();
            if (n > max_length) {
                max_length = n;
                max_length_word = i;
            }
        }
        System.out.println("The Longest Word Is : "+ max_length_word + " Of Length : " + max_length );
    }
}