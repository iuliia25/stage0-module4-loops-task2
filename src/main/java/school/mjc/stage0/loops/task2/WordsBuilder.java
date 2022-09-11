package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String phrase = "";
        int count = 0;
        while (count <= chars.length) {
            phrase += chars[count];
            count ++;
        }
        System.out.println(phrase);
    }
}
