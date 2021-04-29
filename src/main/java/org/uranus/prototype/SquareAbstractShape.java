package org.uranus.prototype;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.nio.charset.Charset;

/**
 * @author yanghai
 * @since 2021/4/29-11:55 上午
 */
@Data
public class SquareAbstractShape extends AbstractShape {

    private Long radio;

    @Override
    public Object copy() {
        return null;
    }

    @Override
    public String calculate() {
        String ret = String.valueOf(4 * radio);
        return StringUtils.toEncodedString(ret.getBytes(), Charset.defaultCharset());
    }
}
