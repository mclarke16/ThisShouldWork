package hpz729_lab2;

/**
 * This class represents a Starship object
 * It has properties for the Starships name, registry, and ship class as well as an initialized 
 * ArrayList of CrewMember object.
 * This class also containins all setters and getters as well as a 
 * methods for returning the number of personell and an overwritten toString method that calls 
 * the toString from the CrewMember class.
 *  
 * @author Mickey Clarke hpz729
 * UTSA CS 3443 - Lab 2
 * Fall 2022
 */
import java.util.ArrayList;

public class Starship {
	private String name;
	private String registryName;
	private String shipClass;
	ArrayList<CrewMember> crewList = new ArrayList<CrewMember>();

	/**
	 * Starship Constructor
	 * 
	 * @param name- Ships name
	 * @param registry- Ships registry
	 * @param shipClass- Ships class
	 */
	public Starship(String name, String registry, String shipClass) {
		this.name = name;
		this.registryName = registry;
		this.shipClass = shipClass;
	}

	/**
	 * getNumberOfPersonel returns an int representing the number of personel in the crewList ArrayList
	 * @return counter-the number of personell in the crewList
	 */
	public int getNumberOfPersonnel() {
		int counter = 0;
		for (int i = 0; i < crewList.size(); i++) {
			counter += 1;
		}
		return counter;
	}

	/**
	 * toString method that initializes an empty String named S and a String named
	 * member that is null. It then checks the size of the crewList to determine if
	 * plural or not. Next, String s is appended, then crewList is looped through
	 * and retrieved and appended to the end of string s.
	 * @return s
	 */
	@Override
	public String toString() {
		String s = "";
		String member = null;
		if (crewList.size() == 1) {
			member = "member";
		} else {
			member = "members";
		}
		s += getShipName() + ", " + getShipClass() + ". Registry: " + getRegistry() + "\n" + getNumberOfPersonnel()
				+ " crew " + member + " assigned.\n";
		for (int i = 0; i < crewList.size(); i++) {
			s += crewList.get(i).toString() + "\n";
		}

		return s;
	}

	/**
	 * This is the addCrewMember(…) method which takes a CrewMember parameter and
	 * adds them to the starship and returns nothing
	 * 
	 * @param crewmember to add
	 */
	public void addCrewMember(CrewMember p) {
		crewList.add(p);
	}

	/**
	 * @return name: the ships name
	 */
	public String getShipName() {
		return name;
	}

	/**
	 * Ship Name Setter
	 * 
	 * @param Ship name to set
	 */
	public void setShipName(String name) {
		this.name = name;
	}

	/**
	 * Ship Registry Getter
	 * 
	 * @return Ship registry
	 */
	public String getRegistry() {
		return registryName;
	}

	/**
	 * Ship Registry Setter
	 * 
	 * @param Ship registry to set
	 */
	public void setRegistry(String registry) {
		this.registryName = registry;
	}

	/**
	 * Ship Class Getter
	 * 
	 * @return Starship Class
	 */
	public String getShipClass() {
		return shipClass;
	}

	/**
	 * Ship Class Setter
	 * 
	 * @param shipClass to set
	 */
	public void setShipClass(String shipClass) {
		this.shipClass = shipClass;
	}

	/**
	 * Crew List Getter
	 * 
	 * @return the crewList ArrayList
	 */
	public ArrayList<CrewMember> getCrewList() {
		for (int i = 0; i < crewList.size() - 1; i++) {
			crewList.get(i);
		}
		return crewList;
	}

	/**
	 * Crew List Setter
	 * 
	 * @param crewmember to add to CrewMember ArrayList
	 */
	public void setCrewList(ArrayList<CrewMember> crewList) {
		this.crewList = crewList;
	}
}
