import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Visual extends JFrame implements ActionListener {
    JFrame frame;
    JTextField movieName;
    JButton save;
    JButton fullList;
    JButton randomMovie;
    ImageIcon logo;
    ImageIcon saveLogo;
    ImageIcon listLogo;
    ImageIcon randomLogo;
    JLabel label;

    Visual(){
        logo = new ImageIcon("Logo.png");

        saveLogo = new ImageIcon("save.png");
        Image image = saveLogo.getImage();
        Image newImage = image.getScaledInstance(20,20, Image.SCALE_SMOOTH);
        saveLogo = new ImageIcon(newImage);

        listLogo = new ImageIcon("list.png");
        image = listLogo.getImage();
        newImage = image.getScaledInstance(20,20, Image.SCALE_SMOOTH);
        listLogo = new ImageIcon(newImage);

        randomLogo = new ImageIcon("dice.png");
        image = randomLogo.getImage();
        newImage = image.getScaledInstance(20,20, Image.SCALE_SMOOTH);
        randomLogo = new ImageIcon(newImage);

        frame = new JFrame("Movie");
        frame.setSize(450,150);
        frame.setBounds(50,50,450,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setIconImage(logo.getImage());
        frame.getContentPane().setBackground(new Color(0xD107EF));

        movieName = new JTextField();
        movieName.setPreferredSize(new Dimension(400,35));

        save = new JButton("Save");
        save.setIcon(saveLogo);
        save.setHorizontalAlignment(JButton.LEFT);
        save.setVerticalAlignment(JButton.CENTER);
        save.setIconTextGap(12);
        save.setPreferredSize(new Dimension(100,35));
        //save.setBounds(400,0,100,35);
        save.setFocusable(false);
        save.setBackground(new Color(0x1CCD37));

        fullList = new JButton("Show full list");
        fullList.setIcon(listLogo);
        fullList.setHorizontalAlignment(JButton.LEFT);
        fullList.setVerticalAlignment(JButton.CENTER);
        fullList.setIconTextGap(12);
        fullList.setPreferredSize(new Dimension(150,35));
        //fullList.setBounds(0,40,150,35);
        fullList.setFocusable(false);
        fullList.setBackground(new Color(0x1CCD37));

        randomMovie = new JButton("Get a random movie");
        randomMovie.setIcon(randomLogo);
        randomMovie.setHorizontalAlignment(JButton.LEFT);
        randomMovie.setVerticalAlignment(JButton.CENTER);
        randomMovie.setIconTextGap(12);
        randomMovie.setPreferredSize(new Dimension(200,35));
        //randomMovie.setBounds(210,40,200,35);
        randomMovie.setFocusable(false);
        randomMovie.setBackground(new Color(0x1CCD37));

        movieName.addActionListener(this);
        save.addActionListener(this);
        fullList.addActionListener(this);
        randomMovie.addActionListener(this);

        frame.add(movieName);
        frame.add(save);
        frame.add(fullList);
        frame.add(randomMovie);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
