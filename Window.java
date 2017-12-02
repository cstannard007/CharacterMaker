import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener{
  private int height;
  private int width;

  private JFrame frame;
  private JMenuBar mb;
  private JMenu stats, skills, equip, spells, bio, cs;

  private JPanel panels;
  private CardLayout layout;
  private JPanel statsTab, skillsTab, equipTab, spellsTab, bioTab, csTab;

  // Client calls this to create the window and its size
  public Window(int w, int h){
    height = h;
    width = w;
  }

  // Builds the window
  public void build(){
    frame = new JFrame("Character Maker");
    frame.setSize(height, width);
    tabs();
    panels();
    frame.setVisible(true);
  }

  // This method builds the tabs in the window
  private void tabs(){
    mb = new JMenuBar();
    stats = new JMenu("Stat");
    skills = new JMenu("Skills and Abilities");
    equip = new JMenu("Equipment");
    spells = new JMenu("Spells");
    bio = new JMenu("Bio");
    cs = new JMenu("Character Sheet");

    mb.add(stats);
    mb.add(skills);
    mb.add(equip);
    mb.add(spells);
    mb.add(bio);
    mb.add(cs);

    stats.addActionListener(this);
    skills.addActionListener(this);
    equip.addActionListener(this);
    spells.addActionListener(this);
    bio.addActionListener(this);
    cs.addActionListener(this);

    frame.setJMenuBar(mb);
  }

  public void panels(){
    // 600 width, 400 height
    panels = new JPanel(new CardLayout(600, 400));
    layout = (CardLayout) panels.getLayout();

    statsTab = new JPanel();
    statsTab.setBounds(400,800,200,200);
    panels.add(statsTab, "statsTab");

    skillsTab = new JPanel();
    skillsTab.setBounds(400,800,200,200);
    skillsTab.setBackground(Color.blue);
    panels.add(skillsTab, "skillsTab");

    equipTab = new JPanel();
    equipTab.setBounds(400,800,200,200);
    equipTab.setBackground(Color.gray);
    panels.add(equipTab, "equipTab");

    spellsTab = new JPanel();
    spellsTab.setBounds(400,800,200,200);
    spellsTab.setBackground(Color.blue);
    panels.add(spellsTab, "spellsTab");

    bioTab = new JPanel();
    bioTab.setBounds(400,800,200,200);
    bioTab.setBackground(Color.gray);
    panels.add(bioTab, "bioTab");

    csTab = new JPanel();
    bioTab.setBounds(400,800,200,200);
    bioTab.setBackground(Color.blue);
    panels.add(csTab, "csTab");
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource()== stats)
      layout.show(panels, "statsTab");
      System.out.println("St");
    if(e.getSource()== skills)
      layout.show(panels, "skillsTab");
      System.out.println("Sk");
    if(e.getSource()== equip)
      layout.show(panels, "equipTab");
      System.out.println("EQ");
    if(e.getSource()== spells)
      layout.show(panels, "spellsTab");
      System.out.println("SP");
    if(e.getSource()== bio)
      layout.show(panels, "bioTab");
      System.out.println("Bio");
    if(e.getSource()== cs)
      layout.show(panels, "csTab");
      System.out.println("CS");
  }

}
