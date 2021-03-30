import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        return duplicates;
    }

    // find duplicates method as a generic method:
   // <T> define generic type for the method
    // ArrayList<T>   define return type

    public static <T> ArrayList<T> findDuplicates(T[] array) {
        ArrayList<T> duplicates = new ArrayList<T>();
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i].equals(array[j]) && !duplicates.contains(array[i])) {
                    duplicates.add(array[i]);
                }
            }
        }
        return duplicates;
    }

    public static <T> List<T> findDuplicatesEfficient(T[] array) {
        ArrayList<T> duplicates = new ArrayList<T>();
        // sets don't allow duplicates!
        Set<T> duplicateSet = new HashSet<T>();
        Set<T> arrayValuesSet = new HashSet<T>();

        for(int i = 0; i < array.length; i++) {
            T value = array[i];
            if(!arrayValuesSet.add(value)) {
                duplicateSet.add(value);
            }
        }
        duplicates.addAll(duplicateSet);
        return duplicates;
    }


    public static Pair<Integer> findMinMaxIntegers(Integer[] array) {
        int min = array[0];
        int max = array[0];

        for(int i = 0; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
            if(max < array[i]) {
                max = array[i];
            }
        }
        Pair<Integer> minMax = new Pair<>(min, max);
        return minMax;
    }

    // make minMax generic:

    public static <T extends Comparable<T>> Pair<T> findMinMax(T[] array) {
        T min = array[0];
        T max = array[0];

        for(int i = 0; i < array.length; i++) {
            if(min.compareTo(array[i]) > 0) {
                min = array[i];
            }
            if(max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        Pair<T> minMax = new Pair<>(min, max);
        return minMax;
    }

}
