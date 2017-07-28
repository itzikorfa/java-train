import java.beans.Visibility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class tail4DataCollection {
public static void main(String[] args) {
	
//	arraylist();
//	hashmap();
	graph();
}

private static  void displayGraph(HashMap<String, ArrayList<String>> gr){
	for (String name : gr.keySet()){
		System.out.printf("%s: -> ",name);
		ArrayList<String> nodes =gr.get(name);
		for (String node: nodes){
			System.out.printf("%s -> ",node);
		}
		System.out.println();
	}
}

private static  int are_connected(HashMap<String, ArrayList<String>> gr, 
						String src, String dst){
	if (!gr.containsKey(src)){
		return 0;
	}
	int count = 0;
	ArrayList<String> visted = new ArrayList<String>();
	ArrayList<String> frontier = gr.get(src);
	while (!frontier.isEmpty())
	for (String name: frontier){
		if (name == dst){
			return count;
		}
		else{
			visted.add(name);
		}
		if (!visted.contains(name) && !frontier.contains(name))
			frontier.add(name);
	}
	
	return count;
}


private static void graph() {
	HashMap<String, ArrayList<String>> graph = new 
			HashMap<String, ArrayList<String>>();
	ArrayList itzik  = new ArrayList<String>();
	itzik.add("yosi1");
	itzik.add("yosi2");
	itzik.add("yosi3");
	itzik.add("yosi4");
	graph.put("itzik", itzik);
	ArrayList yosi1  = new ArrayList<String>();
	yosi1.add("yosi2");
	yosi1.add("itzik");
	yosi1.add("ronen");
	graph.put("yosi1", yosi1);
	ArrayList ronen  = new ArrayList<String>();
	ronen.add("yosi1");
	
	graph.put("ronen", ronen);
	
	displayGraph(graph);
	System.out.println(friends(graph, "itzik", "ronen"));
}

public static int friends(HashMap<String, ArrayList<String>> graph,
		String src, String dst){
	int res = 0;
	//if src dst dst-==src in graph
	if (!graph.containsKey(src) || !graph.containsKey(dst)
			|| src == dst){
		return 0;
	}	
	ArrayList<String> visited = new ArrayList<String>();
	ArrayList<String> nodes = graph.get(src);
	while (!nodes.isEmpty()){
		res++;
		if (nodes.contains(dst)){
			return res;
		}
		for (String node : nodes){
			if (visited.contains(node))
				continue;
			String tmp = node;
			nodes.remove(node);
			visited.add(node);
			if (graph.containsKey(node)){
				if(graph.get(node).contains(dst)){
					return ++res;
				}
			}
			
		}
	}
	//get all nodes from src
	//for every node get all nodes 
	
	return res;
}



private static void hashmap() {
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	hm.put("itzik", 106);
	hm.put("alex", 29);
	hm.put("itzik1", 89);
	hm.put("old tenzer", 189);
	
	System.out.println(hm.get("alex"));
	Set<String> keys = hm.keySet();
	Collection<Integer> vals = hm.values();
	for(String key : keys){
		System.out.println(key+":"+hm.get(key));
	}
	
	for (String key : hm.keySet()){
		if (hm.get(key) > 100)
			System.out.println(key);
	}
	
}

private static void arraylist() {
	ArrayList<String> al = new ArrayList<String>();
	ArrayList<Integer> al1 = new ArrayList<Integer>();
	al.add("itzik1");
	al.add("itzik2");
	al.add("itzik3");
	al.add("itzik4");
	
	System.out.println(al.size());
	al.remove(0);
	System.out.println(al.size());
	for (int i = 0; i < al.size(); i++) {
		System.out.println(al.get(i));
	}
	
	Integer num= new Integer(3);
	Integer num1= 115;
	System.out.println(num1 - num);
	int x = num1;
	System.out.println(x - num);
	
	String stam = new String("bla bla");
	
	al1.add(num);
	
	
}


}
