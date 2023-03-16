package assignment2.travel;

public enum Destination {
    BERLIN("BERLIN"), ROME("ROME"), AMSTERDAM("AMSTERDAM"), PARIS("PARIS"), HELSINKI("HELSINKI"), INVAILD("INVAILD");

    private String name ;

    public String getString(){
        return this.name;
    }
    
    private Destination(String name){
        this.name = name;
    }
}