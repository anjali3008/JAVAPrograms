import java.util.ArrayList;
import java.util.ListIterator;

class Record
{
	private int rno;
	private String name;
	private int age;
	private float percent;
	public Record()
	{
		super();
	}
	
	public Record(int rno, String name, int age, float percent) 
	{
		super();
		this.rno = rno;
		this.name = name;
		this.age = age;
		this.percent = percent;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Record r1 = new Record(001,"Abish",24,76);
		Record r2 = new Record(002,"Benny",23,78);
		Record r3 = new Record(003,"Chris",25,84);
		Record r4 = new Record(004,"Dave",22,83);
		
		ArrayList<Record> l1 = new ArrayList<Record>();
		l1.add(r1);
		l1.add(r2);
		l1.add(r3);
		l1.add(r4);
		
		ArrayList<Record> l2 = new ArrayList<Record>(l1);
		ListIterator<Record> itr = l1.listIterator();
		
	while(itr.hasNext())
	{
		Record tmp = itr.next();
		System.out.println(tmp.getRno()+" "+tmp.getName()+" "+tmp.getAge()+" "+tmp.getPercent());
	}
	
	for(Record t : l2)
	{
		System.out.println(t.getRno()+" "+t.getName()+" "+t.getAge()+" "+t.getPercent());	
	}
				
	}	

}
