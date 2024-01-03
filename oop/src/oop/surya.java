package oop;

public class surya {
	public static void main(String args[]) {
		camera c=new camera();
		c.color="black";
		c.Brand="sony";
		c.px=121;
		c.focus();
		c.captureimage();
		c.displayImage();
		System.out.println(c.color);
		System.out.println(c.Brand);
		System.out.println(c.px);
		
	}

}


}
