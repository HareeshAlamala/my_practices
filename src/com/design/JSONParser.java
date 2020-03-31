package com.design;

import java.util.List;
import java.util.Map;

public class JSONParser {

    public static Class convert(String str, Class klass) {

        /* Validation */

        if (klass.getName() == List.class.getName()) {

        } else if (klass.getName() == Map.class.getName()) {

        }

        return null;
    }

    private static Map<String,Object> convertToMap(String str) {

        return null;

    }

    private static List<Object> convetToList(String str) {

        return null;
    }

}
