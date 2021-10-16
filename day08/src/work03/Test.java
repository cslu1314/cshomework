package work03;

public class Test {
    public static void main(String[] args) {
        Person p = ScannerTools.getPersonInstanceByScanner();
        p.print();
        System.out.println("-----------------------");
        Person[] personArrByScanner = ScannerTools.getPersonArrByScanner(5);
        for (Person person : personArrByScanner) {
            person.print();
        }
    }
}
