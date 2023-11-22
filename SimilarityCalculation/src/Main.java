import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            // Replace "absolute/path/to/file1.txt" and "absolute/path/to/file2.txt" with the actual paths of your text files

            WordProcessor wordProcessor1 = new WordProcessor();
            String filePath1 = "resourses/file1.txt";
            wordProcessor1.readFile(filePath1);

            WordProcessor wordProcessor2 = new WordProcessor();
            String filePath2 = "resourses/file2.txt";
            wordProcessor2.readFile(filePath2);

            Set<String> distinctWords1 = wordProcessor1.getDistinctWords();
            Set<String> distinctWords2 = wordProcessor2.getDistinctWords();

            SimilarityCalculator similarityCalculator = new SimilarityCalculator();
            double jaccardSimilarity = similarityCalculator.calculateSimilarityWithDistinctWords(distinctWords1, distinctWords2);

            System.out.println("Jaccard Similarity: " + jaccardSimilarity);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
