package coen352.a3;

//class problem 2
public class CoenCoursesGraph extends Graphm {

	public static int getIndex(String coencourses) {
  
		// assigning an index to each course and pre requisite
		int index;
    
		switch (coenCourses){
			case "MATH204":
				index = 0;
				break;

			case "COEN243":
				index = 1;
				break;

			case "COEN212":
				index = 2;
				break;

			case "COEN231":
				index = 3;
				break;

			case "COEN311":
				index = 4;
				break;

			case "COEN313":
				index = 5;
				break;

			case "COEN346":
				index = 6;
				break;

			case "COEN352":
				index = 7;
				break;

			case "ENGR290":
				index = 8;
				break;

			case "ELEC311":
				index = 9;
				break;

			case "COEN317":
				index = 10;
				break;

			case "COEN320":
				index = 11;
				break;

			case "SOEN341":
				index = 12;
				break;

			case "ELEC372":
				index = 13;
				break;

			case "COEN244":
				index = 14;
				break;

			case "COEN366":
				index = 15;
				break;

			case "ENGR301":
				index = 16;
				break;

			case "ENGR371":
				index = 17;
				break;

			case "COEN390":
				index = 18;
				break;

			case "COEN466":
				index = 19;
				break;

			case "COEN451":
				index = 20;
				break;

			case "COEN316":
				index = 21;
				break;

			case "COEN413":
				index = 22;
				break;

			case "COEN424":
				index = 23;
				break;

			case "COEN432":
				index = 24;
				break;

			case "COEN434":
				index = 25;
				break;

			case "COEN415":
				index = 26;
				break;

			case "COEN433":
				index = 27;
				break;

			case "COEN421":
				index = 28;
				break;

			case "COEN447":
				index = 29;
				break;

			case "COEN422":
				index = 30;
				break;

			case "COEN448":
				index = 31;
				break;

			case "COEN490":
				index = 32;
				break;

			case "COEN446":
				index = 33;
				break;
      
      case "COEN498":
				index = 34;
				break;
				
			case "DEPTPRM":
				index = 35;
				break;

			default:
				index = -1; //invalid course
		}
		return index;
	}

public String getCourses(int ind) {
	
		String Courses;
		switch (ind) {
			case 0:
				Courses = "MATH204";
				break;

			case 1:
				Courses = "COEN243";
				break;

			case 2:
				Courses = "COEN212";
				break;

			case 3:
				Courses = "COEN231";
				break;

			case 4:
				Courses = "COEN311";
				break;

			case 5:
				Courses = "COEN313";
				break;

			case 6:
				Courses = "COEN346";
				break;

			case 7:
				Courses = "COEN352";
				break;

			case 8:
				Courses = "ENGR290";
				break;

			case 9:
				Courses = "ELEC311";
				break;

			case 10:
				Courses = "COEN317";
				break;

			case 11:
				Courses = "COEN320";
				break;

			case 12:
				Courses = "SOEN341";
				break;

			case 13:
				Courses = "ELEC372";
				break;

			case 14:
				Courses = "COEN244";
				break;

			case 15:
				Courses = "COEN366";
				break;

			case 16:
				Courses = "ENGR301";
				break;

			case 17:
				Courses = "ENGR371";
				break;

			case 18:
				Courses = "COEN390";
				break;

			case 19:
				Courses = "COEN466";
				break;

			case 20:
				Courses = "COEN451";
				break;

			case 21:
				Courses = "COEN316";
				break;

			case 22:
				Courses = "COEN413";
				break;

			case 23:
				Courses = "COEN424";
				break;

			case 24:
				Courses = "COEN432";
				break;

			case 25:
				Courses = "COEN434";
				break;

			case 26:
				Courses = "COEN415";
				break;

			case 27:
				Courses = "COEN433";
				break;

			case 28:
				Courses = "COEN421";
				break;

			case 29:
				Courses = "COEN447";
				break;

			case 30:
				Courses = "COEN422";
				break;

			case 31:
				Courses = "COEN448";
				break;

			case 32:
				Courses = "COEN490";
				break;

			case 33:
				Courses = "COEN446";
				break;
				
			case 34:
				Courses = "COEN498";
				break;
				
			case 35:
				Courses = "DEPTPRM";
				break;

			default:
				Courses = null; 
		}
		return Courses;
	}

//return direct prereq of a coen course
	public String [] getPrerequisite(String courseCode) {
  
		// clear visited array
		for(int i = 0; i < this.n(); i++) {
			this.setMark(i, UNVISITED);
		}
	
    
        String[] prerequisite = new String [this.n()];
		int prereqCounter = 0;
		int ci = getIndex(courseCode);
		
		if (ci==-1){ //unavailable course
			return null;
		}

        int courseindex;
		for(int i = 0; i < this.n(); i++){
			if (this.isEdge(i, ci)) {
				prerequisite[courseindex] = getCourse(i);
					courseindex++;
			}
		}
  	  for(int i = 0; i < prerequisite.length; i++) {
		  
		  if (prerequisite[i] != null) {
			  prereqCounter++; //increment
		  }
		  
	  }
	  
	  String[] returnPath = new String[prereqCounter];
	  
	  for(int i = 0; i < prereqCounter; i++) {
		  
		 returnPath[i] = prerequisite[i];
	  }
    
	  return returnPath; 
    
    }

//problem 2 (1) return a sequence of prerequisites
	public String getPrerequisitePath(String courseCode) { 
  
		// set to UNVISITED
       for(int i = 0; i < this.n(); i++) {
			this.setMark(i, UNVISITED);
		}
    
		ADTStack <String> stack = new AStack <String> (100);
		ADTStack <String> stackPath = new AStack <String> (100);
    
		String returnPath = "";
		int prereqCounter = 0;
    
		// we need two stacks to search all paths and for output
		stack.push(courseCode);
		stackPath.push(courseCode);
		
		while(stack.length() > 0) { //stack is not empty
			String v = stack.pop();
			
			String [] prerequisite = this.getPrerequisite(v); 

	     if (prerequisite!= null) {
      
				for(int i = 0; prerequisite.length; i++) {
					stackPath.push(prerequisite[i]);
					stack.push (prerequisite[i]);
					this.setMark(getIndex(prereqisite[i]), VISITED);
				}
			}
		} 
	
		// print all elements in stack
        while(stackPath.length() > 0) { //path is not empty
			for (int i = 0; stackPath.size(); i++){
				if (!returnPath.contains(stackPath.pop)){
				returnPath += stackPath.pop();
				returnPath += " ";
				}
			}
		}
		
		return returnPath;
    }

	//problem 2 (2) return boolean if src crs is a prereqfor dest crs
	public boolean isPrerequisite(String sourceCourse, String destinationCourse)
	{
		int srcCourse = getIndex(sourceCourse); 
		int destCourse = getIndex(destinationCourse);
		
		//invalid course input : return false 
		if (destCourse == -1)
		{
			System.out.println("Course not found");
			return false; 
		}

		//invalid prerequisite input, return false
		if (srcCourse == -1)
		{
			System.out.println("Course not found");
			return false; 
		}	
		
	   return this.isEdge(srcCourse,destCourse); 
		
	}
}
