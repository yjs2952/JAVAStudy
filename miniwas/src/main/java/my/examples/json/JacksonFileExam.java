package my.examples.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonFileExam {
    public static void main(String[] args) throws IOException {
        MiniWasConfiguration miniWasConfiguration = new MiniWasConfiguration();
        miniWasConfiguration.setStaticDir("C:/STUDY/temp");
        miniWasConfiguration.setClassPath(".");

        ObjectMapper objMapper = new ObjectMapper();
        objMapper.writeValue(new File("C:/STUDY/temp/was.json"), miniWasConfiguration);

        // 역직렬화
        MiniWasConfiguration readData =
                objMapper.readValue(new File("C:/STUDY/temp/was.json"), MiniWasConfiguration.class);
        System.out.println(readData.getStaticDir());
        System.out.println(readData.getClassPath());
    }
}
