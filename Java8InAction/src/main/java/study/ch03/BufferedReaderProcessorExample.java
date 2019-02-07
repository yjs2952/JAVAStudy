package study.ch03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderProcessorExample {

    private static String processorFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("../resources/lambdasinaction/chap5/data.txt"))){
            return p.process(br);
        }
    }

    public static void main(String[] args) throws IOException {
        String oneLine = processorFile(BufferedReader::readLine);
        String twoLines = processorFile(br -> br.readLine() + br.readLine());

        System.out.println(oneLine);
    }
}
