package javamvc;

public class JavaMVC {
    public static void main(String args[]) {      //main function
    	Model model = retriveCourseFromDatabase();
    	View view = new View();
    	Controller controller = new Controller(model, view);
    	controller.updateView();
    }
    
    	
    	
    	
    	private static Model retriveCourseFromDatabase(){    //other function
    		Model course = new Model();
    		course.setName("Java");
    		course.setId("01");
    		course.setCategory("Programming");
    		return course;
    	
    }
}
