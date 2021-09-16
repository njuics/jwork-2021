public class GourdFactory extends Factory{
    public static Gourd createGourd(Color color){
        if(color == Color.YELLOW){
            return new YellowGourd();
        }
        //TODO:other colors...
        return null;
    }
}
