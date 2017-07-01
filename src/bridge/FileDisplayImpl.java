package bridge;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by yishengyang on 01/07/2017.
 */
public class FileDisplayImpl extends DisplayImpl {
    private FileInputStream fis;
    private String filename;

    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            System.out.println("Cann't open the file" + filename);
            System.out.print(e.getStackTrace());
        }
    }

    @Override
    public void rawPrint() {
        try {
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.print(e.getStackTrace());
        }
    }

    @Override
    public void rawClose() {
        try {
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
