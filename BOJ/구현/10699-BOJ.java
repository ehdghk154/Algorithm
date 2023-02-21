/**
 * 10699 오늘 날짜
 */
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
 public static void main(String[] args) throws IOException {
   Date d = new Date();
   
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
   
   System.out.print(sdf.format(d));
 }
}