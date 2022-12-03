
public class Prime {
	public boolean isPrime(int n){
		
	    boolean flag = false;
	    for (int i = 2; i <= n / 2; ++i) {
	      if (n % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag) {
	      return true;
	    }
	    else {
	      return false;
	    }
		
	}

}
