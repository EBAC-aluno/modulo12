import java.util.ArrayList;

public class AppB {
  public static void main(String args[]) {

    for (int i = 0; i < args.length; i++) {
      args[i] = args[i].replace(",", "");
    }

    ArrayList<String> boys = new ArrayList<String>();
    ArrayList<String> girls = new ArrayList<String>();

    for (int i = 0; i < args.length; i++) {
      String[] content = args[i].split("-");
      char sex = content[1].charAt(0);
      String name = content[0];

      if(sex == 'F'){
        girls.add(name);
      }else{
        boys.add(name);
      }
    }

    System.out.println("--- girls ---");
    for(String s: girls){
      System.out.println(s);
    }

    System.out.println(" ");

    System.out.println("--- boys ---");
    for(String s: boys){
      System.out.println(s);
    }

  }
}
