public class Fibo {
	public static void main(String[] args) {
	 System.out.println(fib(6));
	}
	 
	 public int fib(int n)
	 {
	  if(n<2)
	  {
	  return n;
	  }
	  
	  return fib(n-1) + fib(n-2);
	 }
}


//class Solution {
 //   public int fib(int n) {
//        return (int)Math.round(Math.pow(1.618034,n) / Math.sqrt(5));
//    }
//}
	 