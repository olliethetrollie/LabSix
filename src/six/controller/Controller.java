package six.controller;

import media.model.*;

public class Controller 
{
	public void start()
	{
		World earth;
		Turtle oogway;
		earth = new World();
		oogway = new Turtle(earth);
		oogway.forward(100);
		oogway.turnRight();

	}
}
