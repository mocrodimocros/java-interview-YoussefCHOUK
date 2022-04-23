package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
	  Integer k = i;
	  if (k < 0) {
		  return Option.none();
	  } else {
		  if (n <0 || n>32) {
			  return Option.none();
		  } else if (n == 0) {
			  return Option.of(1);
		  } else {
			  for (int j=1; j<n; j++) {
				  k *= k;
			  }
			  return Option.of(k);
		  }
	  }
	
  }
}
