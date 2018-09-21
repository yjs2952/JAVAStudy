package my.examples.miniwas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class Request {
    private String method;
    private String path;
    private Map<String, String> headerInfo;

    InputStream in;
    BufferedReader br;

    public Request(InputStream in, BufferedReader br) {
        this.in = in;
        this.br = br;

        try {
            String requestLine = br.readLine();
            String[] splits = requestLine.split(" ");

            if (splits.length > 2) {
                method = splits[0];
                path = splits[1];
            }

            headerInfo = new HashMap<>();

            String headerLine = null;
            int index = 0;
            while ((headerLine = br.readLine()) != null) {
                if (headerLine.equals("")) {
                    break;
                }
                index = headerLine.indexOf(":");
                String key = null;
                String val = null;
                if (index != -1) {
                    key = headerLine.substring(0, index);
                    val = headerLine.substring(index + 1).trim();
                }
                headerInfo.put(key, val);
            }

        } catch (Exception e) {
            //throw new RuntimeException("잘못된 요청");
            e.printStackTrace();
        }
    }

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }

    public Map<String, String> getHeaderInfo() {
        return headerInfo;
    }

    public InputStream getIn() {
        return in;
    }

    public BufferedReader getBr() {
        return br;
    }

    public String getUserAgent(){
        return headerInfo.get("User-Agent");
    }

    public String getCookie(){
        return headerInfo.get("Cookie");
    }

    public String getAccept(){
        return headerInfo.get("Accept");
    }
}
