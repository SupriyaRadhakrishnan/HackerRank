import java.util.*;

public class GradingStudents {



public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    
      List<Integer> roundedgrades = new ArrayList<>();
      
      for(Integer grade:grades)
      {
          if(grade < 38)
          roundedgrades.add(grade);
          else if((grade+1) % 5 == 0)
           roundedgrades.add(grade+1);
          else if((grade+2) % 5 ==0)
           roundedgrades.add(grade+2);
          else
             roundedgrades.add(grade);
      } 
     return roundedgrades;
    }
}