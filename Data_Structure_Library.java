package mypackage.data_structure_library;

// Import your custom Queue and Stack classes


public class Data_Structure_Library {
    public static void main(String[] args) {
        // Test LinkedList
        System.out.println("Testing LinkedList:");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.removeFirst();
        System.out.println(linkedList);

        // Test Queue
        System.out.println("\nTesting Queue:");
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.front()); // 1
        queue.dequeue();
        System.out.println(queue.front()); // 2

        // Test Stack
        System.out.println("\nTesting Stack:");
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek()); // 2
        stack.pop();
        System.out.println(stack.peek()); // 1

        // Test Binary Search Tree
        System.out.println("\nTesting Binary Search Tree:");
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        System.out.println(bst.search(5)); // true
        System.out.println(bst.search(20)); // false

        // Test Hash Table
        System.out.println("\nTesting Hash Table:");
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.insert("one", 1);
        hashTable.insert("two", 2);
        System.out.println(hashTable.get("one")); // 1
        System.out.println(hashTable.get("two")); // 2

        // Test QuickSort
        System.out.println("\nTesting QuickSort:");
        int[] array = {3, 6, 8, 10, 1, 2, 1};
        QuickSort.quickSort(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Test MergeSort
        System.out.println("\nTesting MergeSort:");
        int[] array2 = {12, 11, 13, 5, 6, 7};
        MergeSort.mergeSort(array2, 0, array2.length - 1);
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Test Binary Search
        System.out.println("\nTesting Binary Search:");
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(BinarySearch.binarySearch(sortedArray, 5)); // 4
        System.out.println(BinarySearch.binarySearch(sortedArray, 11)); // -1
    }
}