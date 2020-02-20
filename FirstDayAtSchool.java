package sop;
import java.util.Arrays;
public class FirstDayAtSchool {

		public boolean res;
		
		public void checkmyName(String myname) {
			if(myname.compareTo("Tilaka")==0)
				res=true;
			else
				res=false;
		}
		public String[] prepareMyBag() {
			String[] schoolBag= {"Books","NoteBooks","Pens"};
			System.out.println("My School Bag Contains: "+Arrays.toString(schoolBag));
			return schoolBag;
		}
		public String[] addpencils() {
			String[] schoolBag= {"Books","NoteBooks","Pens","Pencils"};
			System.out.println("Now My School Bag Contains: "+Arrays.toString(schoolBag));
			return schoolBag;
		}
		public static void main(String[] args) {
			FirstDayAtSchool fds=new FirstDayAtSchool();
			String[] sb=fds.prepareMyBag();
			//System.out.println(sb);
			
			for(String s:sb)
				System.out.println("Bag contains: "+s);
			
			String[] pencil=fds.addpencils();
			for(String s:pencil)
				System.out.println("Pencil box Contains "+s);
		}
}

