package hpz729_lab2;

import java.util.ArrayList;
//import java.io.FileNotFoundException;

public class Starship {
	private String name;
	private String registryName;
	private String shipClass;
	ArrayList<CrewMember> crewList = new ArrayList<CrewMember>();

	public Starship(String name, String registry, String shipClass) {
		this.name = name;
		this.registryName = registry;
		this.shipClass = shipClass;
	}

	public String toString() {
		String s = crewList.toString();
		for(int i = 0; i < crewList.size() - 1;i++)
		{
			s += crewList.get(i).toString()+ "\n";
		}		
		s += "\n " + getName()  + ", " + getShipClass() + ". Registry: " + getRegistry();
		
		return s;
	}

	// An addCrewMember(…) method which takes a CrewMember parameter and adds them
	// to the starship and returns nothing
	public void addCrewMember(CrewMember p) 
	{
			crewList.add(p);
	}

	public int getNumberOfPersonnel() {
		int counter = 0;
		for (int i = 0; i < crewList.size(); i++) {
			counter += 1;
		}
		return counter;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the registry
	 */
	public String getRegistry() {
		return registryName;
	}

	/**
	 * @param registry the registry to set
	 */
	public void setRegistry(String registry) {
		this.registryName = registry;
	}

	/**
	 * @return the starship
	 */
	public String getShipClass() {
		return shipClass;
	}

	/**
	 * @param starship the starship to set
	 */
	public void setShipClass(String shipClass) {
		this.shipClass = shipClass;
	}

	/**
	 * @return the crewList
	 */
	public ArrayList<CrewMember> getCrewList() {
		for(int i = 0; i < crewList.size()-1; i++)
		{
			crewList.get(i);
		}
		return crewList;
	}

	/**
	 * @param crewList the crewList to set
	 */
	public void setCrewList(ArrayList<CrewMember> crewList) {
		this.crewList = crewList;
	}
}
