import java.io.*;

public class BinaryFileReadNames {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = new FileInputStream("Binary Names.dat");
        DataInputStream dis = new DataInputStream(fis);
        boolean eof = false;
        while(!eof) {
            try {
                String name = dis.readUTF();
                int date = dis.readInt();
                System.out.println("Name: "+name+"\nDate: "+date);
            } catch(EOFException e) {
                eof = true;
            }
        }
        dis.close();
    }
}
