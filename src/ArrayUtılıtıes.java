import java.util.ArrayList;

public class ArrayUtılıtıes {
    //we're using Integer OBJECT, so to compare we need to use equals()
    public static ArrayList<Integer> findDuplicateIntegers(Integer[] numbers) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i].equals(numbers[j]) && !duplicates.contains(numbers[i])) {
                    duplicates.add(numbers[i]);
                }
            }
        }
        return duplicates;
    }

    public static ArrayList<String> findDuplicateStrings(String[] words) {
        ArrayList<String> duplicates = new ArrayList<String >();
        for(int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if(words[i].equals(words[j]) && !duplicates.contains(words[i])){
                    duplicates.add(words[i]);
                }
            }
        }
    }

}
