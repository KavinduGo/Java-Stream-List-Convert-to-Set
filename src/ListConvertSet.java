import java.util.*;
import java.util.stream.Collectors;

public class ListConvertSet {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();
        System.out.println("How Many Value Do You Insert : ");
        int count = userinput.nextInt();
        System.out.println("Many Value Do You Insert : ");

        for (int i = 0; i < count ; i++){
            int input = userinput.nextInt();
            myList.add(input);
        }
        System.out.println("Original List: " + myList);
        // Convert List to Set using Java Stream
        Set<Integer> mySet = myList.stream()
                .collect(Collectors.toSet());
        System.out.println("Converted Set: " + mySet);
    }
}
