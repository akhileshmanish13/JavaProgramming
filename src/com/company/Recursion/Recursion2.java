ic class Recursion2 {
//    1. Find the occurrence of the first and last occurrence index of an element using recursion
    public static int first = -1;
    public static int last = -1 ;
    public static void findOccurance(String str, int index, char element){
        if(index == str.length()){
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element){
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }
        }
        findOccurance(str, index+1, element);
    }
    public static void main(String[] args){
        String str = "ajrahka";
        char element = 'a';
        findOccurance(str,0 , element);
        System.out.println("First Occurance: "+ first);
        System.out.println("Last Occurance: "+ last);

    }
}
