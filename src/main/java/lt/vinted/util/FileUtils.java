package lt.vinted.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Robertas
 */
public class FileUtils {

    public static final String INPUT_FILE_PATH = "/src/resource/input.txt";
    public static final String USER_DIR = "user.dir";

    public List<String> getInputFileContent() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(System.getProperty(USER_DIR));
        stringBuilder.append(INPUT_FILE_PATH);

        List<String> inputLines = new LinkedList<>();

        try (
                Stream<String> stream = Files.lines(Paths.get(stringBuilder.toString()))
        ) {

            stream.forEach(s -> inputLines.add(s));

        } catch (IOException e) {

            e.printStackTrace();

        }

        return inputLines;

    }

}
