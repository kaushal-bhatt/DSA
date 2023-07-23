package main;

import java.util.PriorityQueue;

public class FindKthLargestElement {
    public static void main(String[] args) {
        int[] arr = {7, 4, 10, 15, 9, 5, 6};
        int k = 3;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int j : arr) {
            maxHeap.add(j);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        System.out.println(maxHeap);
        while(!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll()+"\t");
        }
    }
}
