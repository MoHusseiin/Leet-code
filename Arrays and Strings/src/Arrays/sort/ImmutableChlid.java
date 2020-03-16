package Arrays.sort;

public class ImmutableChlid extends Immutable{

	public static void main(String[] args) {
		System.out.println("mongo is mongo".replaceAll("ff", "shika"));
		System.out.println("mongo is mongo".replaceAll("mongo", "shika"));
		StringBuilder sb = new StringBuilder("start");
		StringBuilder same = new StringBuilder();
		same = sb.append(" middle");
		sb.append(" final");
		same.append(" result");
		String s = same.toString();
		System.out.println(same +"\n"+ sb+"\n"+s);
		System.out.println(same.equals(sb));             // true      
		System.out.println(same.equals(s));              // false
		System.out.println(sb.equals(s));                // false
		System.out.println(sb.toString().equals(s));     // true
		System.out.println(same == sb);                  // true
		System.out.println(same.toString() == s);        // false
		System.out.println(sb.toString() == s);          // false
	}
}
