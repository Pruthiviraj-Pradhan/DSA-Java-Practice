package String;

import java.util.*;
public class SortCharInAscDesc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);

        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        /* For Descending
        reverse the sorted array to get descending order
        for(int i = 0; i < ch.length / 2; i++){
            char temp = ch[i];
            ch[i] = ch[ch.length - 1 - i];
            ch[ch.length - 1 - i] = temp;
        }*/

            
        String ss = new String(ch);
        System.out.println(ss);
        sc.close();
    }
}
