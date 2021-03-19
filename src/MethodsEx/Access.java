package MethodsEx;

public class Access {
	public int x;
	static int y;
	public void cal(int a,int b) {
		x+=a;
		y+=b;
	}

	public static void main(String[] args) {
		Access obj1 = new Access();
		Access obj2 = new Access();
		
		obj1.x=0;
		obj1.y=0;
		
		obj1.cal(1, 2);
		
		obj2.x=0;
		obj2.cal(2, 3);
		System.out.println(obj1.x+" "+obj2.y);

	}

}
