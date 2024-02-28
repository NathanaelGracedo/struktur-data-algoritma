

public class dragon {
    int x, y, width, height;

    public dragon() {}

    public dragon(int x1, int y1, int w, int h) {
        x = x1;
        y = y1;
        width = w;
        height = h;
    }

    void moveLeft() {
        if(x>0) {
            x = x-1;
        } 
        printPosition();
        detectCollision();
    }

    void moveRight() {
        if(x<width) {
            x = x+1;
        }
        printPosition();
        detectCollision();
    }

    void moveUp() {
        if(y>0) {
            y = y-1;
        }
        printPosition();
        detectCollision();
    }

    void moveDown() {
        if(y<height) {
            y = y+1;
        }
        printPosition();
        detectCollision();
    }

    void printPosition() {
        System.out.printf("(%d, %d)\n", x,y);
    }

    void detectCollision() {
        if(x <= 0 || y<=0 || x>=width || y>=height);
        System.out.println("GAME OVER");
    }

    public static void main(String[] args) {
        dragon d = new dragon(9, 10, 25, 20);
        d.printPosition();
        d.moveLeft();d.moveUp();d.moveLeft();
    }
}
