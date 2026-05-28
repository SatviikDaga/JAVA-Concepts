import java.util.Scanner;

public class string {
    public static char[] bubble_sort(String str){
        char[] arr = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }

        // Bubble sort
        for(int i=arr.length-1;i>=1;i--){//controls number of passes to push the largest corresponding element at the end
            for(int j=0;j<=i-1;j++){//iterating through array (i-1) times
                if(arr[j]>arr[j+1]){//comparing adjacent elements
                    char temp=arr[j+1];//swapping
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();
        if(word1.length() == word2.length()){
            char[] arr1=bubble_sort(word1);
            char[] arr2=bubble_sort(word2);
            boolean isAnagram=true;
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    isAnagram = false;
                    break;
                    }
                }
            
            if(isAnagram){
                System.out.println("The first word is an anagram of the second word");
            } else{
                System.out.println("The first word is not an anagram of the second word");
            }
        }
        else{
                System.out.println("Not an anagram");
            }
           
        scanner.close();
    }
}
