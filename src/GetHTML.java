import org.jsoup.Jsoup;
import java.io.*;

public class GetHTML {

    public GetHTML(String link, String tag) {
        File file = new File("result.txt");

        try {
            var document = Jsoup.connect(link).get();
            var textElements = document.select(tag);

            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);

            for(var element: textElements){
                pw.println(element.text());
            }
            pw.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

//    public void fileCreate() {
//
//        File file = new File("result.txt");
//        try {
//            FileWriter fw = new FileWriter(file);
//            PrintWriter pw = new PrintWriter(fw);
//
//            pw.println("Line 1");
//            pw.println("Line 2");
//
//            pw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }


}
