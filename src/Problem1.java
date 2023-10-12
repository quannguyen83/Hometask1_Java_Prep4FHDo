
public class Problem1 {
	public static void main (String[] args) {
		double sunDiameter = 865000;
		double earthDiameter = 7600;
		
		double sunRadius = sunDiameter/2;
		double earthRadius = earthDiameter/2;
		
		//Calculate volume
		double sunVolume = 4*Math.pow(sunRadius, 3)/3;
		double earthVolume = 4*Math.pow(earthRadius, 3)/3;
		
		System.out.println("The volume of the Sun: " + sunVolume + " miles");
		System.out.println("The volume of the Earth: " + earthVolume + " miles");
		System.out.println("The ratio of the volumn of the Sun to the volumn of the Earth: "
				+ sunVolume/earthVolume);
	}
}
