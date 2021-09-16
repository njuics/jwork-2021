package W01.S191220035.code;
// package W01.S191220035;
public class Character {
    String name;
    String mood;    //心情，态度

    public Character(){
        this.mood = "正常";
    }
    public Character(String mood){
        this.mood = mood;
    }

    public Character(String name, String mood){
        this.name = name;
        this.mood = mood;
    }

    public String getName(){
        return name;
    }

    public String getMood(){
        return mood;
    }

    public void speakto(String message, Character...target){
        System.out.print(name + "(" + mood + ")" + " 对 "); 
        for (Character member:target){
            System.out.print(member.name + " ");
        }
        System.out.print("说：“" + message + "”\n");
        for (Character member:target){
            member.heard(this, message);
        }
        // System.out.println(name + "(" + mood + ")" + " 对 " + target.name + " 说：“" + message + "”");
        // target.heard(this, message);
    }

    public void heard(Character speaker, String message){
        System.out.println(name + "(" + mood + ")"  + " 从 " + speaker.name + " 听到：“" + message + "”");
    }

    public void moodChange(String mood){
        System.out.println(this.name + "的心情从" + this.mood + "变为" + mood);
        this.mood = mood;
    }


    // public void beNormal(){
    //     System.out.println(this.name + "的心情从" + this.mood + "变为正常");
    //     this.mood = "正常";
    // }

    // public void beHappy(){
    //     System.out.println(this.name + "的心情从" + this.mood + "变为开心");
    //     this.mood = "开心";
    // }

    // public void beSad(){
    //     System.out.println(this.name + "的心情从" + this.mood + "变为伤心");
    //     this.mood = "伤心";
    // }

    // public void beSurprised(){
    //     System.out.println(this.name + "的心情从" + this.mood + "变为惊讶");
    //     this.mood = "惊讶";
    // }

    // public void beSerious(){
    //     System.out.println(this.name + "的心情从" + this.mood + "变为严肃");
    //     this.mood = "惊讶";
    // }
}
