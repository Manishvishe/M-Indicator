package mindicator;

public class Train {
	private int TrainNo;
	private String TrainType;
	private String TrainName;
	private String Source;
	private String Destination;
	private String[]Stations;
	
	public Train(int TrainNo, String TrainType, String TrainName, String Source, String Destination) {
		this.TrainNo=TrainNo;
		this.TrainType=TrainType;
		this.TrainName=TrainName;
		this.Source=Source;
		this.Destination=Destination;
		this.Stations=Stations;
	}
	
	public int getTrainNo() {
        return TrainNo;
    }
	
	public String[] getStations() {
        return Stations;
    }
	
	public String toString() {
		return TrainNo+"\t"+TrainName+"\t"+Source+"\t"+Destination;
	}
}

