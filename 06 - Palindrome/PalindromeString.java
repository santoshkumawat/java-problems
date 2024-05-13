public class PalindromeString {
    public static void main(String[] args) {
        String str = "santosh";
        String revString = "";
        int n = str.length(); //5

        for(int i = n; i <= n; i--){
            if (i > 0){
                revString = revString + str.charAt(i-1);
            } else {
                break;
            }
        }

        if(str.equalsIgnoreCase(revString)) {
            System.out.println("String is palindrome");
        } else { 
            System.err.println("Stirng is not palindrome");
        }
    }
}
