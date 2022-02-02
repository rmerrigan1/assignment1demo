package assignment01;

import support.cse131.ArgsProcessor;

public class FinalGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		
		String name = ap.nextString("Studnet name:");
		String nameLine = "CSE131 Grade for: "+name+"\n\n";
		
		double averageAssignmentGrade = ap.nextDouble("Average assignment grade earned by the student");
		double unroundedAssignmentGrade = (averageAssignmentGrade/100.0)*40.0;
		double roundedAssignment = Math.round(unroundedAssignmentGrade*100.0)/100.0;
		String assignmentLine = "Average assignment grade: "+averageAssignmentGrade+"%\n\tWeighted assignment grade (out of 40): "+roundedAssignment+"%\n\n";
		
		int extensionPoints = ap.nextInt("Number of extension points earned by the student:");
		double unroundedExtension = (extensionPoints/40.0)*12.0;
		double roundedExtension = Math.round(unroundedExtension*100.0)/100.0;
		String extensionLine = "Number of extension points: "+extensionPoints+"\n\tWeighted studio grade (out of 12): "+roundedExtension+"%\n\n";
		
		int studiosAttended = ap.nextInt("Number of studios attended by the student:");
		double unroundedStudios = (studiosAttended/8.0)*13.0;
		double roundedStudios = Math.round(unroundedStudios*100.0)/100.0;
		String studiosLine = "Number of studios attended: "+studiosAttended+"\n\tWeighted studio grade (out of 13): "+roundedStudios+"%\n\n";
		
		double averageQuizGrade = ap.nextDouble("Average quiz grade earned by the student:");
		double unroundedQuiz = (averageQuizGrade/100.0)*2.0;
		double roundedQuiz = Math.round(unroundedQuiz*100.0)/100.0;
		String quizLine = "Average quiz grade: "+averageQuizGrade+"%\n\tWeighted quiz grade (out of 2): "+roundedQuiz+"%\n\n";
		
		int studioPrepsCompleted = ap.nextInt("Studio preps completed by student: ");
		double unroundedPreps = (studioPrepsCompleted/10.0)*2.0;
		double roundedPreps = Math.round(unroundedPreps*100.0)/100.0;
		String prepsLine = "Studio preps completed: "+studioPrepsCompleted+"\n\tWeightedstudio prep grade (out of 2): "+roundedPreps+"%\n\n";
		
		double averageExamGrade = ap.nextDouble("Average exam grade earned by the student: ");
		double unroundedExam = (averageExamGrade/100.0)*30.0;
		double roundedExam = Math.round(unroundedExam*100.0)/100.0;
		String examLine = "Average exam grade: "+averageExamGrade+"%\n\tWeighted exam grade (out of 30): "+roundedExam+"%\n\n";
		
		double review = Math.random();
		boolean courseReview = review >.50;
		String reviewLine ="Completed course review: "+courseReview+"\n\n";
		
		double unroundedTotal = unroundedAssignmentGrade+unroundedExtension+unroundedStudios+unroundedQuiz+unroundedPreps+unroundedExam+1;
		double roundedTotal = Math.round(unroundedTotal*100.0)/100.0;
		String totalLine = "Total Grade: "+roundedTotal+"%";
		
		System.out.println(nameLine+assignmentLine+extensionLine+studiosLine+quizLine+prepsLine+examLine+reviewLine+totalLine);
		
	

	}

}
