package exercise2;


/**
 * 
 * @author surabhimahajan
 *
 */
public class StringPlaygroundImpl implements StringPlayground{

	/**
	 * Modify the object based on its type.
	 * If obj is String, reverse it
	 * If obj is int, sum it up
	 */
	@Override
	public Object stringManipulationUtility(Object obj) {
		Object result = "";
		if (obj instanceof String) {
			StringBuilder sb = new StringBuilder();
			result = sb.append(obj).reverse().toString();
		} else if (obj instanceof Integer) {
			// 123
			int sum = 0;
			int i = ((Integer) obj).intValue();
			while (i != 0) {
				sum = sum + i % 10;
				i/=10;	
			}
			
			System.out.print(sum);
		}
		System.out.println(result);
		return result;
	}

	public static void main(String str[]) {
		StringPlaygroundImpl o1 = new StringPlaygroundImpl();
		o1.stringManipulationUtility("Hello World");
		o1.stringManipulationUtility(123);
	}

}
