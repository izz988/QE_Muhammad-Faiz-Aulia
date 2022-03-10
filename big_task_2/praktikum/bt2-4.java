public class FindPositionOfElement {

	public static void main(String[] args) {
		String[][] arr = {{"a","b","c","d","e"},
               			{"f","g","h","i","j"},
               			{"k","l","m","n","o"},
               			{"p", "q", "r", "s", "t"},
               			{"u","v","w","x","y","z"}};
		String retrieved = arr[4][3] ; //input index yang dicari
		System.out.println("index dari 4,3 adalah " + retrieved);
	}
}