
package app;

public class Person {
    
    private String name;
    private int age;
    private String address;
    
    public Person(){}
    
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
     
}
