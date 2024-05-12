public class ReverseWord {
    public static void main(String[] args) {
        String originalString = "Santosh Kumawat", reversedWord = ""; 

        String arrString[] = originalString.split(" ");
        char c;

        for(String str: arrString){
            String tempStr = "";
            for(int i=0; i<str.length(); i++){
                c = str.charAt(i);
                tempStr = c + tempStr;
            }
            tempStr = tempStr + " ";
            reversedWord = reversedWord + tempStr;
        }

        System.out.println(reversedWord);

    }
}