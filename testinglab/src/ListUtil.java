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

        for(int i = 0; i < array.length; i++){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }
}
