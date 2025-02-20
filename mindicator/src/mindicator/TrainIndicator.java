package mindicator;
import java.util.Scanner;

public class TrainIndicator {
	int cchoice=0;
	Scanner sc= new Scanner(System.in);
	Train regulartrain[]= new Train[10];
	Train expresstrain[]= new Train[10];
	
	void display() {
		do {
			System.out.println("=======================================================================");
			System.out.println("------------------------>WELCOME TO M-INDICATOR<-----------------------");
			System.out.println("=======================================================================");
			
			System.out.println("Enter 1 For Regular Trains.");
			System.out.println("      2 For Express Trains.");
			System.out.println("      3 For Exit...");
			System.out.println("=======================================================================");
			System.out.print("Enter Your Choice : ");
			cchoice=sc.nextInt();
			System.out.println("=======================================================================");

			switch(cchoice) {
			case 1 :
				RegularTrains();
				displayTrainData("regular");
				break;
				
			case 2 :
				ExpressTrains();
				displayTrainData("express");
				break;
				
			case 3:
				System.out.println("Thank You For Using M-INDICATOR...");
			cchoice=0;
			break;

			default:
				System.out.println("Please Enter Valid Choice....");
				}
			}
				while(cchoice!=0);
			}
	

	private void displayTrainData(String TrainType) {
		boolean Train = true;
		
		while(Train) {
	    System.out.print("Enter Train Number : ");
	    int TrainNo = sc.nextInt();
		System.out.println("==========================================================================================================================================================================================================================================================================================================================================================================================================");


	    if ("regular".equalsIgnoreCase(TrainType)) {
	        if (TrainNo == 1) {
	            System.out.println("Train 1 Travel: Asangaon (8:50) => Thane (9:57)");
	            System.out.println("(8:50) Asangaon => (8:56) Vasind => (9:03) Khadavli => (9:10) Titwala => (9:16) Ambivli => (9:19) Shahad => (9:26) Kalyan => (9:31) Thakurli => (9:34) Dombivli => (9:37) Kopar => (9:42) Diva => (9:46) Mumbra => (9:52) Kalva => (9:57) Thane.");
	        } else if (TrainNo == 2) {
	            System.out.println("Train 2 Travel: Thane (8:14) => CSMT (9:12)");
	            System.out.println("(8:14) Thane => (8:18) Mulund => (8:21) Nahur => (8:23) Bhandup => (8:27) Kanjurmarg => (8:30) Vikhroli => (8:35) Ghatkopar => (8:40) Kurla => (8:45) Sion => (8:48) Matunga => (8:51) Dadar => (8:55) Byculla => (8:59) Sandhurst Road => (9:04) Masjid => (9:12) CSMT.");
	        } else if (TrainNo == 3) {
	            System.out.println("Train 3 Travel: Kalyan (8:33) => CSMT (9:37)");
	            System.out.println("(8:33) Kalyan => (8:38) Dombivli => (8:42) Thakurli => (8:45) Diva => (8:50) Mumbra => (8:56) Kalva => (9:01) Thane => (9:05) Mulund => (9:08) Nahur => (9:10) Bhandup => (9:14) Kanjurmarg => (9:17) Vikhroli => (9:22) Ghatkopar => (9:27) Kurla => (9:31) Sion => (9:34) Matunga => (9:37) CSMT.");
	        } else if (TrainNo == 4) {
	            System.out.println("Train 4 Travel: Dombivli (8:41) => CSMT (10:03)");
	            System.out.println("(8:41) Dombivli => (8:46) Diva => (8:50) Mumbra => (8:56) Kalva => (9:01) Thane => (9:06) Mulund => (9:09) Nahur => (9:12) Bhandup => (9:16) Kanjurmarg => (9:20) Vikhroli => (9:25) Ghatkopar => (9:30) Kurla => (9:34) Sion => (9:37) Matunga => (9:42) Dadar => (9:46) Byculla => (9:50) Sandhurst Road => (9:55) Masjid => (10:03) CSMT.");
	        } else if (TrainNo == 5) {
	            System.out.println("Train 5 Travel: CSMT (9:27) => Titwala (10:50)");
	            System.out.println("(9:27) CSMT => (9:31) Masjid => (9:36) Sandhurst Road => (9:40) Byculla => (9:45) Dadar => (9:49) Matunga => (9:52) Sion => (9:56) Kurla => (10:01) Ghatkopar => (10:06) Vikhroli => (10:10) Kanjurmarg => (10:13) Bhandup => (10:16) Nahur => (10:20) Mulund => (10:25) Thane => (10:30) Kalva => (10:35) Mumbra => (10:40) Diva => (10:44) Kopar => (10:47) Dombivli => (10:50) Titwala.");
	        } else if (TrainNo == 6) {
	            System.out.println("Train 6 Travel: CSMT (6:53) => Karjat (8:52)");
	            System.out.println("(6:53) CSMT => (6:57) Masjid => (7:02) Sandhurst Road => (7:06) Byculla => (7:10) Dadar => (7:14) Kurla => (7:19) Ghatkopar => (7:24) Thane => (7:29) Dombivli => (7:33) Kalyan => (7:40) Ambernath => (7:46) Ulhasnagar => (7:51) Badlapur => (8:05) Neral => (8:15) Bhivpuri Road => (8:23) Karjat.");
	        } else if (TrainNo == 7) {
	            System.out.println("Train 7 Travel: CSMT (6:42) => Badlapur (8:08)");
	            System.out.println("(6:42) CSMT => (6:46) Byculla => (6:50) Dadar => (6:54) Kurla => (6:58) Ghatkopar => (7:04) Thane => (7:08) Kalva => (7:12) Diva => (7:16) Kopar => (7:20) Dombivli => (7:26) Kalyan => (7:32) Vithalvadi => (7:37) Ulasnagar => (7:44) Ambernath => (8:08) Badlapur.");
	        } else if (TrainNo == 8) {
	            System.out.println("Train 8 Travel: Thane (7:14) => Panvel (8:06)");
	            System.out.println("(7:14) Thane => (7:18) Airoli => (7:22) Rabale => (7:26) Ghansoli => (7:30) Koparkhairane => (7:35) Turbhe => (7:39) Sanpada => (7:43) Vashi => (7:49) Juinagar => (7:53) Nerul => (7:58) Seawoods => (8:02) CBD Belapur => (8:06) Panvel.");
	        } else if (TrainNo == 9) {
	            System.out.println("Train 9 Travel: Thane (7:19) => Vashi (8:47)");
	            System.out.println("(7:19) Thane => (7:24) Airoli => (7:29) Rabale => (7:35) Ghansoli => (7:40) Koparkhairane => (7:45) Turbhe => (7:51) Sanpada => (8:00) Vashi.");
	        } else if (TrainNo == 10) {
	            System.out.println("Train 10 Travel: CSMT (8:00) => Asangaon (9:52)");
	            System.out.println("(8:00) CSMT => (8:04) Byculla => (8:08) Dadar => (8:14) Kurla => (8:20) Ghatkopar => (8:28) Thane => (8:34) Kalva => (8:40) Diva => (8:46) Dombivli => (8:52) Kalyan => (8:58) Titwala => (9:05) Khadavli => (9:11) Vasind => (9:52) Asangaon.");
	        } else {
	            System.out.println("Invalid Train Number! Please enter a valid number.");
	        }
	    } else if ("express".equalsIgnoreCase(TrainType)) {
	        if (TrainNo == 1) {
	            System.out.println("Express Train 1 Travel: Mumbai (06:00) => Pune (09:57)");
	            System.out.println("(06:00) Mumbai => (07:30) Thane => (08:10) Lonavala => (09:57) Pune.");
	        } else if (TrainNo == 2) {
	            System.out.println("Express Train 2 Travel: Mumbai (08:25) => Pune (11:35)");
	            System.out.println("(08:25) Mumbai => (09:55) Kalyan => (10:45) Lonavala => (11:35) Pune.");
	        } else if (TrainNo == 3) {
	            System.out.println("Express Train 3 Travel: Mumbai (17:10) => Pune (20:25)");
	            System.out.println("(17:10) Mumbai => (18:40) Panvel => (19:45) Lonavala => (20:25) Pune.");
	        } else if (TrainNo == 4) {
	            System.out.println("Express Train 4 Travel: Dadar (12:00) => Gujarat (20:30)");
	            System.out.println("(12:00) Dadar => (13:30) Surat => (17:00) Vadodara => (20:30) Gujarat.");
	        } else if (TrainNo == 5) {
	            System.out.println("Express Train 5 Travel: Dadar (15:00) => Gujarat (23:45)");
	            System.out.println("(15:00) Dadar => (16:40) Vapi => (20:00) Vadodara => (23:45) Gujarat.");
	        } else if (TrainNo == 6) {
	            System.out.println("Express Train 6 Travel: Dadar (22:30) => Gujarat (06:50)");
	            System.out.println("(22:30) Dadar => (01:00) Surat => (04:30) Vadodara => (06:50) Gujarat.");
	        } else if (TrainNo == 7) {
	            System.out.println("Express Train 7 Travel: Mumbai (16:00) => Delhi (10:20)");
	            System.out.println("(16:00) Mumbai => (18:30) Surat => (01:00) Kota => (10:20) Delhi.");
	        }
	        else if (TrainNo == 8) {
	        	System.out.println("Express Train 8 Travel: Mumbai (20:35) => Delhi (14:25)");
                System.out.println("(20:35) Mumbai => (23:15) Vadodara => (06:30) Mathura => (14:25) Delhi.");
	        }
	        else if (TrainNo == 9) {
	        	System.out.println("Express Train 9 Travel: Mumbai (23:05) => Goa (10:45)");
                System.out.println("(23:05) Mumbai => (02:30) Panvel => (07:30) Ratnagiri => (10:45) Goa.");
	        }
	        else if (TrainNo == 10) {
	        	System.out.println("Express Train 10 Travel: Mumbai (07:10) => Goa (18:50)");
                System.out.println("(07:10) Mumbai => (10:00) Khed => (15:00) Madgaon => (18:50) Goa.");
	        }else {
	            System.out.println("Invalid Train Number! Please enter a valid number.");
	        }
	    }
	    
		System.out.println("==========================================================================================================================================================================================================================================================================================================================================================================================================");
	    System.out.println("Do you want to see another train? (Y/N)...");
        char choice = sc.next().charAt(0);
		System.out.println("==========================================================================================================================================================================================================================================================================================================================================================================================================");


        if (choice == 'N' || choice == 'n') {
            Train = false;
            System.out.println("Thank You For Using M-INDICATOR...");
            System.exit(0);
        }
	}
}


	
	private void ExpressTrains() {
	    System.out.println("----------------------------Express Trains---------------------");
	    System.out.println("|-----------|------------|----------------------|-------------|");
	    System.out.println("| Train.No. | Train Type | Source=>Destination  |  Time       |");
	    System.out.println("|---===-----|---====-----|------========--------|---==--------|");
	    System.out.println("|    1      | Express    | Mumbai => Pune       | 06:00=>09:57|");
	    System.out.println("|-----------|------------|----------------------|-------------|");
	    System.out.println("|    2      | Express    | Mumbai => Pune       | 08:25=>11:35|");
	    System.out.println("|-----------|------------|----------------------|-------------|");
	    System.out.println("|    3      | Express    | Mumbai => Pune       | 17:10=>20:25|");
	    System.out.println("|-----------|------------|----------------------|-------------|");
	    System.out.println("|    4      | Express    | Dadar => Gujarat     | 12:00=>20:30|");
	    System.out.println("|-----------|------------|----------------------|-------------|");
	    System.out.println("|    5      | Express    | Dadar => Gujarat     | 15:00=>23:45|");
	    System.out.println("|-----------|------------|----------------------|-------------|");
	    System.out.println("|    6      | Express    | Dadar => Gujarat     | 22:30=>06:50|");
	    System.out.println("|-----------|------------|----------------------|-------------|");
	    System.out.println("|    7      | Express    | Mumbai => Delhi      | 16:00=>10:20|");
	    System.out.println("|-----------|------------|----------------------|-------------|");
	    System.out.println("|    8      | Express    | Mumbai => Delhi      | 20:35=>14:25|");
	    System.out.println("|-----------|------------|----------------------|-------------|");
	    System.out.println("|    9      | Express    | Mumbai => Goa        | 23:05=>10:45|");
	    System.out.println("|-----------|------------|----------------------|-------------|");
	    System.out.println("|    10     | Express    | Mumbai => Goa        | 07:10=>18:50|");
	    System.out.println("|-----------|------------|----------------------|-------------|");
		System.out.println("=======================================================================");

	}

	
	
	private void RegularTrains() {
		System.out.println("----------------------------Regular Trains---------------------");
		System.out.println("|-----------|------------|----------------------|-------------|");
		System.out.println("| Train.No. | Train Type | Source=>Destination  |  Time       |");
		System.out.println("|---===-----|---====-----|------========--------|---==--------|");
		System.out.println("|    1      |    SF      | Asangaon => Thane    | 8.50=>9.57  |");
		System.out.println("|-----------|------------|----------------------|-------------|");
		System.out.println("|    2      |    S       | Thane => CSMT        | 8.14=>9.12  |");
		System.out.println("|-----------|------------|----------------------|-------------|");
		System.out.println("|    3      |    F       | Kalyan => CSMT       | 8.33=>9.37  |");
		System.out.println("|-----------|------------|----------------------|-------------|");
		System.out.println("|    4      |    S       | Dombivali => CSMT    | 8.41=>10.03 |");
		System.out.println("|-----------|------------|----------------------|-------------|");
		System.out.println("|    5      |    S       | CSMT => Titwala      | 9.27=>10.50 |");
		System.out.println("|-----------|------------|----------------------|-------------|");
		System.out.println("|    6      |    SF      | CSMT => Karjat       | 6.53=>8.52  |");
		System.out.println("|-----------|------------|----------------------|-------------|");
		System.out.println("|    7      |    F       | CSMT => Badlapur     | 6.42=>8.08  |");
		System.out.println("|-----------|------------|----------------------|-------------|");
		System.out.println("|    8      |    S       | Thane => Panvel      | 7.14=>8.06  |");
		System.out.println("|-----------|------------|----------------------|-------------|");
		System.out.println("|    9      |    S       | Thane => Vashi       | 7.19=>8.00  |");
		System.out.println("|-----------|------------|----------------------|-------------|");
		System.out.println("|    10     |    SF      | CSMT => Asangaon     | 8.00=>9.52  |");
		System.out.println("|-----------|------------|----------------------|-------------|");
		System.out.println("=======================================================================");

			}
	
	
	public static void main(String[] args) {
		TrainIndicator x = new TrainIndicator();
		x.display();
	}
}

