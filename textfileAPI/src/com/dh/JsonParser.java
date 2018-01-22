package com.dh;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Parse JSON string with help GSON library and return pretty looking string as a result.
 *
 * @author Alexey Kozhevnikov <alexey.merov@google.com>
 * @version 1.0
 * @see JsonParser#parse(String)
 */
public class JsonParser {
    protected static String parse(String s)  {
        String result = null;

        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JSONParser parser = new JSONParser();
            JSONObject jo = (JSONObject) parser.parse(s);
            result = gson.toJson(jo);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
}