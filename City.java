
public class City {

	private String cityName;
	private int cityIndex;
	private static int[][] distanceArr;
	private static City[] allCities;

	public City(String name) {
		cityName = name;

		if(allCities == null) {
			cityIndex = 0;
			allCities = new City[1]; 
			allCities[0] = this;
			distanceArr = new int[1][1];
			distanceArr[0][0] = 0;

		} else {
			cityIndex = allCities.length;
			City[] newAllCities = new City[allCities.length + 1];

			for(int i = 0; i < allCities.length; i++) {
				newAllCities[i] = allCities[i];
			}

			newAllCities[allCities.length] = this;
			allCities = newAllCities;

			int[][] newAllDistances = new int[distanceArr.length + 1][distanceArr.length + 1];

			for(int i = 0; i < distanceArr.length; i++) {

				for(int j = 0; j < distanceArr.length; j++) {
					newAllDistances[i][j] = distanceArr[i][j];
				}
			}

			for(int i = 0; i <= distanceArr.length; i++) {
				newAllDistances[i][distanceArr.length] = -1;
				newAllDistances[distanceArr.length][i] = -1;
			}

			newAllDistances[distanceArr.length][distanceArr.length] = 0;

			distanceArr = newAllDistances;

		}
	}
}
