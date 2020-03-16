package Arrays.sort;

public class Calculate {
	 int add(Integer a, Integer b){  
	        return (a+b);  
    }  
    int mul(int a, int b){  
        return (b*a);  
    }
    
    public static void main(String[] args) {
		int [] x = {2 , 3, 5};
		int z = 5;
		Integer p = 5;
		String s = "shika";
		Employee e = new Employee(5);
		callByRef(x);
		callByValue(z);
		callByValue(p);
		callByValue(s);
		callByRef(e);
		System.out.println(x[0]);
		System.out.println(z);
		System.out.println(p);
		System.out.println(s);
		System.out.println(e.getAge());
	}
    
	private static void callByValue(String s) {
		s = "mo";
	}
	private static void callByValue(Integer p) {
		p = 88;
	}
	private static void callByRef(Employee e) {
		e.setAge(80);
	}
	private static void callByValue(int z) {
		z = 20;
	}
	private static void callByRef(int[] x) {
		x[0] = 10;
	}
}
