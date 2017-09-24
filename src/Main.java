import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;

public class Main {

    public static void main(String[] args) {

        // Anonymous Class
        Runnable anonRun = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class run");
            }
        };

        anonRun.run();

        // Anonymous lambda function
        Runnable lambdaRun = (() -> {
            System.out.println("Lambda run");
        });

        lambdaRun.run();


        // Comparators
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("123 Main St.", "Austin", "TX", "78787"));
        addresses.add(new Address("43 High St.", "Columbus", "OH", "43034"));
        addresses.add(new Address("678 Leon Rd.", "Tallahassee", "FL", "32307"));
        addresses.add(new Address("8 Deep Sea Way", "Boca Raton", "FL", "33433"));

        //Feel free to add in more addresses if you would like

        System.out.println("Before sorting");
        System.out.println(addresses);

        // !! - Write an anonymous class to sort by state (alphabetically)
        Collections.sort(addresses, new Comparator<Address>() {
            @Override
            public int compare(Address o1, Address o2) {
                String o1State = o1.getState();
                String o2State = o2.getState();
                int compare = o1State.compareTo(o2State);
                return compare;
            }
        });

        System.out.println("\nAfter sorting by state");
        System.out.println(addresses);

        // !! - Write a lambda to sort by city alphabetically
        Collections.sort(addresses, (Address a1, Address a2) ->
                a1.getCity().compareTo(a2.getCity())
        );

        System.out.println("\nAfter sorting by city");
        System.out.println(addresses);
    }
}
