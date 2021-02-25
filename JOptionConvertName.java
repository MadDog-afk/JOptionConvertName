import javax.swing.*;

public class JOptionConvertName {
    public static void main(String[] args) {
        String [] name = new String[5];
        int n;
        
        for (n = 0; n <= 4; n++) {
            name [n] = JOptionPane.showInputDialog("Enter Name " + n + ":");
            
            
        }
        
        for (n = 0; n <= 4; n++) {
            if (name[n].length()%2==0) {
                name [n] = name[n].toUpperCase() + "-" + name[n].length();
            }
            else {
                name [n] = name[n].toLowerCase() + "-" + name[n].length();
            }
    }
    JOptionPane.showMessageDialog(null,name, "Name & Length", JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
    
}
}