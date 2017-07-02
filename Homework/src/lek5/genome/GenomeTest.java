package lek5.genome;





public class GenomeTest {


	public static void main(String[] args) {
		

		
		
		int[] wordSizes = {2, 4, 6, 8, 9, 10, 12, 50};
		int[] stringSizes = {100, 1000, 20_000, 500_000, 1_000_000};
		
		long time = System.nanoTime();
		long timeDiff;
		
		for (int wordSize : wordSizes) {
			for (int stringSize : stringSizes) {
				byte[] data = DataGenerator.generate(stringSize);
				System.out.println("++++ Testing with: wordSize = " + wordSize + " stringSize == " + stringSize + " +++");
				System.out.println("Genome         result :" + Genome.findDuplicates(data, wordSize) + " in:" + (System.nanoTime() - time));
				time = System.nanoTime();
				System.out.println("GenomeWithSort result :" + GenomeWithSort.findDuplicates(data, wordSize) + " in:" + (System.nanoTime() - time));
				time = System.nanoTime();
				System.out.println("GenomeWithHash result :" + GenomeWithHash.findDuplicates(data, wordSize) + " in:" + (System.nanoTime() - time));
			}
		}
	}
}
