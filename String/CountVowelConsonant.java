package String;

import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        int c = 0;
        for(int i =0; i<s.length(); i++){
            char ch =s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')   //For Vowels
            //if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))  //For consonants
            c++;
            }
                System.out.println(c);
                sc.close();
    }
}
