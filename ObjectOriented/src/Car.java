public class Car {

    private String make = "Tesla";
    private String model = "model X";
    private String color = "yellow";
    private int doors= 2;
    private boolean convertable=true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertable() {
        return convertable;
    }

    public void setMake(String make){
        //this.make = make;
        if(make == null) make="Unknown";
        String lowecaseMake = make.toLowerCase();
        switch (lowecaseMake){
            case "kia" , "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public void describeCar(){
        System.out.println("Doors - "+doors+"\nColor - "+color+"\nModel - "+model+"\nMaker - "+make+"\n"+(convertable?"Convertable":"simple"));

    }

}
