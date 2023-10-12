
public class Problem4 {
	public static void main(String[] args) {
		String text = "To be or not to be, that is the question;"
				+ "Whether `tis nobler in the mind to suffer"
				+ " the slings and arrows of outrageous fortune,"
				+ " or to take arms against a sea of troubles,"
				+ " and by opposing end them?";
		//YOUR CODE HERE
		/**
		 * Extract array of words from text
		 */
		String[] arrOfText = text.split("[ ;]");
		for (int i = 0; i < arrOfText.length; i++) {
			String a = arrOfText[i];
			if (a.toLowerCase().matches("^(?![a-z]).+")) {
				arrOfText[i] = a.substring(1);
				//System.out.println(arrOfText[i]);
			}
			if (a.toLowerCase().matches(".*[^a-z]$")) {
				arrOfText[i] = a.substring(0, a.length() - 1);
				//System.out.println(arrOfText[i]);
			}
		}
		
		/**
		 * Sorts array into alphabetical order
		 */
		for (int i = 0; i < arrOfText.length - 1; i++) {
			for (int j = 0; j < arrOfText.length - 1; j++) {
				if (arrOfText[j].toLowerCase().compareTo(arrOfText[j+1].toLowerCase()) > 0) {
					String tempString = arrOfText[j];
					arrOfText[j] = arrOfText[j+1];
					arrOfText[j+1] = tempString;
				}
			}
		}
		System.out.println("Alphabetically sorted array of words:");
		for (String a : arrOfText)
            System.out.println("\t" + a);
	}
}
