package package007;

public class Cave {

String CaveName; String CaveLongitude; String CaveLatitude;

public Cave(String name, String longitude, String latitude) {
	CaveName = name;
	CaveLongitude = longitude;
	CaveLatitude = latitude;
}
public String getName() {
	return CaveName;
}
public String getLongitude() {
	return CaveLongitude;
}
public String getLatitude() {
	return CaveLatitude;
}
public String getGPS() {
	return(CaveLongitude + CaveLatitude);
}


}