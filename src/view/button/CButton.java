package src.view.button;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class CButton extends JButton
{
    protected abstract void invokeInputHandler();

    public CButton(String text)
    {
        super(text);
        setFocusable(false); // prevents text highlighting

        addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                invokeInputHandler();
            }
        });
    }
}
