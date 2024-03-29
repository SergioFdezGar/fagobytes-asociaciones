package g01_03.gest_asobu.presentacion;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class UsuarioCellRenderer extends DefaultListCellRenderer {
	
	protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
	public Component getListCellRendererComponent(JList list, Object value, int index,boolean isSelected, boolean hasFocus) {
			JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, hasFocus);
			renderer.setIcon(new ImageIcon(UsuarioCellRenderer.class.getResource("/g01_03/gest_asobu/recursos/admin.png")));
			renderer.setBorder(new LineBorder(SystemColor.activeCaption));
			renderer.setHorizontalAlignment(JLabel.LEFT);
			renderer.setBackground(Color.WHITE);
			renderer.setForeground(Color.BLACK);
			if (isSelected) renderer.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
			return renderer;
	}
}
