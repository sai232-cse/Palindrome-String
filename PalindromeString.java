import java.util.Scanner;
public class PalindromeString{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter a string");
        String s=snr.nextLine();
        int flag=0;
	System.out.println("The reverse of a given string is:");
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=(s.charAt(s.length()-1-i))){
                    flag=1;
                }
            
        }
        if(flag==0){
            System.out.println("Given string is a palindrome string");
        }
        else{
            System.out.println("Given string is not a palindrome string");
        }
    }
}