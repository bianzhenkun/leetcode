class ValidPalindrome {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                break;
            }
            left++;
            right--;
        }
        return validPalindrome2(s,left+1,right) || validPalindrome2(s,left,right-1);
    }

    public boolean validPalindrome2(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                break;
            }
            left++;
            right--;
        }
        return !(left<right);
    }
}