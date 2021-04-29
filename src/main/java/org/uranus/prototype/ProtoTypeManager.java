package org.uranus.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yanghai
 * @since 2021/4/29-11:59 上午
 */
public class ProtoTypeManager {

    private ProtoTypeManager() {
    }

    private static ProtoTypeManager INSTANCE = new ProtoTypeManager();

    public static ProtoTypeManager getInstance() {
        return INSTANCE;
    }

    private static Map<String, AbstractShape> protoTypeBuffer = new HashMap<>();

    private static ReentrantLock lock = new ReentrantLock();

    public void register(AbstractShape abstractShape) {
        lock.lock();
        try {
            protoTypeBuffer.put(abstractShape.getId(), abstractShape);
        } finally {
            lock.unlock();
        }
    }

    public AbstractShape load(String key) {
        return protoTypeBuffer.getOrDefault(key, null);
    }
}