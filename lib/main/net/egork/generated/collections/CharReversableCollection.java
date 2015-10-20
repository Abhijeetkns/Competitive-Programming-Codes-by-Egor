package net.egork.generated.collections;

import net.egork.generated.collections.iterator.*;

public interface CharReversableCollection extends CharCollection {
    public CharIterator reverseIterator();

    default public char last() {
        return reverseIterator().value();
    }

    default CharStream reversed() {
        return () -> reverseIterator();
    }
}
