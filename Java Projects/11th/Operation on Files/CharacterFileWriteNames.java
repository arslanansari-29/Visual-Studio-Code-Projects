import java.io.*;

public class CharacterFileWriteNames {
    public static void main(String[] args)throws IOException {
        FileWriter fw = new FileWriter("Character Names.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println("Arslan Ansari");
        pw.println("Punnah Sri");
        pw.println("AMT ACE");
        pw.close();
    }
}