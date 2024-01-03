package Rules_Of_Methodoverriding_With_Exception_Handling;

public class ParentchildApp {

	public static void main(String[] args) {
		
            Child c=new Child();
            try {
				c.display();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
