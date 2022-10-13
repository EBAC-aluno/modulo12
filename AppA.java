import java.util.ArrayList;
import java.util.Collections;

public class AppA {
  public static void main(String args[]) {

    String input = "";
    for (int i = 0; i < args.length; i++) {
      input += " " + args[i];
    }
    
    ArrayList<String> list = new ArrayList<String>();
    String parts[] = input.split(",");
      for(int i = 0; i < parts.length; i++){
      list.add(parts[i].replaceFirst("^\\s+", ""));
    }

    Collections.sort(list);   

    for (String s: list){
      System.out.println(s);
    }

  }
}
