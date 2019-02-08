package lambdasinaction.chap3;

import java.io.*;
public class ExecuteAround {

	public static void main(String ...args) throws IOException{

        // method we want to refactor to make more flexible
        String result = processFileLimited();
        System.out.println(result);

        System.out.println("---");

		String oneLine = processFile(BufferedReader::readLine);
		System.out.println(oneLine);

		String twoLines = processFile((BufferedReader b) -> b.readLine() + b.readLine());
		System.out.println(twoLines);
	}

    private static String processFileLimited() throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(new File("lambdasinaction/chap5/data.txt")))) {
            return br.readLine();
        }
    }

	private static String processFile(BufferedReaderProcessor p) throws IOException {
		try(BufferedReader br = new BufferedReader(new FileReader("lambdasinaction/chap5/data.txt"))){
			return p.process(br);
		}
	}

	public interface BufferedReaderProcessor{
		String process(BufferedReader b) throws IOException;
	}
}
