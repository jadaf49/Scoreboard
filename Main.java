public class Main
{
    public static void main(String[] args)
    {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
        game.recordPlay(1);
        info=game.getScore();
        System.out.println(info);

        game.recordPlay(3);
        info=game.getScore();
        System.out.println(info);
        //i still need to figure out how to update team 2s score without restarting the entire operation
    }
}