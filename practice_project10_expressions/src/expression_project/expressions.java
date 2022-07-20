package expression_project;
import java.util.regex.*;

public class expressions {

	public static void main(String[] args) {
		String Pat="[a-z]+";
		String check="AshokKumar Reddy";
 Pattern p= Pattern.compile(Pat);
 Matcher c=p.matcher(check);
 while(c.find())
	 System.out.println(check.substring(c.start(),c.end()));
	}

}
