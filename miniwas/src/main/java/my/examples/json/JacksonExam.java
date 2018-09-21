package my.examples.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonExam {
    public static void main(String[] args) throws Exception {
        MiniWasConfiguration miniWasConfiguration = new MiniWasConfiguration();
        miniWasConfiguration.setStaticDir("C:/STUDY/temp");
        miniWasConfiguration.setClassPath(".");
        // 객체를 json 메시지로 변환 (직렬화 한다.)
        ObjectMapper objMapper = new ObjectMapper();
        String jsonConfiguration = objMapper.writeValueAsString(miniWasConfiguration);
        System.out.println(jsonConfiguration);

        //  역직렬화
        String jsonData = "{\"staticDir\":\"C:/STUDY/temp\",\"classPath\":\".\"}";
        MiniWasConfiguration readObj = objMapper.readValue(jsonData, MiniWasConfiguration.class);

        System.out.println(readObj.getStaticDir());
        System.out.println(readObj.getClassPath());
    }
}
