package String;
/*all english alphabets should be there in that string 
 
s = "abcdefghijklmnopqrstuvwxyz"  true 
s = "abcdefghijkmnopqrstuvwxyz"   false('l' missedhere)
s = "the quick brown fox jumps over lazy dog" true  */
public class StrPangram {
    public static void main(String args[]){
        String s = "the quick brown fox jumps over lazy dog"; 
        boolean flag = true;
        for(int i ='a';i<'z';i++){
            if(s.indexOf(i)<0){
                flag = false;
                break;
            }
        }
        System.out.println(flag);//true
    }
}
