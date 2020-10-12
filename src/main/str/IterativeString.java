package main.str;

public class IterativeString {

    //Time Complexity : O(n)

    static void reverseString(String str){

        char[] chArray = str.toCharArray();
        char[] tempArray = new char[str.length()];
        int begin = 0;
        int end  = str.length() - 1;
        for(int i = begin; i<= end;i++ ){
            tempArray[end-i] = chArray[i];
        }

        printArray(tempArray,tempArray.length);
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

