/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
*/

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if((s == null && t == null) || (s.length() == 0 && t.length() == 0)) {
            return true;
        }
        
        if(s == null || t == null) {
            return false;
        }
        
        int[] hash1 = new int[256];
        int[] hash2 = new int[256];
        
        for(int i=0; i<s.length(); i++) {
            if(hash1[s.charAt(i)] != hash2[t.charAt(i)]) {
                return false;
            }
            
            hash1[s.charAt(i)] = i+1;
            hash2[t.charAt(i)] = i+1;
        }
        
        return true;
    }
}
