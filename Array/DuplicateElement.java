import java.util.stream.*;
import java.util.*;

class DuplicateElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.asList(10, 28, 87, 10, 10, 10, 10, 40, 40, 40);

        Set<Integer> set = new HashSet<>();
        System.out.println("The Duplicate Elements are :");
        list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));
        sc.close();
    }
}