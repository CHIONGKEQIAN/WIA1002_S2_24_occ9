import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadMyLetter_23004966 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter date: ");
    String date = sc.nextLine();
        System.out.print("Enter sentences: ");
    String sen = sc.nextLine();


        try{
        Scanner inputStream = new Scanner(new FileInputStream("C:\\Users\\User\\IdeaProjects\\WIA1002_S2_24_occ9\\Labs\\23004966\\LAB1\\CHIONGKEQIAN_23004966.txt"));
        while(inputStream.hasNextLine()){
            String sentence = inputStream.nextLine();
            System.out.println(sentence);
            //  System.out.println();
        }


        inputStream.close();
    } catch(IOException e){
        System.out.println("Problem with the file output");
    }

        try{
        PrintWriter outputStream = new PrintWriter(new FileOutputStream("C:\\Users\\User\\IdeaProjects\\WIA1002_S2_24_occ9\\Labs\\23004966\\LAB1\\CHIONGKEQIAN_23004966.txt", true));
        //  String sen = sc.nextLine();
        System.out.println(date);
        System.out.println();
        System.out.println(sen);
//            System.out.println("I have performed well in the class.");
//            System.out.println("I am very happy with my own performance.");
//            System.out.println("I learn how to become an abnormal person.");
//            System.out.println("No, i just aim to pass my DS.");
//            System.out.println("I study hard during this course.");
//            System.out.println("Study hard and hard.");
// It's me again. Finally, it's the end of the term and the DS class has finished! I think I have performed well in the class.I am very happy with my own performance. I learn how to become an abnormal person. I just aim to pass my DS. I study hard during this course. Study hard and hard.
    }catch(IOException e){
        System.out.println("Problem with file output");
    }
}
}
