package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.

Write an efficient algorithm for the following assumptions:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
* */
public class OddOccurrencesInArray {

    public static void main(String[] args) {

        int[] data = {15,11,3,1,3,1,11,7,3,3,7,11,3,1,3,1,11,7,3,3,7,11,3,1,3,1,11,7,3,3,7,11,3,1,3,1,11,7,3,3,7,11,3,1,3,1,11,7,3,3,7,11,3,1,3,1,11,7,3,3,7,11,3,1,3,1,11,7,3,3,7};
        int result = solution(data);
        System.out.println(result);
    }

    public static int solution(int[] A){
        int result = 0;
        if(A.length > 1000000){
            return result;
        }


        
        if(A!=null && A.length >0){
            List<Integer> list = new ArrayList<>();
            for(int i =0; i < A.length; i++){
                if(list.contains(A[i])){
                    list.remove(list.indexOf(A[i]));
                }
                else {
                    list.add(A[i]);
                }
            }
            result = list.get(0);
        }

        return result;
    }
}
