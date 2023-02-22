import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class Parser {
	private static JSONArray jsonArray;
	
	public static List<EntityModel> serialize(String request) {
		List<EntityModel> arrayOfModels = new ArrayList<EntityModel>();
		jsonArray = new JSONArray(request);
		for(Object obj : jsonArray) {
			EntityModel model = new EntityModel();
			model.setUserId(((JSONObject)obj).getInt("userId"));
			model.setId(((JSONObject)obj).getInt("id"));
			model.setTitle(((JSONObject) obj).getString("title"));
			model.setBody(((JSONObject) obj).getString("body"));
			arrayOfModels.add(model);
		}
		return arrayOfModels;
	}
	
	public static void printList(List<EntityModel> result) {
		for(EntityModel model: result) {
			System.out.println(model.getUserId() 
			+ " " + model.getId()); 
			System.out.println(model.getTitle()); 
			System.out.println(model.getBody());
		}
	}
}