package deqo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class QuestionAChoixMultipleTest {

    private QuestionAChoixMultiple quAChMu;
    private List<Integer> indicesBonesReponses;

    @Before
    public void setUp() {
        indicesBonesReponses = new ArrayList<>();
        indicesBonesReponses.add(1);
        indicesBonesReponses.add(2);
        quAChMu = new QuestionAChoixMultiple("Q1", indicesBonesReponses);
    }

    @Test
    public void getEnonce() {
        //WHEN
        String e = quAChMu.getEnonce();
        //THEN
        assertEquals(e, "Q1");
    }

    @Test
    public void getScoreForIndice1() {
        //WHEN
        float score = quAChMu.getScoreForIndice(2);
        //THEN
        assertEquals(score, 50f, 0f);
    }

    @Test
    public void getScoreForIndice2() {
        //WHEN
        float score = quAChMu.getScoreForIndice(3);
        //THEN
        assertEquals(score, 0f, 0f);
    }
}