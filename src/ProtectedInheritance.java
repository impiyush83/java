
class ProtectedSuperInheritance {
    protected void createChild(ProtectedSuperInheritance s) {
        System.out.println("Parent");
        // implementation details
    }
}

class ProtectedInheritance extends ProtectedSuperInheritance {
    //    public void createChild(SuperInheritance s) {
//        // implementation details
//    }
    public static  void main (String [] args) {
        ProtectedSuperInheritance s = new ProtectedSuperInheritance();
        ProtectedInheritance c = new ProtectedInheritance();
        // This will fail as private does not delegate in child
        c.createChild(s);
    }
}