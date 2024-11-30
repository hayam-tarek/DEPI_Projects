/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintBrush;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 *
 * @author hayam tarek
 */
class Line extends Shape {

    public Line(Color color, Point startPoint, boolean isSolid, boolean isDotted) {
        super(color, startPoint, isSolid, isDotted);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        if (isSolid) {
            g.setStroke(new BasicStroke(5));
        } else {
            g.setStroke(new BasicStroke(1));
        }
        if (isDotted) {
            float[] dashPattern = {10, 10};
            g.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, dashPattern, 0));
        }
        if (endPoint != null) {
            g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
        }
    }
}
