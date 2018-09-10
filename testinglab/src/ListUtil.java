import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *Class for sorting unique list.
 *
 *@author Thanapoom Rattanathumawat
 */
public class ListUtil {
    /**
     * Count the number of distinct elements in a list.
     * The list may be empty but not null.
     *
     * @param list a list of elements
     * @return the number of distinct elements in list
     */
    public static int countUnique(List<?> list){
        /*
         using HashSet as it only stores unique values
         from a given list parameter.
        */
        Set<?> distinct = new HashSet<>(list);
        return distinct.size();
    }

    /**
     * This method is used to return index of the matching element
     * or -1 if the search element is not in the list/array.
     *
     * @param array
     * @param element
     * @param <T>
     * @return Index of array or -1 if there is no element in the array.
     */
    public static <T extends Comparable<? super T>> int binarySearch(T[] array, T element){
        if(element == null)throw new IllegalArgumentException("Search element must not be null");

        int low = 0;
        int high = array.length-1;
        int index = Integer.MAX_VALUE; // Set to store values that is parsed in.

        while(low <= high){
            int mid = (high + low) / 2;
            if(array[mid].compareTo(element) > 0){
                high = mid - 1;
            }
            else if(array[mid].compareTo(element) < 0){
                low = mid + 1;
            }
            else if(array[mid].compareTo(element) == 0){
                index = mid;
                break;
            }
        }

        if(index == Integer.MAX_VALUE){
            return -1;
        }

        return index;
    }
}
