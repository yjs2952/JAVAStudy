package java3rd.ch16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/sec02/stream_kind/linedata.txt");
        Stream<String> stream;

        // Files.lines() 메소드
        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);
        System.out.println();

        // BufferedReader의 lines() 메소드
        File file = path.toFile();
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        stream = br.lines();
        stream.forEach(System.out::println);
    }
}
