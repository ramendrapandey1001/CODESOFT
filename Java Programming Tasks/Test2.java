
import java.util.Arrays;



public class Test2 {
   static String result = "##";

    public static void main(String[] args) {

        int[] arr1 = {1,2,12,34,47,55,78,93};
        int[] arr2 = {5,14,24,51,58,62,79,97};

        Test2 test2 = new Test2();
        int[] arr11 = test2.merge1(arr1,arr2);
        int[] arr22 = test2.merge2(arr1,arr2);


        String str1 = Arrays.toString(arr11);
        String str2 = Arrays.toString(arr22);

        System.out.println("By method 1 :- "+str1);
        System.out.println("By method 2 :- "+str2);

        String string = test2.binarySearch(arr11,0,arr22.length-1,14);
        System.out.println(string);

    }

    public int [] merge1(int [] arr1, int [] arr2)
    {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int length = length1+length2;

        int [] arr = new int[length];

        int i = 0;
        int j = 0;
        while (i<arr1.length)
        {
            arr[i] = arr1[i];
            i++;
        }

        while (i<arr.length && j< arr2.length)
        {
            arr[i] = arr2[j];
            i++;
            j++;
        }

        Arrays.sort(arr);

        return arr;
    }

    public int [] merge2(int [] arr1, int [] arr2)
    {
        int[] arr = new int[arr1.length+arr2.length];
        int i =0;

        for (int num : arr1) {
            arr[i]= num;
            i++;
        }

        for (int num : arr2) {
            arr[i]= num;
            i++;
        }
        Arrays.sort(arr);

        return arr;

    }

    public String binarySearch(int [] arr, int left, int right, int num)
    {
        Test2 test2 = new Test2();

        if (left < right)
        {
            int mid = (right+left)/2;

            if(num>arr[mid])
            {
                test2.binarySearch(arr,mid-1,right,num);
            }
            if(num<arr[mid])
            {
                test2.binarySearch(arr,left,mid+1,num);
            }
            if(arr[mid]==num)
            {
                result= " Index of value [ "+num+" ] in the array :- "+ mid;
            }

        }
        else
                result= "Number is not present in array";

    return  result;
    }
}
