package Strings;

public class palindrome {

  public static void main(String[] args) {
    String palindrome = "abcdedcbba";
    // int start = 0;
    int end = palindrome.length() - 1;
    boolean isPalindrome = true;


    //1
    // for (int start = 0; start <= palindrome.length() / 2; start++) {
    //   if (palindrome.charAt(start) == palindrome.charAt(end)) {
    //     end--;
    //     if (end < start) {
    //       System.out.println("Palindrome no.");
    //     }
    //   } else {
    //     System.out.println("Not a palindrome");
    //     break;
    //   }
    // }


    //2
    // while(start<end){
    //     if(palindrome.charAt(start)!= palindrome.charAt(end)){
    //         isPalindrome = false;
    //         break;
    //     }
    //    start++;
    //    end--;
    // }


    //3
    for(int start = 0 ; start<=palindrome.length()/2; start++){
        if (palindrome.charAt(start) != palindrome.charAt(end)) {
         isPalindrome = false;
         break;
        }
        end--;
    }

    if(isPalindrome){
        System.out.println("Palindrome no.");
    }
    else{
        System.out.println("Not a palindrome no.");
    }
  }
}
