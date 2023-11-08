package p3;

public abstract class People {
    private String name;

    public String getName(){
        return name;
    }

    public People(String name) {
        this.name = name;
    }

    public abstract void info();
}
