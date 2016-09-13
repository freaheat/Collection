
package collection;

public class Mobile {
    private int number;
    private String name;
    
    public Mobile(int number, String name){
        this.name = name;
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
