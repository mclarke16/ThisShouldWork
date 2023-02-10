package hpz729_lab2;

/**
 * This class represents a Crew Member object It has properties for the Crew
 * Members name, position, rank, and species as well as two constructors. One
 * with all Crew Member values and one with all values minus assignment. This
 * class also contains all setters and getters as well as an overwritten
 * toString method that serves as the base string representation of the Crew
 * Member object for the higher level to call on.
 * 
 * @author Mickey Clarke hpz729 
 * UTSA CS 3443 - Lab 2 
 * Fall 2022
 */
public class CrewMember {
	private String name;
	private String position;
	private String rank;
	private String species;
	private String assignment;

	/**
	 * Crew Member Constructor with all values
	 * 
	 * @param name-Crew     Members name
	 * @param position-Crew Members position
	 * @param rank-Crew     Members rank
	 * @param species-Crew  Members species
	 */
	public CrewMember(String name, String position, String rank, String species, String assignment) {
		this.name = name;
		this.position = position;
		this.rank = rank;
		this.species = species;
		this.assignment = assignment;
	}

	/**
	 * Crew Member Constructor without assignment
	 * 
	 * @param name-Crew     Members name
	 * @param position-Crew Members position
	 * @param rank-Crew     Members rank
	 * @param species-Crew  Members species
	 */
	public CrewMember(String name, String position, String rank, String species) {
		this.name = name;
		this.position = position;
		this.rank = rank;
		this.species = species;
	}

	/**
	 * This is the base toString method that is appended to the higher level
	 * toStrings. It returns a string representation of a Crew Member object.
	 */
	@Override
	public String toString() {
		String s = "- " + getName() + "  (" + getPosition() + ")" + "- " + getRank() + " [" + getSpecies() + "] ";
		return s;
	}

	/**
	 * Crew Member Name Getter
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Crew Member Name Setter
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Crew Member Position Getter
	 * 
	 * @return position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * Crew Member Position Setter
	 * 
	 * @param position
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * Crew Member Rank Getter
	 * 
	 * @return rank
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * Crew Member Rank Setter
	 * 
	 * @param rank
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}

	/**
	 * Crew Member Species Getter
	 * 
	 * @return
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * Crew Member Species Setter
	 * 
	 * @param species
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * Crew Member Assignment Getter
	 * 
	 * @return assignment
	 */
	public String getAssignment() {
		return assignment;
	}

	/**
	 * Crew Member Assignment Setter
	 * 
	 * @param assignment
	 */
	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}
}
