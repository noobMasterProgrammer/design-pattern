package com.creational.abstractFactory;

import com.creational.abstractFactory.abstractFactory.AbstractFactory;
import com.creational.abstractFactory.colors.Color;
import com.creational.abstractFactory.shapes.Shape;

public class Client {
    public static void main(String [] args)
    {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        //get the color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();
        Color color2 = colorFactory.getColor("Green");
        color2.fill();
        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }
}
