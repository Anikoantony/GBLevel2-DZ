package DZ_1_Interface;
//@FunctionalInterface
public interface Jumpable {
    default void jump()
    {
        System.out.println("Прыгает");
    };
}
