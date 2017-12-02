import javax.swing.*;
public class Window{
  private int height;
  private int width;

  // Client calls this to create the window and its size
  public Window(int h, int w){
    height = h;
    width = w;
  }

  // Builds the window
  public void build(){
    JFrame frame = new JFrame("Character Maker");
    frame.setSize(height, width);
    frame.setLayout(null);
    frame.setVisible(true);
    tabs(frame);
  }

  // This method builds the tabs in the window
  private void tabs(JFrame frame){
    JMenuBar mb = new JMenuBar();

    JMenu stats, skills, equip, spells, bio, cs;
    stats = new JMenu("Stats");
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

    frame.setJMenuBar(mb);
  }

}
