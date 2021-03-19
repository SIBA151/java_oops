package Methods;

public class ReturnKeyword {
	public static String first_name(String f,String l) {
		String full_name=f.concat(l);
		System.out.println(full_name);
		return full_name;
	}
	public static void main(String[] args) {
		String fname="Admin";
		String lastName="User";
		first_name(fname,lastName);
		first_name(fname,lastName);
		first_name(fname,lastName);
		first_name(fname,lastName);
		

	}

}
