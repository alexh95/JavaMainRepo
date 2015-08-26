package javasmmr.zoosome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoosome.repositories.AnimalRepository.createNode;

public abstract class Insect extends Animal {
	private static final boolean DEFAULT_CAN_FLY = false;
	private static final boolean DEFAULT_IS_DANGEROUS = false;
	
	private boolean canFly;
	private boolean isDangerous;
	
	protected Insect() {
		super();
		this.canFly = DEFAULT_CAN_FLY;
		this.isDangerous = DEFAULT_IS_DANGEROUS;
	}
	
	protected Insect(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final boolean flyer, final boolean dangerous) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc);
		this.canFly = flyer;
		this.isDangerous = dangerous;
	}
	
	public boolean getCanFly() {
		return this.canFly;
	}
	
	public void setCanFly(final boolean flyer) {
		this.canFly = flyer;
	}
	
	public boolean getIsDangerous() {
		return this.isDangerous;
	}
	
	public void setIsDangerous(final boolean dangerous) {
		this.isDangerous = dangerous;
	}
	
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(this.getCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(this.getIsDangerous()));
	}
	
	public void decodeFromXML(Element element) {
		super.decodeFromXML(element);
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
