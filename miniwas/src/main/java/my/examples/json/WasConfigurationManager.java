package my.examples.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class WasConfigurationManager {
    private ObjectMapper objectMapper;

    // 2. 자신을 참조하는 private static 변수를 선언한다.
    //  static한 변수는 딱 한번 초기화되고, 메모리에 딱 한번만 올라간다.
    private static WasConfigurationManager instance = new WasConfigurationManager();

    // 1. private 생성자를 만든다.
    private WasConfigurationManager(){
        objectMapper = new ObjectMapper();
    }

    // 3. instance를 리턴하는 public static한 메소드를 만든다.
    public static WasConfigurationManager getInstance(){
        return instance;
    }

    public void saveMiniWasConfiguration(MiniWasConfiguration miniWasConfiguration, String fileName) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(fileName), miniWasConfiguration);
        } catch (Exception e) {
            throw new RuntimeException("파일 저장이 안 됩니다!!!!");
        }
    }

    public MiniWasConfiguration getMiniWasConfiguration(String fileName) {
        try {
            MiniWasConfiguration readObj = objectMapper.readValue(new File(fileName), MiniWasConfiguration.class);
            return readObj;
        } catch (Exception e) {
            return null;
        }
    }
}
