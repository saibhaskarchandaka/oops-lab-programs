class Cow
{
    public
        void displayBreed()
        {
            System.out.print("I belong to Herbivore type\n");
        }
        void eat()
        {
            System.out.print("I eat grass\n");
        }
}

class Calf extends Cow
{
    public
        void nature()
        {
            System.out.print("I play a lot\nIt helps to bond with my family\n");
        }
        void skills()
        {
            System.out.print("With this I develop lot of skills that I could use later\n");
        }
}

public class SimpleInheritance
{
    public static void main(String[] args)
    {
        Calf baby=new Calf();
        baby.displayBreed();;
        baby.eat();
        baby.nature();
        baby.skills();
    }
}
