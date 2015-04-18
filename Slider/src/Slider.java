import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 * 
 * Elohe Yonas
 *CSC201
 */
public class Slider extends JFrame {
	/**
	 * initialize variables
	 */
	private JPanel panelslide;
	private JLabel instructions1;
	
	private JScrollBar scroll1;
	private JScrollBar scroll2;
	private JScrollBar scroll3;
	int red,green,blue;
Slider(){
	instructions1 = new JLabel("SHOW THEM COLORS");

	scroll1 = new JScrollBar(0,1,100,1,255);
	scroll1.addAdjustmentListener(new AdjustmentListener(){
		public void adjustmentValueChanged(AdjustmentEvent e){
			 red = e.getValue();
			instructions1.setForeground(new Color(red,green,blue));
		}
	});
	
	
	scroll2 = new JScrollBar(0,1,100,1,255);
	scroll2.addAdjustmentListener(new AdjustmentListener(){
		public void adjustmentValueChanged(AdjustmentEvent e){
			 green = e.getValue();
			instructions1.setForeground(new Color(red,green,blue));
		}
	});
	scroll3 = new JScrollBar(0,1,100,1,255);
	scroll3.addAdjustmentListener(new AdjustmentListener(){
		public void adjustmentValueChanged(AdjustmentEvent e){
			 blue = e.getValue();
			instructions1.setForeground(new Color(red,green,blue));
		}
	});
	instructions1.setLayout(new BorderLayout());
	add(instructions1, BorderLayout.CENTER);
	/**
	 * how the panel is organized
	 */
	panelslide = new JPanel();
	panelslide.setBorder(new CompoundBorder(new TitledBorder("Choose colors"),
			new EmptyBorder(2, 2, 2, 2)));
	panelslide.setLayout(new BorderLayout());
	add(panelslide, BorderLayout.SOUTH);
	panelslide.add(scroll1,BorderLayout.NORTH);
	panelslide.add(scroll2,BorderLayout.CENTER);
	panelslide.add(scroll3,BorderLayout.SOUTH);
}
}
