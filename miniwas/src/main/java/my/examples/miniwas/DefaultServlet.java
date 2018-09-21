package my.examples.miniwas;

import my.examples.json.MiniWasConfiguration;
import my.examples.json.WasConfigurationManager;

import java.io.*;

public class DefaultServlet {

    private Request request;
    private Response response;

    public void service(Request request, Response response) {
        String webpath = request.getPath();
        if ("/".equals(webpath)) {
            webpath = webpath + "index.html";
        }

        WasConfigurationManager wcm = WasConfigurationManager.getInstance();
        MiniWasConfiguration mwc = wcm.getMiniWasConfiguration("C:/STUDY/temp/was.json");

        String path = mwc.getStaticDir() + webpath;
        File file = new File(path);

        OutputStream out = response.getOut();
        PrintWriter pw = response.getPw();

        FileInputStream fis = null;

        if (file.exists()) {
            pw.println("HTTP/1.1 200 OK");
            pw.println("Content-Type: text/html; charset=UTF-8");
            pw.println("Content-Length: " + file.length());
            pw.println("");
            pw.flush();

            try {

                fis = new FileInputStream(file);
                int dataCount = 0;
                byte[] buffer = new byte[1024];

                while ((dataCount = fis.read(buffer)) != -1) {
                    out.write(buffer);
                    out.flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try { fis.close(); } catch (IOException e) { }
            }

        } else {
            pw.println("HTTP/1.1 404 NOT FOUND");
            pw.println("Content-Type: text/html; charset=UTF-8");
            pw.println("");
            pw.flush();
        }
    }
}
