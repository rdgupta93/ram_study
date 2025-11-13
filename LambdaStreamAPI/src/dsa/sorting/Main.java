package dsa.sorting;

import java.util.Arrays;



public class Main {

    public static void bubbleSort(int arr[],int n){
      // base case
        if(n==1) return;
        // big element move to last in each iteration
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr,n-1);
        /*
        bubbleSort(arr, 5); // Full array
         → bubbleSort(arr, 4);
           → bubbleSort(arr, 3);
             → bubbleSort(arr, 2);
               → bubbleSort(arr, 1); // ⛔ Base case, dsa.recursion stops
        Array: {5, 1, 4, 2, 8}
        1️⃣ First Call: bubbleSort(arr, 5)
        after 1 call - {1, 4, 2, 5, 8}
        2️⃣ Second Call: bubbleSort(arr, 4)
        after 2 call - {1, 2, 4, 5, 8}
        3️⃣ Third Call: bubbleSort(arr, 3)
        after 3 call - {1, 2, 4, 5, 8}
        4️⃣ Fourth Call: bubbleSort(arr, 2)
        after 4 call -{1, 2, 4, 5, 8}
        5️⃣ Fifth Call: bubbleSort(arr, 1)
         size = 1 --> 1 element is left , it means array is sorted
         */
    }

    public static void insertionSortRecursive(int[] arr, int n){
        // base case
        if(n<=1) return;
        insertionSortRecursive(arr,n-1);
        /*
        insertionSortRecursive(arr,5);
        insertionSortRecursive(arr,4);
        insertionSortRecursive(arr,3);
        insertionSortRecursive(arr,2);
         */
        int j =n-2;
        while(j>=0){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }else{
                break;
            }
        }
    }

    public static void mergeSort(int arr[],int s, int e){
        if(s==e){
            return;
        }
        int m = (s+e)/2;
        mergeSort(arr,s,m);
        mergeSort(arr,m+1,e);
        merge(arr,s,m,e);
    }

    public static void merge(int arr[], int s,int m,int e){
        int p1=s,p2=m+1,p3=0;
        int temp[] = new int[e-s+1];
        while(p1<=m && p2<=e){
            if(arr[p1]<arr[p2]){
                temp[p3]=arr[p1];
                p1++;
                p3++;
            }else{
                temp[p3]=arr[p2];
                p2++;
                p3++;
            }
        }
        while(p1<=m){
            temp[p3] = arr[p1];
            p3++;
            p1++;
        }
        while(p2<=e){
            temp[p3]=arr[p2];
            p2++;
            p3++;
        }
        int k =0;
        for(int i=s;i<=e;i++){
            arr[i]=temp[k];
            k++;
        }
    }

    public static int inverse(int arr[],int s,int e){
        if(s==e){
            return 0;
        }
        int m = (s+e)/2;
        int L = inverse(arr,s,m);
        int R = inverse(arr,m+1,e);
        int C= merge1(arr,s,m,e);
        return L+R+C;
    }

    public static int merge1(int arr[],int s,int m, int e){
        int temp [] = new int[e-s+1];
        int c =0;
        int p1=s,p2=m+1,p3=0;
        while(p1<=m && p2<=e){
            if(arr[p1]<arr[p2]){
                temp[p3]=arr[p1];
                p1++;
                p3++;
            }else{
                temp[p3]=arr[p2];
                p2++;
                p3++;
                c=c+m-p1+1;
            }
        }
        while(p1<=m){
            System.out.println("print");
            temp[p3]=arr[p1];
            p1++;
            p3++;
        }

        while(p2<=e){
            temp[p3]=arr[p2];
            p2++;
            p3++;
        }
        for(int i=0;i<=e-s;i++){
            arr[i+s]=temp[i];
        }

        return c;
    }

    public static void sortByFactors(Integer [] arr){
        Arrays.sort(arr,(a,b)->{
            int fa = countFactors(a);
            int fb = countFactors(b);
            if(fa==fb) return Integer.compare(a, b);
            return Integer.compare(fa,fb);
        });
    }

    public static int countFactors(int a){
        int count =0;
        for(int i=1;i*i<=a;i++){
         if(a%i==0){
             if(i==a/i){
                 count++;
             }else{
                 count = count+2;
             }
         }
        }
        return count;
    }

    public static void main(String[] args) {
        /*
        1) Bubble Sort
        2) Insertion Sort
        3) Merge Sort
         */

        // Bubble sort -  Given arr[n] sort arr[] in increasing order, by swapping only adjacent element.
        /*
        How Bubble Sort Works (Concept):
        1) Compare the first two elements of the array.
        2) If the first element is greater than the second, swap them.
        3) Continue this process for the entire array — in one full pass, the largest element "bubbles up" to the end
          like a bubble rising to the surface — that's why it's called Bubble Sort
        4) Now repeat the same process for the remaining unsorted part of the array.

        example - Array: [5, 3, 8, 4, 2]
        Pass1 - i=0
        Compare 5 & 3 → swap → [3, 5, 8, 4, 2]
        Compare 5 & 8 → no swap
        Compare 8 & 4 → swap → [3, 5, 4, 8, 2]
        Compare 8 & 2 → swap → [3, 5, 4, 2, 8]
        Pass 2- i=1
        Compare 3 & 5 → no swap
        Compare 5 & 4 → swap → [3, 4, 5, 2, 8]
        Compare 5 & 2 → swap → [3, 4, 2, 5, 8]
        Compare 5 & 8 → no swap
        Pass - 3  i=2
        Compare 3 & 4 -> no swap
        Compare 4 & 2 -> swap ->[3,2,4,5,8]
        Compare 4 & 5 -> no swap
        Compare 5 & 8 -> no swap
        Pass 4 -> i =3
        compare 3 & 2 -> [2,3,4,5,8]
        compare 3 & 4 -> no swap
        compare 4 & 5 -> no swap
        compare 5 & 8 -> no swap
        Pass 5 -> i =4
        compare 2 & 3 -> no swap
        compare 3 & 4 -> no swap
        compare 4 & 5 -> no swap
        compare 5 & 8 -> no swap

        Observation --> we seen that at i=4 array is already sorted because there is no swap
        so we declare a swap variable and count the swap variable if in a particular iteration let say i=4
        if swap ==0 , it means array is sorted and break the loop , in this way we optimise the
        time complexity

         */
        // TC- O(N2)  && SC - O(1)
        //Ques1- Given arr[n] sort arr[] in increasing order, by swapping only adjacent element.
        int arr [] = {8,2,4 ,-1,6,7,5,10,-1};  //  { 3, 1, 6, 10, 8} in i =0 swap =2 , i=1 swap =0 data is sorted
        int n = arr.length;
        for(int i=0;i<n;i++){
            int swap =0;
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]= temp;
                    swap++;
                }

            }
            if(swap==0){
                // data is sorted
                break;
            }
        }

       // System.out.println(Arrays.toString(arr));

        // Bubble sort using recursive sol
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));

        // Insertion Sort - Given an ar[n] , first n-1 elements are sorted , sort entire ar[n];
        // No extra space is allowed
        // TC - O(N)  SC-O(1)
        /*
        arr2 = {10, 3, 6, 8, 2, 5}

        Pass 1 (i=1): key = 3
        Compare 10 > 3 → ✅ swap
        [3, 10, 6, 8, 2, 5]

        Pass 2 (i=2): key = 6
        Compare 10 > 6 → ✅ swap → [3, 6, 10, 8, 2, 5]
        Compare 3 < 6 → ❌ break

        Pass 3 (i=3): key = 8
        Compare 10 > 8 → ✅ swap → [3, 6, 8, 10, 2, 5]
        Compare 6 < 8 → ❌ break

        Pass 4 (i=4): key = 2
        10 > 2 → ✅ → [3, 6, 8, 2, 10, 5]
        8 > 2 → ✅ → [3, 6, 2, 8, 10, 5]
        6 > 2 → ✅ → [3, 2, 6, 8, 10, 5]
        3 > 2 → ✅ → [2, 3, 6, 8, 10, 5]

        Pass 5 (i=5): key = 5
        10 > 5 → ✅ → [2, 3, 6, 8, 5, 10]
        8 > 5 → ✅ → [2, 3, 6, 5, 8, 10]
        6 > 5 → ✅ → [2, 3, 5, 6, 8, 10]
        3 < 5 → ❌ break

         */
        int arr1[] = {2,6,10,14,20,4};
        int n1 = arr1.length;
        for(int i=n1-2;i>=0;i--){
            if(arr1[i]>arr1[i+1]){
                int temp = arr1[i];
                arr1[i] = arr1[i+1];
                arr1[i+1] = temp;
            }else{
                break;
            }
        }
        System.out.println(Arrays.toString(arr1));

        // Insertion sort -  Given ar[n] sort it using insertion step;
        // ar[] = { 10  3  6  8  2   5}
        // TC -O(N2)  SC-O(1)
        /*

         */
        int arr2 [] = {10,3,6,8,2,5};
        int n2 = arr2.length;
        insertionSortRecursive(arr2,n2);
        for(int i=1;i<n2;i++){
            for(int j=i-1;j>=0;j--){
                if(arr2[j]>arr2[j+1]){
                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
       /*
        // Merge -  Given 2 sorted array A[n] and B[m] , create C[n+m] which contain overall sorted.
        // A[4] = { 7  10  11   14 }
        // B[3] = { 3  8   9}
        // C[4+3] = { 3  7  8  9  10  11  14}
        int A[] ={ 7,10,11,14};
        int B [] = {3,8,9};
        int a= A.length;
        int b = B.length;
        int C[] = new int [a+b];
        int p1=0,p2=0,p3=0;
        while(p1<a && p2<b){
            if(A[p1]<B[p2]){
                C[p3] = A[p1];
                p1++;
                p3++;
            }else{
                C[p3]= B[p2];
                p2++;
                p3++;

            }

        }

        while(p1<a){
            C[p3]=A[p1];
            p1++;
            p3++;
        }
        while(p2<b){
            C[p3] = B[p2];
            p2++;
            p3++;
        }

        System.out.println(Arrays.toString(C));

        */
       /*
        // Ques -5
        //Given an arr & 3 indices s,m,e
        // subarray [s m] sorted And [m+1 e] sorted
        //sort the array from [s....e]
                     // 0  1   2  3  4  5  6   7  8  9  10  11
        int array [] = {4, 8, -1, 2, 8, 9, 11, 3, 4, 7, 13, 0}; // s=2 m =6 e=10
        int s=2,m=6,e=10;
        int p1=s,p2=m+1,p3=0;
        int temp[] = new int[e-s+1];
        while(p1<=m && p2<=e){
          if(array[p1]<array[p2]){
              temp[p3]=array[p1];
              p1++;
              p3++;
          }else{
              temp[p3]=array[p2];
              p2++;
              p3++;
          }
        }
        while(p1<=m){
            temp[p3] = array[p1];
            p3++;
            p1++;
        }
        while(p2<=e){
            temp[p3]=array[p2];
            p2++;
            p3++;
        }
        int k =0;
        for(int i=s;i<=e;i++){
            array[i]=temp[k];
            k++;
        }
        System.out.println(Arrays.toString(array));


        */
        // Ques 6 -> Merge Sort
        // Keep diving the array element till the single element
        //merge them
        int array1 [] = {4, 8, -1, 2, 8, 9, 11, 3, 4, 7, 13, 0};
        mergeSort(array1,0,array1.length-1);
        System.out.println(Arrays.toString(array1));



        // SORTING -2

        // Q1 - Given 2 arrays A[N] & A[M]
        // Count the no. of pair (i,j) such that A[i]>B[j]
        //A= {7,3,5} B={2,0,6}  Ans =7   Pair (7,2),(7,0),(7,6),(3,2),(3,0),(5,2),(5,0)
        int A [] ={8,5,3,10};
        int B [] ={5,4,9,2};
        int N = A.length;
        int M = B.length;
        // BruteForce   - TC - O(N*M)
        int count =0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i]>B[j]){
                    count++;
                }
            }
        }
        System.out.println("Count: "+count);

        // Optimized Approach - TC->N*logN +M*logN +N+M  SC-> O(N+M)
        // Sort The arrays - NlogN

        Arrays.sort(A);  // 3 5 7
        Arrays.sort(B); //  0 2 6
        int count1 =0;
        int p1=0,p2=0;
        while(p1<N && p2<M){
            if(A[p1]>B[p2]){
                count1 =count1+N-p1;
                p2++;
            }else{// A[p1]<B[p2]
                p1++;
            }
        }
        System.out.println("Count1: "+count1);

        //Given A[N] , Find the no. of pairs i,j such that i<j && A[i]>A[j]
        // A[5] = {6,2,9,3,5} ans =5  Pair - (6,2),(6,3),(6,5),(9,3),(9,5)
        int array[] = {10,3,8,15,6,12,2,18,7,1};
        int count2 =0;
        // BruteForce - TC - O(N2)
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    count2++;
                }
            }
        }
        System.out.println("Count2: "+count2);

        // A=[10,3,8,15,6], B=[12,2,18,7,1]
        //Total pairs = { Total paris in A} + {Total pairs in B}  + {Total pairs between A &B}

        int count3= inverse(array,0,array.length-1);
        System.out.println("Count3: "+count3);


        // Ques 3 - Given N distinct array elements re arranging array in wave form
        // arr = 6 8 2 9 10 --> Wave form - 6 2 10 8 9

        int arrays[] = {8,2,4,10,9,3,14,6,7};
        // Idea1 -> Sort the array Lexographically wave(difference betw the adjacent ele is min)
        // TC - O(NLogN+N) SC - O(N)
          // sorts   = { 2,3,4,6,7,8,9,10,14}   make pair (2,3),(4,6) ...so on
        Arrays.sort(arrays);
        for(int i=0;i<arrays.length-1;i=i+2){
            int temp = arrays[i];
            arrays[i]=arrays[i+1];
            arrays[i+1]=temp;
        }
        System.out.println(Arrays.toString(arrays));

        // idea2- at even index - it should be decrease means..(arr[i]<arr[i+])-->if ->arr[i+1]> arr[i] swap
        // and at odd index it should be increase means..(arr[i]<arr[i+1]) --if not then -->arr[i]>arr[i+1] swap
        // TC - O(N) SC - 0(1)

        int arrays1[] = {8,2,4,10,9,3,14,6,7};  // 8 2 10 4 9 3 14 6 7
        for(int i=0;i<arrays1.length-1;i++){
            if(i%2==0){
                if(arrays1[i+1]>arrays1[i]){
                    int temp = arrays1[i];
                    arrays1[i] = arrays1[i+1];
                    arrays1[i+1] = temp;
                }
            }else{
                if(arrays1[i]>arrays1[i+1]){
                    int temp = arrays1[i];
                    arrays1[i] = arrays1[i+1];
                    arrays1[i+1] = temp;
                }
            }
        }

        System.out.println("Arrays1: "+Arrays.toString(arrays1));

        // You are given an array A of N elements. Sort the given array in increasing order of number of distinct factors of each element
        //element having the least number of factors should be the first to be displayed and the number having highest number of factors should be the last one
        // If 2 elements have same number of factors, then number with less value should come first.
        // A = [6, 8, 9] --> [9,6,8]  9 - 3 factor , 6 - 4 factor and 8 - 4 factors
        Integer [] arr3 = {6, 8, 9};
        sortByFactors(arr3);
        System.out.println("Sorted array by number of factor: "+Arrays.toString(arr3));

    }


}
