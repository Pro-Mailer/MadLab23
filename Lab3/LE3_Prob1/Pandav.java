class Pandav extends BharatVanshi
{
    public void fight()
    {
        System.out.print("Pandav were bharatvanshi. ");
        super.fight();
    }
    
    public void obey()
    {
        System.out.println("Pandavs were obedient.");
    }
    
    public void kind()
    {
        System.out.println("Pandavs were kind");
    }
    
    public Pandav()
    {
        fight();
        this.obey();
    }
}