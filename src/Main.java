public class Main {
    public static void main(String[] args) {

        LazyRootUser lazyRootUser = LazyRootUser.getInstance();
        System.out.println(lazyRootUser.toString());

        PublicStaticRootUser staticRootUser = PublicStaticRootUser.getInstance();
        System.out.println(staticRootUser.toString());

        EnumRootUser enumRootUser = EnumRootUser.INSTANCE;
        System.out.println(enumRootUser.toString());


    }
}
