public class Scoreboard
{
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;

    public Scoreboard (String one, String two)
    {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }

    public void recordPlay(int score)
    {
        if(teamOne.equals(activeTeam))
        {
            teamOneScore+=score;
            if (score==0)
            {
                if(activeTeam.equals(teamOne)) activeTeam = teamTwo;
                else if(activeTeam.equals(teamTwo)) activeTeam=teamOne;

            }
        }
        else if(teamTwo.equals(activeTeam))
        {
            teamTwoScore+=score;
            if (score==0)
            {
                activeTeam = teamOne;
                //else if(activeTeam.equals(teamOne)) activeTeam=teamTwo;

            }
        }
    }   

    public String getScore()
    {
        return teamOneScore +"-" +teamTwoScore + "-" + activeTeam;
    }


}