package org.vashonsd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the values in the array:");

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();

        }
        System.out.println("enter value to be searched");
        int num = scan.nextInt();

        int low = 0;
        int high = n-1;
        int mid = 0;

        while(low<=high){
            mid = (low + high)/2;

            if(arr[mid] == num){
                System.out.println("Value is found at index " + mid);
                break;
            }else if (arr[mid] > num){
                high = mid-1;
            }else if (arr[mid] < num){
                low = mid + 1;
            }
        }
        if(low > high){
            System.out.println("Value is not found in array");
        }
    }
}
