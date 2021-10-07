import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

interface IFire {}
interface IReport {}

abstract class BaseEvent {
	public String name;
}

class Event extends BaseEvent implements IFire, IReport{
	public String type = "t2";
    //public String toString(){return type;}
}

class Key {
	private String name;
    public Key(String name) {this.name = name;}
    public int hashCode() {return 2;}
}

class Value {
	private String value;
    public Value(String value) {this.value = value;}
    public Boolean equals(Value other) {
    return true;}
    public int hashCode(){return 0;}
    public String toString() {return value;}
}

public class Main {
	
    
    
    private static void processEventCleanType(Event event) {
    	System.out.println(event);
        System.out.println(event.type);
    	event.type = "";
        event = new Event();
        
    }
    
    private static void SetZero(Integer x) {
    	x = new Integer(x);
    }
    
	public static void main(String[] args) {
    	Event e1 = new Event();
        //e1.type = "t1";
        System.out.println(e1);
        System.out.println(e1.type);
        processEventCleanType(e1);
        System.out.println(e1);
        System.out.println(e1.type);
        System.out.println(e1.type.equals(""));
		
        int x = 100000;
        System.out.println(x);
        SetZero(x);
        System.out.println(x);
        
        String before = "Before";
        System.out.println((Object)before);
    	System.out.println(before == before + "test");
        Map<Key, Value> map = new HashMap<Key, Value>();
        Key k1 = new Key("One");
        Key k2 = new Key("Two");
        Key k3 = new Key("Three");
        
        System.out.println(k1.hashCode());
        System.out.println(k2.hashCode());
        System.out.println(k3.hashCode());
        
        
        map.put(k1, new Value("Value 1"));
        map.put(k2, new Value("Value 2"));
        map.put(k3, new Value("Value 3"));
        
        System.out.println(map.get(k1));
        System.out.println(map.get(k2));
        System.out.println(map.get(k3));
        
        Value v1 = new Value("V1");
        Value v2 = new Value("V1");
        System.out.println(v1.equals(v2));
        
  }
}
