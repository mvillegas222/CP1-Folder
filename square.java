class Square {

    int sideLength;

    Square( int size ) {
        sideLength = size;
    }

    int getArea() {
        return sideLength * sideLength;
    }

    int getPerimeter() {
        return sideLength * 4;
    }

    void drawSquare() {
    }

    public static void main(String[] args) {
        Square mySquare = new Square(4);
        int area = mySquare.getArea();
        int perimeter = mySquare.getPerimeter();
        System.out.println("Area is " + area + " and perimeter is " + perimeter);
        System.out.println("*" + );
        Square mySquare2 = new Square(10);
    }
}