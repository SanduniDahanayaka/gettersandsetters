public class AccessModifiersDemo {
    private int privateVar;
    double defaultVar;
    protected boolean protectedVar;
    public String publicVar;


    public int getPrivateVar() {
        return privateVar;
    }

    int getDefaultVar() {
        return (int) defaultVar;
    }

    protected boolean getProtectedVar() {
        return protectedVar;
    }

    public String getPublicVar() {
        return publicVar;
    }
}


class SubclassDemo extends AccessModifiersDemo {

    void displayProtectedVar() {
        boolean value = getProtectedVar();
        System.out.println("Protected Variable Value: " + value);
    }
}


class Main {
    public static void main(String[] args) {

        AccessModifiersDemo demoInstance = new AccessModifiersDemo();
        System.out.println("Private Variable Value: " + demoInstance.getPrivateVar());
        System.out.println("Default Variable Value: " + demoInstance.getDefaultVar());
        System.out.println("Protected Variable Value: " + demoInstance.getProtectedVar());
        System.out.println("Public Variable Value: " + demoInstance.getPublicVar());


        SubclassDemo subDemoInstance = new SubclassDemo();
        subDemoInstance.displayProtectedVar();
    }
}
