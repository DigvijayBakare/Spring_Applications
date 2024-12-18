package com.jsonToXml;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.json.XML;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class JsonToXml {
    public static void main(String[] args) throws Exception {
        String root = "root";

        // Read the JSON file as a string
        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/JsonFile.json")));

        // Parse it into a JSONObject
        JSONObject jsonObject = new JSONObject(jsonString);

        // Convert JSON to XML
        String xml = XML.toString(jsonObject, "root");

        // Pretty-print the XML
        String formattedXml = formatXml(xml);

        // Print the formatted XML
        System.out.println(formattedXml);
    }

    // Method to format XML string
    public static String formatXml(String inputXml) throws Exception {
        // Set up transformer for formatting
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        // Set properties to indent the XML
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

        // Transform the input XML into formatted XML
        StreamSource source = new StreamSource(new StringReader("<root>" + inputXml + "</root>"));
        StringWriter writer = new StringWriter();
        transformer.transform(source, new StreamResult(writer));

        return writer.toString();
    }
}
