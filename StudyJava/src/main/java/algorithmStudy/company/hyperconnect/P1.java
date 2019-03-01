package algorithmStudy.company.hyperconnect;

import org.junit.Assert;
import org.junit.Test;

public class P1 {

    @Test
    public void NewStarsCanShine(){
        double d1 = 1d;
        ShiningStar star = new ShiningStar(d1);
        Assert.assertEquals(d1, star.shine(), 0.0d);
    }

    @Test(expected = IllegalStateException.class)
    public void test2(){
        double shineFactor = 1.5d;
        ShiningStar star = new ShiningStar(shineFactor);
        star.fadeOut();
        star.shine();
    }

    @Test
    public void test3(){
        double shineFactor = 0.8d;
        ShiningStar star = new ShiningStar(shineFactor);
        star.setName("Sun");
        Assert.assertEquals("Sun", star.getName());
    }
}

class ShiningStar {
    private double shineFactor;
    private String name;

    private static ShiningStar s;

    private ShiningStar(){

    }

    public ShiningStar getInstance(){
        if (s == null) {
            s = new ShiningStar();
        }
        return s;
    }

    public ShiningStar(double shineFactor) {
        this.shineFactor = shineFactor;
    }

    public double shine(){
        return s.shineFactor;
    }

    public void fadeOut(){
        s = null;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}