package Encapulation;

public class MainClass {

	public static void main(String[] args) {
		BasicEncaps be = new BasicEncaps();
		
		int regId=1200;
		
		be.set_rid(regId);
		System.out.println(be.get_rid());

	}

}
