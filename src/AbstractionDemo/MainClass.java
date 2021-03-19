package AbstractionDemo;

public class MainClass {

	public static void main(String[] args) {
		AboutUsPage ob=new AboutUsPage();
		ob.hearderArea();
		ob.pageContentArea();
		ob.leftsideBar();
		ob.footerArea();
		System.out.println("====================");
		
		ContactUsPage cp=new ContactUsPage();
		cp.hearderArea();
		cp.pageContentArea();
		cp.footerArea();

	}

}
