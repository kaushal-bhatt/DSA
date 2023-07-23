package main;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKthSmallestElement {
    public static void main(String[] args) {
        int[] arr={7,4,10,15,9,5,6};
        int k=3;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int j : arr) {
            maxHeap.add(j);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        System.out.println(maxHeap.peek());
    }
}
