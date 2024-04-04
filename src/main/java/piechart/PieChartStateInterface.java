package piechart;

import java.awt.event.MouseEvent;

public interface PieChartStateInterface {
    void mousePressed(MouseEvent e, PercentagePieChart chart);

    void mouseReleased(MouseEvent e, PercentagePieChart chart);

    void mouseDragged(MouseEvent e, PercentagePieChart chart);

    void mouseMoved(MouseEvent e, PercentagePieChart chart);
}
