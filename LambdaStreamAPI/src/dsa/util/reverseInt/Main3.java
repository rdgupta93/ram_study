package dsa.util.reverseInt;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        //Ques:-Count of Greater Elements in Sorted Array
        int nums[] ={1,5,7,9,3,4,5,6,2,1};
        Arrays.sort(nums);
        System.out.println("Sorted Array: "+Arrays.toString(nums));
        int counts []=countAllGreater(nums);
        System.out.println("Count the greater elements in Array: "+Arrays.toString(counts));
    }

    private static int[] countAllGreater(int nums[]){
        int n = nums.length;
        int result []=new int[n];
        for(int i=0;i<n;i++){
            result[i] = countGreater(nums,nums[i]);
        }
        return result;
    }

    private static int countGreater(int []nums,int target){
        int n =nums.length;
        int left =0;
        int right =n;
        while(left<right) {
            int mid = left + (right - left) / 2;
            if(nums[mid]<=target){
                left = mid+1;// move right
            }else {
                right = mid; // move left
            }
        }
        return n-left;
    }
}
/*
Step-by-Step Example

Array: nums = [1, 2, 2, 3, 4]
Target: 2

Step 0: Initialize
left = 0
right = 5 (n)

Step 1: First iteration
mid = 0 + (5-0)/2 = 2
nums[mid] = 2


nums[mid] <= target → yes (2 <= 2)

left = mid + 1 = 3

Step 2: Second iteration
left = 3, right = 5
mid = 3 + (5-3)/2 = 4
nums[mid] = 4


nums[mid] <= target → no (4 > 2)

right = mid = 4

Step 3: Third iteration
left = 3, right = 4
mid = 3 + (4-3)/2 = 3
nums[mid] = 3


nums[mid] <= target → no (3 > 2)

right = mid = 3

Now left = 3, right = 3 → loop ends

🔹 Left = first index > target
left = 3


Number of elements strictly greater = n - left = 5 - 3 = 2
✅ Correct, because [3,4] are greater than 2

🔹 Key Points

left = mid + 1 → jab nums[mid] <= target → move right

Kyunki target se chhota ya equal elements ke baad hi strictly greater element ho sakta hai

right = mid → jab nums[mid] > target → move left

Kyunki ye mid ya left side me first strictly greater element ho sakta hai

Loop ends → left = first index of element > target

Count of greater elements → n - left

Kyunki sorted array me left ke baad ke saare elements strictly greater hain
 */
