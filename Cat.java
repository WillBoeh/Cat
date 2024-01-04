public class Cat{
    private String Color;
    private String size;
    private boolean happy;

    public Cat(){
        Color = "orange";
        size = "Medium";
        happy = true;
    }


    Cat(String Color, String size, boolean happy){
        this.Color = Color;
        this.size = size;
        this.happy = happy;
    }

    public String whatColor(){
        return Color;
    }

    public String howBig(){
        return size;
    }
    public String isItHappy(){
        if(happy = true){
            return("He is happy :)");
        }
        else{
            return("He is mad >:(");
        }
    }
}   