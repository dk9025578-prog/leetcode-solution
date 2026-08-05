class Solution {
    public boolean isPalindrome(int x) {//456
        if(x < 0) return  false;
        int rev = 0;
        int original = x;

        while(x != 0){
            int digit = x % 10;//6
            rev = rev * 10 + digit;// 2 40+5 =45
            x /= 10; // 456/45
    }
    return original == rev;
    }
  

    }