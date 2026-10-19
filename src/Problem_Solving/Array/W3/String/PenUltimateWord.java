package Problem_Solving.Array.W3.String;

/**
 * Find the penultimate word of a sentence
 */
public class PenUltimateWord {
    public static void main(String[] args) {
        String word = "I am a Java Developer";
        String[] penUltimate = word.split("[ ]+");
        System.out.println(penUltimate[penUltimate.length - 2]);
    }
}
