package test.array;

public class MemberTest {

	public static void main(String [] args) {
		
		if(args[0]=="과자") {
			//...
		}else if(args[0]=="아이스크림") {
			//...
		}
		
		//System.out.println(args);
		//System.out.println(args.length);
		
		MemberDB db=new MemberDB();
		
		for(int i=0;i<args.length;i++) {
			db.setMemberName(args[i]);
		}
		
		db.printNames();

	}

}
