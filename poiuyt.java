package poiuyt;


import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;


public class Main {

	
	
	
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                new BackgroundWorker().execute();

            }

        });
    }

    public class BackgroundWorker extends SwingWorker<Void, Void> {

        private ProgressMonitor monitor;

        public BackgroundWorker() {
            addPropertyChangeListener(new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    if ("progress".equalsIgnoreCase(evt.getPropertyName())) {
                        if (monitor == null) {
                            monitor = new ProgressMonitor(null, "poiuyt Launch", null, 0, 75);
                        }
                        monitor.setProgress(getProgress());
                    }
                }

            });
        }

        @Override
        protected void done() {
            if (monitor != null) {
                monitor.close();
            }
        }

        @Override
        protected Void doInBackground() throws Exception {
            for (int index = 0; index < 100; index++) {
                setProgress(index);
                Thread.sleep(40);
            }
            return null;
        }
    }
}
