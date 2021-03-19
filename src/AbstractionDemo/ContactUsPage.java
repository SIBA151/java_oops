package AbstractionDemo;

public class ContactUsPage extends CommonClassParent{

	public static void main(String[] args) {
		ContactUsPage ob=new ContactUsPage();
		

	}

	@Override
	public void pageTitle() {
		System.out.println("ContactUsPage- Title");
		
	}

	@Override
	public void pageContentArea() {
		System.out.println("ContactUsPage- pageContentArea");
		
	}
	public void googleMap() {
		System.out.println("google Map");
	}

}
