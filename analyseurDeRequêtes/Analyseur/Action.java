package Analyseur;

public class Action
{
    private String action;
    private String musique;


    public Action()
    {
        this.action = "";
        this.musique = "";
    }
    public Action(String action,String musique)
    {
        this.action = action;
        this.musique = musique;
    }
    /**
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return the musique
     */
    public String getMusique() {
        return musique;
    }

    /**
     * @param musique the musique to set
     */
    public void setMusique(String musique) {
        this.musique = musique;
    }

    
}