package Week6;

public interface ExampleIO {
    public abstract void coolFunction();
    public abstract int getValue(double x);
    public default boolean canDrink(){
        return false;
    }
}
