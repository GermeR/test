package memes.src.View;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

public class ViewYouTube {

	public static void main(String[] args) {
		JFrame frame = new JFrame("YouTube Viewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(getBrowserPanel(), BorderLayout.CENTER);
		frame.setSize(800, 600);
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
	}

	public static JPanel getBrowserPanel() {
		JPanel webBrowserPanel = new JPanel(new BorderLayout());
		JWebBrowser webBrowser = new JWebBrowser();
		//webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
		//webBrowser.setBarsVisible(false);
		//webBrowser.navigate("https://www.facebook.com/?ref=logo");
		return webBrowserPanel;
	}
}
