package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2, 1, 4};
        insertionSort(nums);              // {1, 1, 2, 3, 4, 5}

        System.out.println(Arrays.toString(nums));

    }

    /**
     * sorting by bubbleSort
     * @param nums the array of numbers
     */
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

     /*
 315214
 135214
 115234
 112534
 112354
 112345
    */

    /**
     * sorting by selectionSort
     * @param nums the array of numbers
     */
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            // swap nums[i] and nums[minIdx]
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
    }

    /*
    3  15214
    1  35214
    13  5214
    1123   54
    11234  5
     */


    /**
     * sorting by intertionSort
     * @param nums the array of numbers
     */
    public static void insertionSort1(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key ;
        }
    }

}



