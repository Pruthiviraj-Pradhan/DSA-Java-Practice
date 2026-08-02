package String;

import java.util.Scanner;

public class VowlConsonantInStr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        for(int i =0; i<s.length(); i++){
            char ch =s.charAt(i);
            //if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')   //For Vowels
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))  //For consonants
                System.out.println(ch);
        }
        sc.close();
    }
}
