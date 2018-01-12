import java.util.ArrayList;
import java.util.Arrays;
public class emperorsNewGrove{
    public static void main(String []args){
    	String name1="";
    	int name2;
    	int name3;
        ArrayList<String> emperorCast=new ArrayList<String>();
        emperorCast.addAll(Arrays.asList("Kuzco", "Pacha", "Yzma", "Kronk"));
        name1=emperorCast.get(1);
        emperorCast.remove(1);
        emperorCast.add(name1);
        name2=emperorCast.indexOf("Yzma");
        emperorCast.add(name2+1,"Chaca");
        emperorCast.add(name2+2, "Tipo");
        name3=emperorCast.indexOf("Kronk");
        emperorCast.add(name3+1,"Bucky");
        System.out.print(emperorCast);
    }
}   