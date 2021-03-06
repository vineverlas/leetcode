/*

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        if(isBadVersion(1)) {
            return 1;
        }
        
        int l = 1;
        int r = n;
        int m;
        
        while(r - l > 1) {
            m = l + (r - l)/2;
            
            if(isBadVersion(m)) {
                r = m;
            } else {
                l = m;
            }
        }
        
        if(isBadVersion(r)) {
            return r;
        } else {
            return 0;
        }
    }
}
