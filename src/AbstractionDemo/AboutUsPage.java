package AbstractionDemo;

public class AboutUsPage extends CommonClassParent{
	public void pageTitle() {
		System.out.println("AboutUs Page- pageTitle");
	}
	public void pageContentArea() {
		System.out.println("AboutUs Page- pageContentArea");
	}
	
	public void leftsideBar() {
		System.out.println("leftsideBar");
	}
	public static void main(String[] args) {
		AboutUsPage ob = new AboutUsPage();
		ob.hearderArea();
		ob.pageContentArea();
		ob.leftsideBar();
		ob.pageTitle();
		ob.footerArea();
	}

}
