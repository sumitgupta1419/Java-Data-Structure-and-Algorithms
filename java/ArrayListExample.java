import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(4);
        System.out.println(i);
        
        Float f = Float.valueOf(4.5f);
        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<Integer>();

        // adding new elements

        l1.add(5);
        l1.add(6);
        l1.add(7);
          System.out.println("ArrayList elements: " + l1);

        //   GET AN ELEMENT AT INDEX I.......

        System.out.println(l1.get(1));

        // PRINT WITH FOR LOOP.........

        for (int INDEX = 0; INDEX < l1.size(); INDEX++) {
            System.out.println(l1.get(INDEX));
            
        }

        //  PRINTING THE ARRAYLIST DIRECTLY

        System.out.println(l1);

        //  ADDING ELEMENT AT  SOME INDEX

        l1.add(1,100);
        System.out.println(l1);

        // MODIFING ELEMENT AT INDEX 

        l1.set(0,100 );
        System.out.println(l1);

        //  REMOVING AN ELEMENT AT INDEX I

        l1.remove(1);
        System.out.println(l1);

        // REMOVING AN ELEMENT E

        l1.remove(Integer.valueOf(7));
        System.out.println(l1);
        
        //  CHECKNG IF AN ELEEMNT EXIST

        boolean ans = l1.contains(Integer.valueOf(60));
        System.out.println(ans);

        // IF YOU DONOT SPECIFY CLASS, YOU CAN PUT ANTHING INSIDE  ....!

        ArrayList l= new ArrayList();
        l.add("paris");
        l.add(1);
        l.add(true);
        System.out.println(l);
    
    }
}
