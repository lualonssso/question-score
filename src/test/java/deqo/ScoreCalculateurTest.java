package deqo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ScoreCalculateurTest {

    private QuestionAChoixMultiple questionAChoixMultiple;
    private ScoreCalculateur scoreC;

    @Before
    public void setUp() {
        questionAChoixMultiple = new QuestionAChoixMultiple("q1",new ArrayList<>(Arrays.asList(2,3,5)));
        scoreC = new ScoreCalculateur();
    }

    @Test
    public void calculeScore1() {
        //GIVEN
        float score;
        //WHEN
        score = scoreC.calculeScore(new ArrayList<>(Arrays.asList(1,4)), questionAChoixMultiple);
        //THEN
        assertEquals(score, 0f, 0f);
    }

    @Test
    public void calculeScore2() {
        //GIVEN
        float score;
        //WHEN
        score = scoreC.calculeScore(new ArrayList<>(Arrays.asList(2,3)), questionAChoixMultiple);
        //THEN
        assertEquals(score, 2*100/3f, 0.01f);
    }

    @Test
    public void calculeScore3() {
        //GIVEN
        float score;
        //WHEN
        score = scoreC.calculeScore(new ArrayList<>(Arrays.asList(2,3,5)), questionAChoixMultiple);
        //THEN
        assertEquals(score, 100f, 0.01f);
    }

    @Test
    public void calculeScore4() {
        //GIVEN
        float score;
        //WHEN
        score = scoreC.calculeScore(new ArrayList<>(Arrays.asList(1,2,3,4,5)), questionAChoixMultiple);
        //THEN
        assertEquals(score, 0f, 0.01f);
    }

    @Test
    public void calculeScore5() {
        //GIVEN
        float score;
        //WHEN
        score = scoreC.calculeScore(new ArrayList<>(Arrays.asList(1,2,3)), questionAChoixMultiple);
        //THEN
        assertEquals(score, 66.66f, 0.01f);
    }
}