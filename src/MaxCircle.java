import java.util.HashMap;
import java.util.Map;

public class MaxCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] queries1 = {{1000000000,23},{11,3778},{7,47},{11,1000000000}};
		int[][] queries = {{1,2},{3,4},{1,3},{5,7},{5,6},{7,4}};
		int maxcircle[] =  maxCircle(queries1);
  for(int i=0;i<maxcircle.length;i++)
  {
	  System.out.println(maxcircle[i]);
  }
	}
	     //Creating is a data structure which supports 3 function - makeset,union and findset
		 public static class DisjointSet {
			    private static Map<Integer,Node> map = new HashMap<>();
			    private static int max = 0; 
			    static class Node {
			      long data; 
			      Node parent;
			      int rank;
			    }
			    //create a set for each element 
			    public static void makeSet(int data) {
			      Node node = new Node();
			      node.data = data;
			      node.parent = node;
			      node.rank = 1;
			      map.put(data, node);//using map key as the data helps in removing duplicate set created for the same element
			    }
			    //merges 2 set into one set and alter the ran and the parent accordingly.boolean returned is not used
			    public static boolean union(int data1, int data2) {
			        Node node1 = map.get(data1);
			        Node node2 = map.get(data2);
			        Node parent1 = findSet(node1);
			        Node parent2 = findSet(node2);
			        if (parent1.data == parent2.data) { // This condition should not be executed as we use map.
			            return false;
			        }
			        if (parent1.rank >= parent2.rank) {
			            parent1.rank = parent1.rank + parent2.rank; //sum the rank
			            parent2.parent = parent1;
			            max = Math.max(max,parent1.rank);
			        } else {
			            parent2.rank = parent2.rank+parent1.rank;
			            parent1.parent = parent2;
			            max = Math.max(max,parent2.rank); 
			        }
			        return true;
			    }
			    //finds the parent of the node
			    private static Node findSet(Node node) {
			        Node parent = node.parent;
			        if (parent == node) { //if the parent is node itself
			            return parent;
			        }
			        node.parent = findSet(node.parent); // returns the parent node by recursive call
			        return node.parent;
			    }
			    
			}

			    static int[] maxCircle(int[][] queries) {
			      DisjointSet ds = new DisjointSet();// create a instance of disjointset
			      int[] arr = new int[queries.length]; //creating a return array
			      for(int[] a : queries) {//creates a node for each element
			        MaxCircle.DisjointSet.makeSet(a[0]);
			        MaxCircle.DisjointSet.makeSet(a[1]); 
			      }

			      int i = 0;
			      for(int[] a : queries) {
			        MaxCircle.DisjointSet.union(a[0], a[1]); 
			        arr[i] = MaxCircle.DisjointSet.max; // max id the class variable and it is assigned in union method
			        i++;
			      }
			      return arr;
			    }
}
