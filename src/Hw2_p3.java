import java.util.Arrays;
public class Hw2_p3 {
    /*takes LinkedList as input and calls helper() method to reverse the LinkedList*/
    public static void reverse(DoublyLinkedList<Integer> intList) {
        // calls helper method
        helper(intList, 0);
    }
    /*takes a LinkedList and an int as input. reverses the elements of the LinkedList */
    public static void helper(DoublyLinkedList<Integer> intList, int i) {
        int tempValue;
        // base case
        if (intList.size() == 0) {
            return;
        }
        // remove first value in LinkedList and save to temp variable
        tempValue = intList.removeFirst();
        // recursively calls
        helper(intList, i + 1);
        // add temp value to the end of the list
        intList.addLast(tempValue);

    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> intList = new DoublyLinkedList<>();

        int[] a = {10, 20, 30, 40, 50};
        for (int i=0; i<a.length; i++) {
            intList.addLast(a[i]);
        }
        System.out.println("Initial list: size = " + intList.size() + ", " + intList.toString());

        reverse(intList);

        System.out.println("After reverse: " + intList.toString());

        intList = new DoublyLinkedList<>();
        int[] b = {10, 20, 30, 40, 50, 60};
        for (int i=0; i<b.length; i++) {
            intList.addLast(b[i]);
        }
        System.out.println();
        System.out.println("Initial list: size = " + intList.size() + ", " + intList.toString());

        reverse(intList);

        System.out.println("After reverse: " + intList.toString());

    }

}
