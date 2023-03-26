package Recursion;

import java.util.ArrayList;


public class AllOccurences {
    public static void alloccur(int a[], int i, int key) {
        if (i == a.length) {
            return;
        }
        if (a[i] == key) {
            // list.add(i);
            System.out.print(i+" ");
            alloccur(a, i + 1, key);
        } else {
            alloccur(a, i + 1, key);
        }
    }

    public static ArrayList<Integer> allocc(int a[], ArrayList<Integer> list, int i, int key) {
        if (i == a.length) {
            return list;
        }
        if (a[i] == key) {
            list.add(i);
            return allocc(a, list, i + 1, key);
        }
        return allocc(a, list, i + 1, key);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 1, 8, 1, 6, 1 };
        // ArrayList<Integer> list = new ArrayList<>();
        // list = allocc(a, list, 0, 1);
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.print(list.get(i) + " ");
        // }
        alloccur(a, 0, 1);
    }
}
