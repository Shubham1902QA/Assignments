package com.assignments;

import java.util.HashMap;
import java.util.Map;

public class CollectionsLoopConditionalStatementsAssign7 {

	public static void main(String[] args) {
		//initiaizations
	    int credittxncount=0,debittxncount=0,totalAmountcredited=0,totalamountdebited=0,remainingbalance=0,suspicioustxn=0;
		//Storing in collections all the transactions
	    Map<Integer,Integer> transactions= new HashMap<Integer,Integer>();
		transactions.put(1,50000);
		transactions.put(2,-2000);
		transactions.put(3,3000);
		transactions.put(4,-15000);
		transactions.put(5,-200);
		transactions.put(6,-300);
		transactions.put(7,4000);
		transactions.put(8,-3000);
//	    Printing all the transactions in the account
		System.out.println("The transaction are as follows="+transactions);
		//Loop to check all the transaction in the created collection
		 for(int i=1;i<=8;i++) {
			 //Condition to check credit amount 
			 if(transactions.get(i)>0) {
				 //Count of credit txn
				 credittxncount++;
				 //Total amount credited in the account
				 totalAmountcredited=totalAmountcredited+transactions.get(i);
			 }
			 //Conditon to check debit txn
			 else if(transactions.get(i)<0){
				 //Count of debit txn
				 debittxncount++;
				 //Total debit amount from the account
				 totalamountdebited=totalamountdebited+transactions.get(i);
			 }
			 //Condition to check suspicious txn
			 if(transactions.get(i)<-10000 || transactions.get(i)>10000) {
				 suspicioustxn++;
				 
			 }
		 }
		 // Remaining balance in the account after all the txn's
		 remainingbalance=totalAmountcredited+totalamountdebited;
		 
		 System.out.println("The total no of transactions credited "+credittxncount);
		 System.out.println("The total no of transactions debited "+debittxncount);
		 System.out.println("The total amount credited is="+totalAmountcredited);
		 System.out.println("The total amount debited is="+totalamountdebited);
		 System.out.println("Remaining balance="+remainingbalance);
		 System.out.println("Total no of suspicious txn is="+suspicioustxn);
		 
		
	}
}


