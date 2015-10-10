/*
Write a function that takes an unsigned integer and 
returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, 
so the function should return 3.
*/

public class Number_Of_1_Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        
        for(int i = 0; i < 32; i++) {
            count += (n >> i) & 1;
        }
        
        return count;
    }
}
