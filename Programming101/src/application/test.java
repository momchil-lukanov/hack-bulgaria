package application;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class test {
	private static final String DEPENDENCIES = "dependencies";
	private static ArrayList<String> INSTALLED_MODULES = new ArrayList<>(Arrays.asList("lodash"));
	private static JSONObject localDependenciesJson = null;
	private static JSONObject allDependenciesJson = null;

	public static void main(String[] args) {
	
		/* Р”РµРєР»Р°СЂРёСЂР°РЅРµ РЅР° РґРІР° СЃРёРјРІРѕР»РЅРё РЅРёР·Р° СЃ РёРЅС„РѕСЂРјР°С†РёСЏ РґР°РґРµРЅР° РїРѕ СѓСЃР»РѕРІРёРµ РїРѕРґ С„РѕСЂРјР°С‚Р° РЅР° JSON РѕР±РµРєС‚Рё */
		String allDependenciesJsonString = "{" + "\"backbone\": [\"jQuery\", \"underscore\"],"
				+ "\"jQuery\": [\"queryJ\"]," + "\"underscore\": [\"lodash\"]," + "\"queryJ\": []," + "\"lodash\": []"
				+ "}";

		String localDependenciesJsonString = "{" + "\"projectName\": \"Test0000\"," + "\"dependencies\": [\"backbone\"]"
				+ "}";

		try {
		 /* РџР°СЂСЃРІР°РЅРµ РЅР° JSON РѕР±РµРєС‚ РѕС‚ РёРЅС„РѕСЂРјР°С†РёСЏС‚Р° РїРѕ-РіРѕСЂРµ Р·Р° РїРѕ-Р»РµСЃРЅРѕ РѕР±С…РѕР¶РґР°РЅРµ РЅР° РёРЅС„РѕСЂРјР°С†РёСЏС‚Р° 
		 (РІ СЃР»СѓС‡Р°СЏ РёРЅС„РѕСЂ Рµ РїРѕРґ С„РѕСЂРјР°С‚Р° РЅР° РєР»СЋС‡ Рё СЃС‚РѕР№РЅРѕСЃС‚, РєРѕСЏС‚Рѕ Рµ РјР°СЃРёРІ РѕС‚ СЃС‚СЂРёРЅРіРѕРІРµ) */
			localDependenciesJson = new JSONObject(localDependenciesJsonString);
			allDependenciesJson = new JSONObject(allDependenciesJsonString);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		try {
			/* Р’СЃРёС‡РєРѕ Р·Р°РїРѕС‡РІР° РѕС‚ РѕР±РµРєС‚  localDependenciesJson, РІ РєРѕР№С‚Рѕ Рµ Р·Р°РґР°РґРµРЅР° РіР»Р°РІРЅР°С‚Р° Р·Р°РІРёСЃРёРјРѕСЃС‚, РєРѕСЏС‚Рѕ СЃРµ С†РµР»Рё РґР° СЃРµ РёРЅСЃС‚Р°Р»РёСЂР°.
			РЎСЉРѕС‚РІРµС‚РЅРѕ РІР·РёРјР°РјРµ СЃС‚РѕР№РЅРѕСЃС‚С‚ РЅР° РєР»СЋС‡ "dependencies" (РјР°СЃРёРІ РѕС‚ СЃС‚СЂРёРЅРіРѕРІРµ) */
			JSONArray dependencies = localDependenciesJson.getJSONArray(DEPENDENCIES);

			/* СЂРµРєСѓСЂСЃРёРІРµРЅ РјРµС‚РѕРґ, РєРѕР№С‚Рѕ РїСЂРёРµРјР° РєР°С‚Рѕ РїР°СЂР°РјРµС‚СЉСЂ РјР°СЃРёРІ СЃ РёРјРµРЅР° РЅР° РјРѕРґСѓР»Рё, РєРѕРёС‚Рѕ С‚СЂСЏР±РІР° РґР° СЃРµ РёРЅСЃС‚Р°Р»РёСЂР°С‚ */
			installModules(dependencies);
			System.out.println("All done");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void installModules(JSONArray modules) throws JSONException {
		/* Р¦РёРєСЉР»СЉС‚ РѕР±С…РѕР¶РґР° РјР°СЃРёРІР° СЃ РµР»РµРјРµРЅС‚РёС‚Рµ Р·Р° РёРЅСЃС‚Р°Р»РёСЂР°РЅРµ */
		for (int i = 0; i < modules.length(); i++) {
			/* Р�РјРµ РЅР° РјРѕРґСѓР» Р·Р° РёРЅСЃС‚Р°Р»РёСЂР°РЅРµ */
			String dependency = modules.getString(i);
			printInstalling(dependency);
			
			/* РџРѕ РёРјРµС‚Рѕ РЅР° РјРѕРґСѓР»Р° Р·Р° РёРЅСЃС‚Р°Р»РёСЂР°РЅРµ РїСЂРѕРІРµСЂСЏРІР°РјРµ РІ JSON РѕР±РµРєС‚ allDependenciesJson, РєРѕРё РґСЂСѓРіРё РјРѕРґСѓР»Рё С‚СЂСЏР±РІР° РґР° Р±СЉРґР°С‚Р° РёРЅСЃС‚Р°Р»РёСЂР°РЅРё.
			Р�Р·РІР»РёС‡Р°С‚ СЃРµ РІ РјР°СЃРёРІ localDependencies */
			JSONArray localDependencies = allDependenciesJson.getJSONArray(dependency);

			/* Р’ РїСЉСЂРІРѕС‚Рѕ СѓСЃР»РѕРІРёРµ РїСЂРѕРІРµСЂСЏРІР°РјРµ СЃР»СѓС‡Р°Р№, РІ РєРѕР№С‚Рѕ РёРјР°РјРµ С‚РѕС‡РЅРѕ РµРґРёРЅ РјРѕРґСѓР», РєРѕР№С‚Рѕ С‚СЂСЏР±РІР° РґР° СЃРµ РёРЅСЃС‚Р°Р»РёСЂР°, РЅРѕ СЃСЉС‰Рѕ С‚Р°РєР° РїСЂРёСЃСЉСЃС‚РІР° РІСЉРІ РІРµС‡Рµ РёРЅСЃС‚Р°Р»РёСЂР°РЅРёС‚Рµ.
			РЎС‚Р°РІР° РЅР° РІСЉРїСЂРѕСЃ Р·Р° lodash. РўРѕРІР° СѓСЃР»РѕРІРёРµ Рµ РјР°Р»РєРѕ РёР·Р»РёС€РЅРѕ Рё РјРѕР¶Рµ РґР° СЃРµ РѕРїС‚РёРјРёР·РёСЂР°. */
			if (localDependencies.length() == 1 && INSTALLED_MODULES.contains((localDependencies).get(0).toString())) {
				printRequirements(dependency, localDependencies);

				System.out.println(localDependencies.get(0) + " is already installed");
			} else if (modules.length() == 0 || checkParamsIfAreInstalled(localDependencies)) {
				/* Р’ С‚РѕРІР° СѓСЃР»РѕРІРёРµ РїСЂРѕРІРµСЂСЏРІР°РјРµ, РґР°Р»Рё Р·Р° РјРѕРґСѓР»Р°, РєРѕР№С‚Рѕ РёРЅСЃС‚Р°Р»РёСЂР°РјРµ РёРјР° РґРѕРїСЉР»РЅРёС‚РµР»РµРЅ РјРѕРґСѓР», РѕС‚ РєРѕР№С‚Рѕ Р·Р°РІРёСЃРё Рё РµРІРµРЅС‚СѓР°Р»РЅРѕ РёРЅСЃС‚Р°Р»РёСЂР°РЅ Р»Рё Рµ РІРµС‡Рµ */
				if (!INSTALLED_MODULES.contains(dependency)) {
				/* РђРєРѕ РЅСЏРјР° Р·Р°РІРёСЃРёРјРѕСЃС‚ Рё РЅРµ Рµ РёРЅСЃС‚Р°Р»РёСЂР°РЅ РіРѕ РїСЂРёР±Р°РІСЏРјРµ РєСЉРј СЃРїРёСЃСЉРєР° СЃ РёРЅСЃС‚Р°Р»РёСЂР°РЅРёС‚Рµ РјРѕРґСѓР»Рё - INSTALLED_MODULES */
					INSTALLED_MODULES.add(dependency);
				}
				break;
			} else {
				/* Р’СЉРІ РІСЃРµРєРё РґСЂСѓРі СЃР»СѓС‡Р°Р№, РєРѕР№С‚Рѕ РјРѕР¶Рµ РґР° Рµ, С‡Рµ РёРјР° РїРѕРІРµС‡Рµ РѕС‚ РµРґРЅР° РјРѕРґСѓР»РЅР° Р·Р°РІРёСЃРёРјРѕСЃС‚, РєРѕСЏС‚Рѕ РїСЂРµРґСЃС‚Р°РІР»СЏРІР° РЅРѕРІ РјР°СЃРёРІ РѕС‚ РёРјРµРЅР° РЅР° РјРѕРґСѓР»Рё
				 РїСЂРёРЅС‚РёСЂР°РјРµ РёР·РёСЃРєРІР°РЅРёСЏС‚Р° Рё СЃР»РµРґ С‚РѕРІР° РёР·РІРёРєРІР°РјРµ РЅР°РЅРѕРІРѕ СЃСЉС‰РёСЏ РјРµС‚РѕРґ, РєР°С‚Рѕ РјСѓ РїРѕРґР°РІР°РјРµ РїР°СЂР°РјРµС‚СЉСЂ РІСЉРїСЂРѕСЃРЅРёСЏ РјР°СЃРёРІ СЃ РёРјРµРЅР° РЅР° Р·Р°РІРёСЃРёРјРѕСЃС‚Рё
				  Рё РІСЃРёС‡РєРѕ СЃРµ РїРѕРІС‚Р°СЂСЏ, РґРѕРєР°С‚Рѕ РЅРµ СЃРµ РґРѕСЃС‚РёРіРЅРµ РµРґРЅРѕ РѕС‚ РґРІРµС‚Рµ СѓСЃР»РѕРІРёСЏ РїРѕ-РіРѕСЂРµ */
				printRequirements(dependency, localDependencies);
				installModules(localDependencies);
			}
		}
	}

		/* РњРµС‚РѕРґСЉС‚ РїСЂРѕРІРµСЂСЏРІР° РґР°Р»Рё РїРѕ РїРѕРґР°РґРµРЅ РјР°СЃРёРІ СЃ РёРјРµРЅР° РЅР° РјРѕРґСѓР»Рё, РЅСЏРєРѕР№ РѕС‚ С‚СЏС… Рµ РёРЅСЃС‚Р°Р»РёСЂР°РЅ.
		Р”РѕСЂРё РµРґРёРЅ РґР° РЅРµ Рµ РёРЅСЃС‚Р°Р»РёСЂР°РЅ Рё С†РёРєСЉР»СЉС‚ РїСЂРµРєСЉСЃРІР° - С‚СЉР№ РєР°С‚Рѕ РїСЂРѕРІРµСЂСЏРІР°РјРµ РєР°С‚Рѕ С†СЏР»Рѕ, Р°РєРѕ РµРґРЅРѕ РЅРµС‰Рѕ Р·Р°РІРёСЃРё РѕС‚ С‚СЂРё РЅРµС‰Р°, Р·Р° РґР° СЂР°Р±РѕС‚Рё,
		Р°РєРѕ РґРѕСЂРё РµРґРЅРѕ РѕС‚ С‚СЂРёС‚Рµ РЅРµС‰Р° РіРѕ РЅСЏРјР°, С‚Рѕ РїСЂРёРµРјР°РјРµ, С‡Рµ РїСЉСЂРІРѕС‚Рѕ РЅРµС‰Рѕ РЅРµ СЂР°Р±РѕС‚Рё РёР·РѕР±С‰Рѕ. */
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
	
	/* РњРµС‚РѕРґРёС‚Рµ СЃР°РјРѕ РїСЂРёРЅС‚РёСЂР°С‚ РЅР° РєРѕРЅР·РѕР»Р°С‚Р° */

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
