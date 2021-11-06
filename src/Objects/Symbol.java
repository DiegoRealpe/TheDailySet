package Objects;

public class Symbol {
    enum Color {
        GREEN,
        BLUE,
        RED
    }
    
    enum Shape {
        SQUIGGLE,
        OVAL,
        DIAMOND
    }

    enum Fill {
        SOLID,
        STRIPPED,
        EMPTY
    }

    private Color color;
    private Shape shape;
    private Fill fill;

    public Symbol(Color givenColor, Shape givenShape, Fill givenFill) {
        color = givenColor;
        shape = givenShape;
        fill = givenFill;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            return true;
        }
        return super.equals(obj);
    }

    public Color getColor() {
        return color;
    }

    public Shape getShape() {
        return shape;
    }

    public Fill getFill() {
        return fill;
    }
}
