package DILooseCoupling;

interface Address {
    public int display();
}

class Ha implements Address {
    @Override
    public int display() {
        System.out.println("Home address");
        return 0;
    }
}

class Oa implements Address {
    @Override
    public int display() {
        System.out.println("Office address");
        return 0;
    }
}

public class StudentLC {
    public StudentLC(Address address) {
        address.display();
    }

    public static void main(String[] args) {
        Address address = new Ha();
        Address address2 = new Oa();
        System.out.println("Pehle");
        StudentLC obj = new StudentLC(address);
        System.out.println("Baad mai");
        StudentLC obj2 = new StudentLC(address2);
    }
}
