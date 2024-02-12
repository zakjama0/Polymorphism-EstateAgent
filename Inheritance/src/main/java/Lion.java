public class Lion extends Animal{


    private boolean canWaitToBeKing;

    public Lion(String name, boolean inputCanWaitToBeKing){
        // no need to define name as it is inherited from Animal
        super(name); //inherited
        this.canWaitToBeKing = inputCanWaitToBeKing;
    }

    @Override
    public String makeNoise(){
        return "ROAR!";
    }


}
