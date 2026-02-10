import java.io.*;

public class BinaryFileWriteNames {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos = new FileOutputStream("Binary Names.dat");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Anshika Singh");
        dos.writeInt(20);
        dos.close();
    }
}
