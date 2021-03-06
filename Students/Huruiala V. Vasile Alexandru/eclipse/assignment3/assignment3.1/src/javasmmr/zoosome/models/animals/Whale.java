package javasmmr.zoosome.models.animals;

public class Whale extends Mammal {
	private static final String DEFAULT_NAME = "Blue whale";
	private static final int DEFAULT_NUMBER_OF_LEGS = 2;
	private static final double DEFAULT_BODY_TEMPERATURE = 18.2D;
	private static final double DEFAULT_PERCENTAGE_BODY_HAIR = 0.0D;
	
	public Whale() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_BODY_TEMPERATURE, DEFAULT_PERCENTAGE_BODY_HAIR);
	}
	
	public Whale(final String animalName, final int numberOfLegs, final double normalTemp, final double muchHair) {
		super(animalName, numberOfLegs, normalTemp, muchHair);
	}
}
