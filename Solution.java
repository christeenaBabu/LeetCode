import java.util.Arrays;
import java.util.Vector;


    public class Solution {
        public void reverseString(Vector<Character> s) {
            //your code goes here
            int l=0;
            int r=s.size()-1;
            while(l<r){
                char temp=s.get(l);
                s.set(l,s.get(r));
                s.set(r,temp);
                l++;
                r--;
            }

        }
    }



class Main {
    public static void main(String[] args) {
        Vector<Character> str =
                new Vector<>(Arrays.asList('h', 'e', 'l', 'l', 'o'));

        // Creating an instance of Solution class
        Solution sol = new Solution();

        // Function call to reverse the string
        sol.reverseString(str);

        for (char c : str) {
            System.out.print(c);
        }
    }
}
