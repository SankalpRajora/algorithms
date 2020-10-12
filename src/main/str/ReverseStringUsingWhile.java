package main.str;

public class ReverseStringUsingWhile {

    //Time Complexity : O(n)

    static void reverseString(String str){

        char[] chArray = str.toCharArray();
        char temp ;
        int begin = 0;
        int end  = str.length() - 1;

        while (begin < end)
        {
            temp = chArray[end];
            chArray[end] = chArray[begin];
            chArray[begin] = temp;
            begin++;
            end--;

        }
        printArray(chArray,chArray.length);
    }

    static void printArray(char arr[],
                           int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i]);

        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("Hello Java");
        reverseString("I am Sankalp Rajora");
    }
}
