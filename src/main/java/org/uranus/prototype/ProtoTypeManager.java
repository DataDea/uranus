package org.uranus.prototype;

/**
 * @author yanghai
 * @since 2021/4/29-11:59 上午
 */
public class ProtoTypeManager {

    private ProtoTypeManager() {

    }
    private static ProtoTypeManager INSTANCE = new ProtoTypeManager();

    public ProtoTypeManager getInstance() {
        return INSTANCE;
    }
}
