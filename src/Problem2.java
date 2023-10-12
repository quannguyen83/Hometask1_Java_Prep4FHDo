
public class Problem2 {
	public static void main (String[] args) {
		int nValues = 50;
		process: for(int i = 2; i <= nValues; i++)
		{
			int squareValue = (int) Math.sqrt(i);
			for (int j = 2; j <= squareValue; j++) {
				if (i % j == 0){
					continue process;
				}
			}
			System.out.println(i);
		}
	}
}
