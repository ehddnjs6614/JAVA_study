package API;

/**
 * This One is Calculator
 * 
 * @author KDW
 * @since 2021_05_27
 * 
 */

    
public class Calc {
	/**
	 * To add the following numbers.<br>
	 * For example<br>
	 * add(1, 3) return 4
	 * @param num1 : First Integer for add
	 * @param num2 : Last  Integer for add
	 */
	public static void add(int num1,int num2) {
		
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		Calc.add(1, 3); //add에 갖다대면 문서화 된걸 볼수있다.
	}
	
	
}
