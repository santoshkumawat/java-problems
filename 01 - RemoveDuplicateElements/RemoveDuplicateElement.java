import java.util.LinkedHashSet;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 20, 30, 30, 40};

        int arrLength = arr.length;
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i=0; i < arrLength; i++){
            set.add(arr[i]);
        }

        int tempArr[] = new int[set.size()];
        int j=0;
        for(int i: set){
            tempArr[j] = i;
            j++;
        }

        for (int i : tempArr) {
            System.out.println(i);
        }

    }
}