package net.egork.generated.collections.queue;

import net.egork.generated.collections.*;

public interface LongQueue extends LongCollection {
    default public long peek() {
        return first();
    }

    public long poll();
}
