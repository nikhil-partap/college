import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Iterator_removal {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();    
        Collections.addAll(list , 10 , 15, 20, 25, 30, 35);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            int x = it.next();
            if( x%2 != 0){
                it.remove();
            }
        }
        System.out.println(list);
    }
}