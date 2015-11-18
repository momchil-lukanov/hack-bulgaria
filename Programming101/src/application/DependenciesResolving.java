package application;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DependenciesResolving {
	private static final String DEPENDENCIES = "dependencies";
	private static ArrayList<String> INSTALLED_MODULES = new ArrayList<>(Arrays.asList("lodash"));
	private static JSONObject localDependenciesJson = null;
	private static JSONObject allDependenciesJson = null;
	
	
	private static String allDependenciesJsonString = "{" + "\"backbone\": [\"jQuery\", \"underscore\"],"
			+ "\"jQuery\": [\"queryJ\"]," + "\"underscore\": [\"lodash\"]," + "\"queryJ\": []," + "\"lodash\": []"
			+ "}";

	private static String localDependenciesJsonString = "{" + "\"projectName\": \"Test0000\"," + "\"dependencies\": [\"backbone\"]"
			+ "}";
	
	
	public static void main(String[] args) {		
		try {
			/*
			 * Building json objects from string
			 */
			localDependenciesJson = new JSONObject(localDependenciesJsonString);
			allDependenciesJson = new JSONObject(allDependenciesJsonString);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		try {
			JSONArray dependencies = localDependenciesJson.getJSONArray(DEPENDENCIES);
			installModules(dependencies);			

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("All done");
		}	
	}

	private static void installModules(JSONArray modules) throws JSONException {
		for (int i = 0; i < modules.length(); i++) {
			String dependency = modules.getString(i);
			printInstalling(dependency);
			JSONArray localDependencies = allDependenciesJson.getJSONArray(dependency);

			if (localDependencies.length() == 1 && INSTALLED_MODULES.contains((localDependencies).get(0).toString())) {
				printRequirements(dependency, localDependencies);

				System.out.println(localDependencies.get(0) + " is already installed");
			} else if (modules.length() == 0 || checkParamsIfAreInstalled(localDependencies)) {
				if (!INSTALLED_MODULES.contains(dependency)) {
					INSTALLED_MODULES.add(dependency);
				}
				break;
			} else {
				printRequirements(dependency, localDependencies);
				installModules(localDependencies);
			}
		}
	}

	private static boolean checkParamsIfAreInstalled(JSONArray arrays) throws JSONException {
		boolean result = true;
		for (int i = 0; i < arrays.length(); i++) {
			if (!INSTALLED_MODULES.contains(arrays.get(i).toString())) {
				result = false;
				break;
			}
		}

		return result;
	}

	private static void printRequirements(String module, JSONArray params) throws JSONException {
		String result = "In order to install " + module + ", we need ";
		for (int i = 0; i < params.length(); i++) {
			result += params.getString(i) + ",";
		}
		System.out.println(result.substring(0, result.length() - 1));
	}

	private static void printInstalling(String module) {
		System.out.println("Installing " + module);
	}
}