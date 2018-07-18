/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance
*/

public class Solution {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = 0;
        for (int i=0; i<32; i++) {
            count += (z >> i) & 1;
        }
        
        return count;
    }
}