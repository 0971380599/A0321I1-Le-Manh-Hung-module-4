package codegym.service.impl;

import codegym.service.LibraryService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LibraryServiceImpl implements LibraryService {
    public static Map<String, String> libraryMap = new LinkedHashMap<>();
    static {
        libraryMap.put("go","Di");
        libraryMap.put("school", "Truong hoc");
        libraryMap.put("hello", "xin chao");
        libraryMap.put("girl", "con gai");
        libraryMap.put("boy", "con trai");
    }

    @Override
    public String find(String english) {
        for (Map.Entry<String, String> library: libraryMap.entrySet()) {
            if (library.getKey().equals(english)) {
                return library.getValue();
            }
        }
        return null;
    }
}
