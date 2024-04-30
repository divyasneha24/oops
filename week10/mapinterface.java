import java.util.HashMap;
import java.util.Map;
public class mapInterface {
public static void main(String[] args) {
Map<String,Integer> obj=new HashMap<String,Integer>();
obj.put("hi", 1);
obj.put("hello", 2);
obj.put("mvgr", 3);
obj.put("oops", 4);
for(Map.Entry<String,Integer> m:obj.entrySet()){
System.out.println(m.getKey()+" = "+m.getValue());
}
}
}
