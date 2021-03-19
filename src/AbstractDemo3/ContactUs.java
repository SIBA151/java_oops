package AbstractDemo3;

public class ContactUs extends HeaderClass{
	public void bannerSlider() {
		System.out.println("bannerSlider");
	}

	public static void main(String[] args) {
		ContactUs obj = new ContactUs();
		AboutUs ab=new AboutUs();
		
		ab.bannerSlider();

	}

}
