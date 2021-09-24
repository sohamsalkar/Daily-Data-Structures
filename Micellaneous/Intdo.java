interface Actor {
    public void act();

    public void speak();

    default public void dance() {
        System.out.println("def dance");
    }
}

class Hero implements Actor {
    public void act() {
        System.out.println("hero action");

    }

    public void speak() {
        System.out.println("hero dialogues");
    }

    public void dance() {
        System.out.println("hero dance");
    }

}

class Villian implements Actor {
    public void act() {
        System.out.println("villian action");

    }

    public void speak() {
        System.out.println("viliian dialogues");
    }

}

class Intdo {
    public static void main(String args[]) {
        Actor h = new Hero();
        h.act();
        h.dance();
        Actor v = new Villian();
        v.speak();
        v.dance();

    }
}
