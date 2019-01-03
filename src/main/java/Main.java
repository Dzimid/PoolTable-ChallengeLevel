import model.Ball;
import model.ChallengeLevelXML;
import service.LevelDAO;
import service.LevelXML;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ball a = new Ball(2, 3, 2);
        Ball b = new Ball(3, 4, 4);

        List<Ball> balls = new ArrayList<>();
        balls.add(a);
        balls.add(b);

        ChallengeLevelXML challengeLevelXML = new ChallengeLevelXML(
                "test.xml",
                balls,
                balls,
                b,
                a,
                b
        );

        LevelDAO levelDAO = new LevelXML();
        levelDAO.save(challengeLevelXML);
        ChallengeLevelXML challengeLevelXML1333 = levelDAO.loadByName("test.xml");

        System.out.println("ASD");
    }
}
