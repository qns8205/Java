import java.util.Scanner;
import javax.swing.JFileChooser;
import java.util.Scanner;

public class TextFileOpener {
	JFileChooser fileChooser = new JFileChooser();
	StringBuilder sb = new StringBuilder();
	
	public void Pickfile() throws Exception {
		if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			java.io.File file = fileChooser.getSelectedFile();
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				sb.append(input.nextLine());
				sb.append("\n");
			}
			
			input.close();
		}
		
		else {
			sb.append("파일이 선택되지 않았습니다.");
		}
	}
}