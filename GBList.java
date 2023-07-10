 public interface GBList<T> {
    void addToBeginning(T element);
    void addToEnd(T element);
    int size();
    T get(int index);
} 