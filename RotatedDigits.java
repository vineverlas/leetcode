/*
X is a good number if after rotating each digit individually by 180 degrees, we get a valid number that is different from X.  Each digit must be rotated - we cannot choose to leave it alone.

A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other; 6 and 9 rotate to each other, and the rest of the numbers do not rotate to any other number and become invalid.

Now given a positive number N, how many numbers X from 1 to N are good?
*/

class RotatedDigits {
    public int rotatedDigits(int N) {
        int count = 0;
        
        for (int i = 1; i <= N; i++) {
            if (good(i, false)) count++;
        }
        
        return count;
    }
    
    public boolean good(int n, boolean flag) {
        if (n == 0) return flag;
        
        int k = n % 10;
            
        if (k == 3 || k == 4 || k == 7) return false;
        if (k == 0 || k == 1 || k == 8) return good(n/10, flag);
            
        return good(n/10, true);
    }
}
