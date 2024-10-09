public class Main
{
    public static void main(String[] args)
    {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");

        
        info=game.getScore();
        System.out.println(info);
        game.recordPlay(1);
        info=game.getScore();
        System.out.println(info);
        game.recordPlay(0);
        info=game.getScore();
        System.out.println(info);
        game.recordPlay(3);
        info=game.getScore();
        System.out.println(info);
        game.recordPlay(0);
        info=game.getScore();
        System.out.println(info);
        game.recordPlay(0);
        info=game.getScore();
        System.out.println(info);
        game.recordPlay(4);
        info=game.getScore();
        System.out.println(info);

        Scoreboard match = new Scoreboard("Tigers", "Lions");

        match.recordPlay(2);
        info=match.getScore();
        System.out.println(info);
        match.recordPlay(0);
        info=match.getScore();
        System.out.println(info);
        match.recordPlay(5);
        info=match.getScore();
        System.out.println(info);
        match.recordPlay(1);
        info=match.getScore();
        System.out.println(info);


        
    }
}