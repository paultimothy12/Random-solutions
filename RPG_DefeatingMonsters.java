import java.util.HashMap;
import java.util.Map;
public class codeQ1 {
public static void main(String[] args) {
    int pexp=100;
    int op=0;
    int mex[]={101,100,304,500,78,89};
    int bp[]={100,1,524,45,101,45};
    HashMap<Integer,Integer> hm= new HashMap<>();
    for(int i=0;i<mex.length;i++){
        hm.put(mex[i],bp[i]);
    }
    for(Map.Entry<Integer,Integer> e : hm.entrySet()){
        if(e.getKey()<=pexp) {
            pexp=pexp+e.getValue();
            op++;
            System.out.println("cur exp after defeating monster "+op+" whose exp "+e.getKey()+" is "+pexp);
        }
        

    }
    System.out.println("number of monsters defeated "+op);
}
}
