package collection;

import java.util.List;
import java.util.stream.Collectors;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    return input.stream().map(i -> math_pow(function_spe(i), 5).doubleValue()).collect(Collectors.toList());
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    return input.stream().map(s -> concat_spe(modify_str(s))).collect(Collectors.toList());
  }
  
  /**
   * Calculer l'entier i à la puissance n
   * @param i
   * @param n
   * @return i^n
   */
  public static Integer math_pow(Integer i, Integer n) {
	  if (n == 0) {
		  return 1;
	  } else {
		  return i*math_pow(i,n-1);
	  }
  }
  
  /**
   * Retourner la valeur de la fonction (x * 2) + 3 pour un x donné
   * @param x
   * @return (x * 2) + 3
   */
  public static Integer function_spe(Integer x) {
	  return (x * 2) + 3;
  }
  
  /**
   * Concatener une String avec soi-même
   * @param s
   * @return s+s
   */
  public static String concat_spe(String s) {
	  return s.concat(s);
  }
  
  /**
   * Appliquer les transformation nécessaire sur la String
   * @param s
   * @return string
   */
  public static String modify_str(String s) {
	  if (s.length() == 0) {
		  return s;
	  } else if (s.length() == 1) {
		  return s.toUpperCase();
	  } else {
		  return s.toUpperCase().charAt(0)+s.substring(1);
	  }
  }

}
