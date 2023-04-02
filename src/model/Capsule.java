package model;

public class Capsule {
    private final static int CapsuleSIZE = 50;
    private int id;
    private String description;
    private String type;
    private String name;
    private String position;
    private Boolean status;

    public Capsule(int id, String description, String type, String name, String position){

        this.id = id;
        this.description = description;
        this.type = type;
        this.name = name;
        this.position = position;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPosition() {
        return position;
    }

    public String getType() {
        return type;
    }
}
