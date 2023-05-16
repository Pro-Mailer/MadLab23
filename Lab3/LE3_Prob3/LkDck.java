class LkDck extends ducks implements flyable,quackable
{
    public void fly()
    {
        System.out.println("Capable of flying.");
    }
    
    public void sound()
    {
        System.out.println("Quacks");
    }
    
    LkDck()
    {
        fly();
        sound();
    }
}