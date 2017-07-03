package blackpearl;

import org.junit.Test;

public class TrainingProgram {
	@Test
	public void assignProgram()
	{
		Login l = new Login();
		
		l.login();
		
		l.driver.get("https://blackpearl.kinductdev.com/training_program?context=default#!assigned");
	}

}
