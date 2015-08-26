package javasmmr.zoosome.models.animals;

import static javasmmr.zoosome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoosome.services.factories.Constants;

public class Mantis extends Insect {
	private static final String DEFAULT_NAME = "Malaysian orchid mantis";
	private static final int DEFAULT_NUMBER_OF_LEGS = 6;
	private static final double DEFAULT_MAINTENANCE_COST = 0.16D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.0D;
	private static final boolean DEFALULT_CAN_FLY = true;
	private static final boolean DEFAULT_IS_DANGEROUS = false;
	
	public Mantis() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFALULT_CAN_FLY, DEFAULT_IS_DANGEROUS);
	}
	
	public Mantis(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final boolean flyer, final boolean dangerous) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, flyer, dangerous);
	}
	
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, String.valueOf(Constants.Animals.Insect.MANTIS));
	}
}
