package org.uranus.prototype;

import org.junit.Test;
import org.mars.JsonUtils;

/**
 * @author yanghai
 * @since 2021/4/29-2:23 下午
 */
public class TestProtoType {

    @Test
    public void testProtoClone() {
        CircleAbstractShape circleAbstractShape = new CircleAbstractShape();
        circleAbstractShape.id = "Circle";
        circleAbstractShape.setRadio(3L);
        ProtoTypeManager.getInstance().register(circleAbstractShape);

        SquareAbstractShape squareAbstractShape = new SquareAbstractShape();
        squareAbstractShape.id = "Square";
        squareAbstractShape.setRadio(4L);
        ProtoTypeManager.getInstance().register(squareAbstractShape);

        AbstractShape circleShape = ProtoTypeManager.getInstance().load("Circle");
        CircleAbstractShape copyCircleAbstractShape = (CircleAbstractShape) circleShape.copy();
        System.out.println(JsonUtils.Companion.toJson(copyCircleAbstractShape));
        System.out.println(copyCircleAbstractShape.calculate());

        AbstractShape squareShape = ProtoTypeManager.getInstance().load("Square");
        SquareAbstractShape copySquareAbstractShape = (SquareAbstractShape) squareShape.copy();
        System.out.println(JsonUtils.Companion.toJson(copySquareAbstractShape));
        System.out.println(copySquareAbstractShape.calculate());
    }
}
