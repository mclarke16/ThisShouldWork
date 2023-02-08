package hpz729_lab2;

public class Lab2 {

	public static void main(String[] args) {
		Fleet unitedFederation = new Fleet("United Federation of Planets");
		
		try {
			unitedFederation.loadStarships("data");
			


		} catch (Exception e) {
			// this is a try/catch which will show any errors to the console (more on these
			// in coming weeks!)
			e.printStackTrace();
		}
		System.out.println(unitedFederation.toString());
		//System.out.println(unitedFederation);
	}

}
