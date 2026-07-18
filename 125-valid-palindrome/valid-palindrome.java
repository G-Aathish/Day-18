class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        StringBuilder s1=new StringBuilder(s).reverse();
        return s1.toString().equals(s);
        
        
    }
}
