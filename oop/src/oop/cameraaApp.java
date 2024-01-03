package oop;

public class cameraaApp {
	public static void main(String args[]) {
		camera c=new camera();
		c.color="black";
		c.Brand="sony";
		c.px=121;
		c.focus();
		c.captureimage();
		c.displayImage();
		new camera().displayImage();
		
		
	}

}

