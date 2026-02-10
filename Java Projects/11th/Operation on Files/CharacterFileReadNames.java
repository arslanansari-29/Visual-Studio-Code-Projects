import java.io.*;

public class CharacterFileReadNames {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("Character Nnames.txt");
        BufferedReader br = new BufferedReader(fr);
        String name ;
        while((name = br.readLine()) != null) {
            System.out.println(name);
        }
        br.close();
    }
}
