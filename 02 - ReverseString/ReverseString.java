public class ReverseString {

    public static void main(String[] args){

        String s = "Santosh Kumawat", newString = ""; 
        char c;

        for(int i=0; i<s.length(); i++){
          c = s.charAt(i);
          newString = c + newString;
        }

        System.out.println(newString);
    }

}