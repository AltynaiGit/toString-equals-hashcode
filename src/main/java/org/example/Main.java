package org.example;

   import java.util.Arrays;

        public class Main {
            public static void main(String[] args) {
                int[] arr = {1, 4, 2, 5, 2, 5};
                Arrays.sort(arr);
                int target = 4;

                int index = binarySearch(arr, target);
                System.out.println(index);
            }

            public static int binarySearch(int[] arr, int target) {
                int low = 0;
                int high = arr.length - 1;

                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (arr[mid] == target) return mid;
                    if (arr[mid] < target) low = mid + 1;
                    else high = mid - 1;
                }
                return -1;
            }
        }
