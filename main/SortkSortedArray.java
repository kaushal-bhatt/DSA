package main;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SortkSortedArray {
    public static void main(String[] args) {
        PriorityQueue<Integer> min = new PriorityQueue<>();

        int[] arr={6,5,3,2,8,10,9};
        List<Integer> ans = new ArrayList<>();
        int k=3;
        for (int i : arr) {
            min.add(i);
            if (min.size() > k) {
                ans.add(min.poll());
            }
        }
        ans.addAll(min);
        System.out.println(ans);
    }
}
