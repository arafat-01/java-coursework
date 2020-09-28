package wordlocator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.io.File;

public class WordLocator implements WordLocatorInterface {
    private String name;
    private TreeSet <String> paths;
    private TreeSet <String> words;
    private TreeMap <String, TreeMap <String, LinkedList <Location> > > wordOccurance;

    public WordLocator (String nm) throws IOException {
        name = nm;
        paths = new TreeSet <String> ();
        words = new TreeSet <String> ();
        wordOccurance = new TreeMap <String, TreeMap <String, LinkedList <Location> > > ();
        File infile = new File (nm);
        if (infile.isFile()) {
            addWords(infile);
        } else {
            traverse (infile);
        }
    }

    private void addWords (File file) throws IOException {
        paths.add(file.getPath());
        BufferedReader currentReader = new BufferedReader(new FileReader(file));
        int ch, row = 1, col = 0, wordLength = 0;
        String currentWord = "";
        do {
            ch = currentReader.read();
            if ((char)ch == '\n') { col = 0; row ++;}
            else if (WordLocatorInterface.isInWord ((char)ch)){
                col ++;
                wordLength ++;
                currentWord = currentWord + (char)ch;
            } else {
                if (!currentWord.isEmpty()) {
                    currentWord = currentWord.toLowerCase();
                    words.add(currentWord);
                    if (!wordOccurance.containsKey(currentWord))
                        wordOccurance.put(currentWord, new TreeMap<String, LinkedList<Location>>());
                    if (!wordOccurance.get(currentWord).containsKey(file.getPath()))
                        wordOccurance.get(currentWord).put(file.getPath(), new LinkedList<>());
                    wordOccurance.get(currentWord).get(file.getPath()).add(new Location(file.getPath(), row, col - wordLength + 1));
                }
                col ++;
                wordLength = 0;
                currentWord = "";
            }
        } while (ch != -1);
        currentReader.close();
    }

    private void traverse (File currentFile) throws IOException {
        File[] contents = currentFile.listFiles();
        for (File nextFile : contents) {
            if (nextFile.isDirectory())
                traverse (nextFile);
            else
                addWords (nextFile);
        }
    }

    public TreeSet <String> getWords () {
        return words;
    }

    public TreeSet <String> getFilepaths () {
        return paths;
    }

    public int numOccurancesInAllFiles (String word) {
        if (!wordOccurance.containsKey(word)) return 0;
        int result = 0;
        for (String key : wordOccurance.get(word).keySet()) {
            result += wordOccurance.get(word).get(key).size();
        }
        return result;
    }

    public int numOccurancesInFile (String filepath, String word) {
        if (!wordOccurance.containsKey(word)) return 0;
        if (wordOccurance.get(word).containsKey(filepath))
            return wordOccurance.get(word).get(filepath).size();
        return 0;
    }

    public void printOccurancesInAllFiles (String word) {
        if (!wordOccurance.containsKey(word)) return;
        for (String pathKey : wordOccurance.get(word).keySet()) {
            for (Location item : wordOccurance.get(word).get(pathKey)) {
                System.out.println(item);
            }
        }
    }

    public void printOccurancesInFile(String filepath, String word) {
        if (!wordOccurance.containsKey(word)) return;
        if (!wordOccurance.get(word).containsKey(filepath)) return;
        for (Location item : wordOccurance.get(word).get(filepath)) {
            System.out.println(item);
        }
    }
}
