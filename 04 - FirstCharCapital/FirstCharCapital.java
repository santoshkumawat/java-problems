public class FirstCharCapital {
    public static void main(String[] args){
        String originalString = "my name is santosh kumawat", newString = "";
        char c; 

        c = Character.toUpperCase(originalString.charAt(0));
        newString = newString + c;

        for(int i = 1; i < originalString.length(); i++){
            
            if (originalString.charAt(i) == ' ') {
                newString = newString + " ";
                c = Character.toUpperCase(originalString.charAt(i + 1));
                newString = newString + c;
                i++;
            } else {
                newString = newString + originalString.charAt(i);
            }
        }
        
        System.out.println(newString);
        }
    }