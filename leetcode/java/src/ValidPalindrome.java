// https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
    public boolean validateWithTwoPointers(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right){

            while(!Character.isLetter(s.charAt(left)) && !Character.isDigit(s.charAt(left)) && left < right){
                left++;
            }
            while(!Character.isLetter(s.charAt(right)) && !Character.isDigit(s.charAt(right)) && left < right){
                right--;
            }

            if (left >= right) {
                break;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public boolean validateWithHalfLoop(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for(int i = 0; i < s.length() / 2; i++) {

            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public boolean validateWithStringBuilder(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(s);

        return sb.toString().contentEquals(new StringBuilder(sb).reverse());
    }
}
