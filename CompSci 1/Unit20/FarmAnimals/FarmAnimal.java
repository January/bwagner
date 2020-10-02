package Unit20;

public class FarmAnimal {
    private String name;

    
    private int cows, horses, pigs, chickens;
    
    FarmAnimal() {
        name = "";
        cows = 0;
        horses = 0;
        pigs = 0;
        chickens = 0;
    }
    FarmAnimal(String n, int c, int h, int p, int ch) {
        name = n;
        cows = c;
        horses = h;
        pigs = p;
        chickens = ch;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public int getPigs() {
        return pigs;
    }

    public void setPigs(int pigs) {
        this.pigs = pigs;
    }

    public int getChickens() {
        return chickens;
    }

    public void setChickens(int chickens) {
        this.chickens = chickens;
    }
    
    
}
