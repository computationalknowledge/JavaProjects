interface Animal {
    void makeSound(String a);
}

public class Jungle{
    public static void main(String [] args){
        JungleManager.handleTheAnimals();
    }
}

class JungleManager{
    static void handleTheAnimals(){
        Tiger tiggy = new Tiger();
        tiggy.makeSound("Growl");
    }
}

class Tiger implements Animal {
    public void makeSound(String sound) {
        System.out.println("Tiger says " + sound);
    }
}
