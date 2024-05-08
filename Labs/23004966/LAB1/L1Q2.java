import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class L1Q2 {
    public static void main(String[] args) {
        // TODO code application logic here
        int word_num1 =0;
        int word_num2 =0;
        int word_num3 =0;
        int word_num4 =0;

        try{
            Scanner InputStream = new Scanner(new FileInputStream("C:\\Users\\User\\IdeaProjects\\WIA1002_S2_24_occ9\\Labs\\23004966\\LAB1\\text1"));
            while(InputStream.hasNextLine()){
                String line = InputStream.nextLine();
                String[] sen = line.split(",");
                word_num1 += line.split(",").length;
                for(int i=0; i<sen.length;i++){
                    System.out.print(sen[i] + " ");
                }

                System.out.println("");
            }


            System.out.println("word : " + word_num1);
            System.out.println();
        } catch(IOException e){
            System.out.println("Problem with file output");
        }

        try{
            Scanner InputStream = new Scanner(new FileInputStream("C:\\Users\\User\\IdeaProjects\\WIA1002_S2_24_occ9\\Labs\\23004966\\LAB1\\text2"));
            while(InputStream.hasNextLine()){
                String line = InputStream.nextLine();
                String[] sen = line.split(", ");
                word_num2 += line.split(", ").length;
                for(int i=0; i<sen.length;i++){
                    System.out.print(sen[i] + " ");
                }

                System.out.println("");
            }


            System.out.println("word : " + word_num2);
            System.out.println();
        } catch(IOException e){
            System.out.println("Problem with file output");
        }

        try{
            Scanner InputStream = new Scanner(new FileInputStream("C:\\Users\\User\\IdeaProjects\\WIA1002_S2_24_occ9\\Labs\\23004966\\LAB1\\text3"));
            while(InputStream.hasNextLine()){
                String line = InputStream.nextLine();
                String[] sen = line.split("; ");
                word_num3 += line.split("; ").length;
                for(int i=0; i<sen.length;i++){
                    System.out.print(sen[i] + " ");
                }

                System.out.println("");
            }


            System.out.println("word : " + word_num3);
            System.out.println();
        } catch(IOException e){
            System.out.println("Problem with file output");
        }

        try{
            Scanner InputStream = new Scanner(new FileInputStream("C:\\Users\\User\\IdeaProjects\\WIA1002_S2_24_occ9\\Labs\\23004966\\LAB1\\text4"));
            while(InputStream.hasNextLine()){
                String line = InputStream.nextLine();
                String[] sen = line.split("\\d+");
                word_num4 += line.split("\\d+").length;
                for(int i=0; i<sen.length;i++){
                    System.out.print(sen[i] + " ");
                }

                System.out.println("");
            }


            System.out.println("word : " + word_num4);
            System.out.println();
        } catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
}
