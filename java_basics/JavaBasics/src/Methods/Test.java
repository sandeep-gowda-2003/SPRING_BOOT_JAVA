package Methods;

public class Test {
	String name;
    private String model;

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void display() {
        System.out.println("car name is " + name);
        System.out.println("model name is " + model);
    }
}
