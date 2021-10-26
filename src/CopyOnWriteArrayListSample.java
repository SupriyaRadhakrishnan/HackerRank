import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListSample {

	public static void main(String[] args) {

List<String> list = new CopyOnWriteArrayList<String>();
list.add("1");
list.add("2");

  for(String s : list)
  {
	  System.out.println(s);
	  list.add("3");
  }
  
  System.out.println(list);

	}

}
