import java.util.ArrayList;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        System.out.println("HELLO");
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(44);
        for(Integer x:list) System.out.println(x);
    }
}
