public abstract class Animal {

    private String name;


    public Animal(String inputName){
        this.name = inputName;

    }
    // Methods

    public String makeNoise(){
        return "Hello, my name is " +this.name;
    }

    public String eat(){
        return "That was tasty";
    }










    //Getters and Setters
    public String getName(){
        return this.name;
    }

//    public String getType(){
//        return this.type;
//    }


    public void setName(String name) {
        this.name = name;
    }

//    public void setType(String type){
//        this.type = type;
//    }
}
