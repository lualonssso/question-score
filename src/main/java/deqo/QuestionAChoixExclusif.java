package deqo;

/**
 * Classe représentant une question à choix exclusive
 */
public class QuestionAChoixExclusif implements QuestionAChoix {

    /** Enonce de la question. */
    private String enonce;
    /** Indice l seule bonne reponse dans la liste de responses */
    private int indiceBonneReponse;

    /**
     * Une question à choix excusive est complètement caractérisé par son énoncé et l'indice de sa bonne réponse
     * @param enonce l'énoncé de la question
     * @param indiceBonneReponse l'indice de la bonne réponse
     */
    public QuestionAChoixExclusif(String enonce, int indiceBonneReponse) {
        this.enonce = enonce;
        this.indiceBonneReponse = indiceBonneReponse;
    }

    /**
     * Récupère l'énoncé de la question
     * @return l'énoncé de la question
     */
    public String getEnonce() {
        return enonce;
    }

    /**
     * Opération permettant de récupérer le score donné par un choix.
     * @param indiceChoix l'indice du choix
     * @return 100 si l'indice du choix fourni est l'indice de la bonne réponse,
     * 0 autrement
     */
    public float getScoreForIndice(final int indiceChoix) {
        if (indiceChoix == indiceBonneReponse) {
            return 100;
        }
        return 0;
    }
}
