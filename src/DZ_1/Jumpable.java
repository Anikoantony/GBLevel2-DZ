package DZ_1;
//@FunctionalInterface
public interface Jumpable {
    default void jump()
    {
        System.out.println("Прыгает");
    };
}
