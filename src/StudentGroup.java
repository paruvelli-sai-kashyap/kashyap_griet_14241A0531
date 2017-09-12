import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}
   //my code
ArrayList alt=new ArrayList();
int i;
void alist()
    for(i=0;i<students.length;<i++)
    {
    alt.add(i);
    }

	@Override
	public Student[] getStudents() {
return students[];
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
if(students==null)
{
throw IllegalArgumentException();
}
else
{
this.students=students;
for(i=0;i<students.length;i++)
{
alt.add(students[i]);
}
}
	}

	@Override
	public Student getStudent(int index) {
if(0>index>=students.length)
{
throw IllegalArgumentException();
}
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
if(student==null||students.length<=index<0)
{
throw IllegalArgumentException();
}
else
{
alt.add(index,student);
index=index+1;
alt.remove(index);
}
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
if(student==null)
{
throw IllegalArgumentException;
}
else
{
alt.add(0,student);
}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
if(student==null)
{
throw IllegalArgumentException;
}
else
{
alt.add(alt.size(),student);
}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
if(student==null||0>index>=students.length)
{
throw IllegalArgumentException;
}
else
{
alt.add(index,student);
}

	}

	@Override
	public void remove(int index) {
		// Add your implementation here
if(0>index>=students.length)
{
throw IllegalArgumentException;
}
else
{
alt.remove(index);
}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
if(!alt.contains(student))
{
throw new IllegalArgumentException("Student not exist");
}
if(student==null)
{
throw IllegalArgumentException();
}
else
{
alt.remove(student);
}
	}

	@Override
	public void removeFromIndex(int index) {
if(0>index>=strings.length)
{
throw IllegalArgumentException;
}
else
{		// Add your implementation here
for(i=0;i<strings.length;i++)
{
if(i!=index)
{
alt.remove(i);
}
else
{
break;
}
}
}

	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
if(student==null)
{
throw IllegalArgumentException;
}
else
{		// Add your implementation here
for(i=0;i<strings.length;i++)
{
if(students[i]!=student)
{
alt.remove(student[i]);
}
else
{
break;
}
}
}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
if(0>index>=students.length)
{
throw IllegalArgumentException;
}
else
{
for(i=0;i<index;i++)
{
alt.remove(i);
}
}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
if(student==null)
{
throw IllegalArgumentException;
}
else
{
for(i=0;students[i]!=student;i++)
{
alt.remove(students[i]);
}
}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
