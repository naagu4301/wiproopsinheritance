package wipro_oops.com;

public class animalbird extends animal {
	//class bird extends animal{
	    @Override
	    public void eat() {
	        //super.eat();
	        System.out.println("overide eat");
	    }
	    @Override
	public void sleep() {
       // super.sleep();
        System.out.println("override sleep");
    }

    public void fly()
    {
        System.out.println("in fly method");

    }
	}



