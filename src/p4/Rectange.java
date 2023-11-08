package p4;

public class Rectange extends Figure{ // наследуемый класс это, далее он запросил конструктор
    private float width;
    private  float height;

    public Rectange(float x, float y, float width, float height) {
        super(x, y);
        this.height = height;
        this.width = width;

    }


    @Override
    public float getArea() {
        return width*height;
    }

    @Override
    public float getPerimetr() {
        return width*2+height*2;
    }
}
