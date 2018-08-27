public class Exercise {
    
    public static void main (String args[])
    {
        Student student1 = new Student(101,"ABC","ABC University");
        Student student2 = new Student(102,"LMN","LMN University");
        Student student3 = new Student(103,"PQR","PQR University");
        Student student4 = new Student(104,"UVW","UVW University");
        Student student5 = new Student(105,"XYZ","ZYZ University");
        Student studentArray[] = {student1, student2, student3, student4, student5};
        
        Result result1 = new Result(111,101,70,"A");
        Result result2 = new Result(222,102,30,"D");
        Result result3 = new Result(333,103,90,"A+");
        Result result4 = new Result(444,104,55,"B");
        Result result5 = new Result(555,105,45,"C");
        Result resultArray[] = {result1, result2, result3, result4, result5};
        
        String topStudentName = getTopStudentName(studentArray,resultArray);
        System.out.println("Student who topped the quiz: "+topStudentName);
    }
    
    
    static String getTopStudentName(Student studentArray[], Result resultArray[])
    {
    	String topStudentName = "";
    	
    	Result max = resultArray[0];
    	for (int i = 0; i < resultArray.length; i++) {
			Result result = resultArray[i];
			if (result.score > max.score) {
				max = result;
			}   
		}

    	for (int i = 0; i < studentArray.length; i++) {
			Student student = studentArray[i];
			if (student.studentId == max.studentId) {
				topStudentName = student.studentName;
			}   
    	}
    	     
        return topStudentName;
    }
   
}

class Student
{
    int studentId;
    String studentName;
    String studentUniversity;
    
    Student(int studentId, String studentName, String studentUniversity)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentUniversity = studentUniversity;
    }
    
}


class Result
{
    int resultId;
    int studentId;
    int score;
    String grade;
    
    Result(int resultId, int studentId, int score, String grade)
    {
        this.resultId = resultId;
        this.studentId = studentId;
        this.score = score;
        this.grade = grade;
    }
}
