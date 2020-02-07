package piTest;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {
	void accept(T t);
	default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
}
