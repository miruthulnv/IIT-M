import java.util.*;
public class AQ4_6{
     public static void main(String[] args){
            var num=new ArrayList<Integer>();
            for(int i=10;i>0;i--){
                num.add(i);
            }
            num.stream().filter(i -> i % 2 == 0).skip(2).forEach(System.out::println);
      }
}