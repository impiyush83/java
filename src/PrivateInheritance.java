class PrivateSuperInheritance {
    private void createChild(PrivateSuperInheritance s) {
        System.out.println("Parent");
        // implementation details
    }
}

class PrivateInheritance extends PrivateSuperInheritance {
//    public void createChild(SuperInheritance s) {
//        // implementation details
//    }
    public static  void main (String [] args) {
        PrivateSuperInheritance s = new PrivateSuperInheritance();
        PrivateInheritance c = new PrivateInheritance();
        // This will fail as private does not delegate in child
//        c.createChild(s);
    }
}