class Solution {
    public boolean isPalindrome(int x) {
        String str1 = String.valueOf(x);
        int start = 0;
        int end = str1.length()-1;
        for (int i =0;i<str1.length();i++){
            if (str1.charAt(0)=='-'){
                return false;
            }else if (str1.charAt(start)!=str1.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}