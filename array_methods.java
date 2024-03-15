import java.util.*;
public class array_methods {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        // to print array as list we can use "asList()" method
        System.out.println("the array of list"+Arrays.asList(arr));
        //The type of array must be a Wrapper Class(Integer,Float, etc)
        // in case of primitive data types(int, float,etc) ,i.e you can’t pass int a[] but you can pass Integer a[].If you pass int a[],
        // this function will return a  List <int a[]> and not List <Integer> ,
        // as “autoboxing” doesn’t happen in this case and
        // int a[] is itself identified as an object and a List of int array is returned,
        // instead of list of integers ,
        // which will give error in various Collection functions.
        Integer[] arr1 = {1,2,3,4,5};
        List<Integer> l1 = Arrays.asList(arr1);
        System.out.println(l1);
        // array method to sort the array
        Integer[] arr2 = new Integer[]{1,5,3,2,6,9};
        Arrays.sort(arr2);
        int key=3;
        System.out.println(Arrays.binarySearch(arr2,key));
        //"compare()" this function compares the two arrays and find the similar element in the arrays are return the index
        int intarr3[] = {1,2,34,56};
        int intarr4[] = {1,4,5,6};
        System.out.println(Arrays.compareUnsigned(intarr3,intarr4));

    }
}
