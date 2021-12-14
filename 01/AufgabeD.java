public class AufgabeD{
	public static class Serie{
		String serieNamen;
		class Director{
			String firstName;
			String lastName;
			String Director = firstName+" "+lastName;
		}
		enum Genre{Adventure,Action,Thriller,Comedy};
	}
	public class Season{
		Serie n;
		byte seasonNumber;
		
	}
	public class Episode{
		Season n;
		byte episodeNumber;
		class PremiereTime{
			int year;
			int month;
			int day;
			String premiereTime = day + "." + month + "." + year;
		}
		class Starring{
			String firstName;
			String lastName;
			String mainActor = firstName + " " +lastName;
		}
	}
}