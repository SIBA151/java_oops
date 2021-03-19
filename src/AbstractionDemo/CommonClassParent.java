package AbstractionDemo;

abstract public class CommonClassParent {
	int a;
	public void hearderArea() {
		System.out.println("Header Section");
	}
	abstract public void pageTitle();
	abstract public void pageContentArea();
	
	public void footerArea() {
		System.out.println("FooterArea");
	}
//	public static void main(String[] args) {
//		CommonClassParent ob =new CommonClassParent() {
//			public void pageTitle() {
//				System.out.println("PageTitle");
//			}
//			public void pageContentArea() {
//				System.out.println("pageContentArea");
//			}
//		};
//	}

}
