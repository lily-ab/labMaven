package lab3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamXML implements IInputStream {
    private InputStream fStream;
    private String path;

    public void setPath(String path){
        this.path=path;
    }

    public InputStream getInputStream() {
        return fStream;
    }

    public void read(){
            try {
                fStream = new FileInputStream(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
