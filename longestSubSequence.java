import java.util.Arrays;

public class longestSubSequence {

    static int getSequence(int arr[], int n)
    {
        int newArr[] = new int[n];
        int res = 0;
        Arrays.fill(newArr,1);
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<i; j++) {
        		if(arr[i]>arr[j]) {
        			newArr[i] = Math.max(newArr[i], newArr[j]+1);
        		}
        	}
        }

        for(int i=0; i<n; i++) {
        	res = Math.max(res, newArr[i]);
        }
 
        return res;
    }
 
    public static void main(String args[])
    {
        int arr[] = { 9, 21, 8, 32, 20, 49, 40, 59 };
        int n = arr.length;
 
        // Function call
        System.out.println("Length of Longest incresing subsequence is "
                           + getSequence(arr, n));
    }
}
