package org.uranus.prototype;

import lombok.Data;

/**
 * @author yanghai
 * @since 2021/4/29-11:41 上午
 */
@Data
public abstract class AbstractShape implements Cloneable {

    public String id;

    public abstract Object copy();

    public abstract String calculate();
}
