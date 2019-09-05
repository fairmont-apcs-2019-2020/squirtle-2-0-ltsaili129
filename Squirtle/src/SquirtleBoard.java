public class SquirtleBoard extends Board {

	
	public SquirtleBoard() 
	{
		// Call the Board constructor to make an 8x4 Board
	 	super(8, 4);
	 	newGame(false);
	 	setTitle("PokemonCode Assignment 1");
	 	setInitialText("What will Squirtle do with Bulbasaur's flowers?");
	}
	

	
	@Override
	public void newGame(boolean repaint)
	{
		super.newGame(repaint);
		
		// Create a SquirtleThing at 0, 0
	 	SquirtleThing squirtle = new SquirtleThing();
	 	squirtle.setLocation(5, 0);
	 	add(squirtle);
	 	
	 	// Create a BulbasaurThing at 0, 4
	 	BulbasaurThing bulbasaur = new BulbasaurThing();
	 	bulbasaur.setLocation(4, 0);
	 	add(bulbasaur);
	
	 	// Create a SquirtleThing at 0, 0
	 	 	SquirtleThing squirtle2 = new SquirtleThing();
	 	 	squirtle2.setLocation(3, 0);
	 	 	add(squirtle2);
	 	
	 	 	// Create a SquirtleThing at 0, 0
	 	 	SquirtleThing squirtle3 = new SquirtleThing();
	 	 	squirtle3.setLocation(3, 1);
	 	 	add(squirtle3);
	 	 	
	 	// Create a SquirtleThing at 0, 0
	 	 	SquirtleThing squirtle4 = new SquirtleThing();
	 	 	squirtle4.setLocation(5, 3);
	 	 	add(squirtle4);
	 	 	
	 	// Create a SquirtleThing at 0, 0
	 	 	SquirtleThing squirtle5 = new SquirtleThing();
	 	 	squirtle5.setLocation(5, 2);
	 	 	add(squirtle5);
	 	 	
	 	// Create a SquirtleThing at 0, 0
	 	 	SquirtleThing squirtle6 = new SquirtleThing();
	 	 	squirtle6.setLocation(5, 1);
	 	 	add(squirtle6);
	 	
	 	 // Create a BulbasaurThing at 0, 4
		 	BulbasaurThing bulbasaur2 = new BulbasaurThing();
		 	bulbasaur2.setLocation(1, 0);
		 	add(bulbasaur2);
		
	}
} 
