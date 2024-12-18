package com.jsonToXml;

import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XmlToJson {
    public static void main(String[] args) throws IOException {
        String root = "root";

        // Read the XML file as a string
        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/xmlfile.xml")));

        // Parse it into a JSONObject
        JSONObject jsonObject = XML.toJSONObject(jsonString);

        // Print the formatted JSON
        String formattedJson = jsonObject.toString(4);
        System.out.println(formattedJson);
    }
}
