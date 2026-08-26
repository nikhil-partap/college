import java.util.ArrayList;
import java.util.ListIterator;

public interface ListTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        ListIterator<Integer> itr = al.listIterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.previous());
        System.out.println(itr.previous());
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        while(itr.hasPrevious()){
            System.out.println(itr.next());
        }

    }
}