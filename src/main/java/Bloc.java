public interface Bloc {
    Status getStatus();
    boolean test();
    Type getType();
}
