package com.assignments;

public class ConditionalStatementsAssign6 {

	public static void main(String[] args) {
		String customerName= "John Doe";
		int creditScore=720;
		double income=55000.0;
		boolean isEmployed= true;
		double debtToIncomeRatio=35.0;
		
//		checking the conditions to approve loan
		if(creditScore>=750) {
//			Approving the loan
			System.out.println("The loan is approved");
		}
//		checking the credit score with diff conditions and also other criterias to approve loan
		else if(creditScore>=650 && creditScore<=750) {
			if(income>=50000) {
				if(isEmployed) {
					if(debtToIncomeRatio<40.0) {
						System.out.println("The loan is approved after all the checks-Good luck" +customerName);
					}else {
						System.out.println("The loan is denied as the DTI ratio is above the criteria -Sorry");
					}
				}else {
					System.out.println("The loan is denied as you are not employed");
				}
			}else {
				System.out.println("Sorry your income is less than 50000 so you are not eligible for the loan");
			}
		}else {
			System.out.println("The credit score is not as per eligibility- loan denied");
		}

	}

}
