import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEmployee e1 = new TestEmployee("IT",2000);
		TestEmployee e2 = new TestEmployee("CSC",8000);
		TestEmployee e3 = new TestEmployee("IT",6000);
		TestEmployee e4 = new TestEmployee("CSC",7000);
		TestEmployee e5 = new TestEmployee("CSC",6000);
		TestEmployee e6 = new TestEmployee("IT",9000);
		TestEmployee e7 = new TestEmployee("IT",4000);
		
		
		List<TestEmployee> te = new ArrayList<TestEmployee>();
		
		te.add(e1);
		te.add(e2);
		te.add(e3);
		te.add(e4);
		te.add(e5);
		te.add(e6);
		te.add(e7);
		
		
		Map<String,List<TestEmployee>> map = te.stream().collect(Collectors.groupingBy(TestEmployee::getDept));
		
		Set<String> keySet =  map.keySet();
		
		System.out.println(keySet);
		
		for(String keyValue : keySet)
		{
			List<TestEmployee> empList = map.get(keyValue);			
			TestEmployee max  = empList.stream().max(Comparator.comparing(TestEmployee::getSalary)).get();
			System.out.println(max);
			
			
		}
	
		//System.out.println(map);
	}

}
