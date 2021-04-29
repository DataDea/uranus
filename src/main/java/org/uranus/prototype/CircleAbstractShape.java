package org.uranus.prototype;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.nio.charset.Charset;

/**
 * @author yanghai
 * @since 2021/4/29-11:47 上午
 */
@Data
public class CircleAbstractShape extends AbstractShape {

    private Long radio;

    @Override
    public Object copy() {
        try {
            return super.clone();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String calculate() {
        String ret = String.valueOf(Math.PI * 2 * radio);
        return StringUtils.toEncodedString(ret.getBytes(), Charset.defaultCharset());
    }
}
