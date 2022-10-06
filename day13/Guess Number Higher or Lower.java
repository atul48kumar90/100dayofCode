/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l =1;
        int end = n;
        
        while(l<=end)
        {
            int m=l+(end-l)/2;
            if(guess(m) == 0)
            {
                return m;
            }
            
            else if(guess(m) == -1)
            {
                end = m -1;
            }
            else if(guess(m) == 1)
            {
                l = m+1;
            }
        }
        return -1;
    }
}