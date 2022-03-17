// Encapsulation, is to make sure that "sensitive" data is hidden from users.
//declare class variables/attributes as private
//provide public get and set methods to access and update the value of a private variable

public class AboutEncapsulation {
    private String name;
    // Getter
    public String getName() {
        return name;
    }
    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        AboutEncapsulation obj1= new AboutEncapsulation();
        obj1.setName("Sahana");
        System.out.println(obj1.getName());
    }
}
