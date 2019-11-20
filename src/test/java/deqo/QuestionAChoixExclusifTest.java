package deqo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionAChoixExclusifTest {

    private QuestionAChoixExclusif quAChoixEx1;
    private QuestionAChoixExclusif quAChoixEx2;

    @Before
    public void setUp() {
        quAChoixEx1 = new QuestionAChoixExclusif("Q1", 3);
        quAChoixEx2 = new QuestionAChoixExclusif("Q2", 2);
    }

    @Test
    public void getEnonce() {
        //WHEN
        String enonce = quAChoixEx1.getEnonce();
        //THEN
        assertEquals(enonce, "Q1");
    }

    @Test
    public void getScoreForIndice0() {
        //WHEN
        float score = quAChoixEx1.getScoreForIndice(2);
        //THEN
        assertEquals(score, 0f, 0f);
    }

    @Test
    public void getScoreForIndice100() {
        //WHEN
        float score = quAChoixEx1.getScoreForIndice(3);
        //THEN
        assertEquals(score, 100f, 0f);
    }
}