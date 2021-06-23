import java.io.*;
public class SHIYAN5_2 {
    public static void main(String[] args) {
        FileReader f;
        try{
             f= new FileReader("test.txt");
             int num =0;

             char b;


            while((num=f.read())!=-1){

            b=(char)num;

            System.out.printf("%c",num);


       }
            f.close();

        }
catch(FileNotFoundException e){
            System.out.println("not found file!");

        }catch(Exception e){

        }
    }
}

