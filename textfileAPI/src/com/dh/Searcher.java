package com.dh;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;

/**
 * Searcher is general class which contains two methods for text search and extract meta data from file.
 *
 * @author Alexey Kozhevnikov <alexey.merov@google.com>
 * @version 1.0
 * @see Searcher#search(String, int, int)
 * @see Searcher#getMetaData()
 * @see Searcher#getFile()
 * @see QueryServlet
 */
@SuppressWarnings("unchecked")
public class Searcher {

    /**
     * Returns file from resources.
     */
    private static File getFile() {
        return new File(Searcher.class.getResource("/exampleDoc.txt").getFile());
    }

    /**
     *  Basic method which get parameters from QueryServlet.
     *  <p>Returns a JSONArray list in which were added strings after search.
     *  <p>Search comes with three parameters.
     *
     * @param queryText string which represents text to search in file. If parameter is blank or missing - method return
    all text from file.
     * @param queryCharLimit integer which represents max number of chars in text that method return.
     * @param queryStringLength integer which represents max string length. Method return string which.
    doesn’t exceed that number.
     * @see JSONArray
     * @see QueryServlet
     */
    protected static JSONArray search(String queryText, int queryCharLimit, int queryStringLength) {

        JSONArray result = new JSONArray();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(getFile()));
            int totalCharSum = 0;

            if (!queryText.isEmpty()) {
                while (reader.ready()) {
                    String str = reader.readLine();

                    if (queryStringLength > 0 && str.length() > queryStringLength || str.isEmpty())
                        continue;

                    if (str.toLowerCase().contains(queryText)) {
                        totalCharSum += str.length();
                        if (totalCharSum > queryCharLimit)
                            break;
                        result.add(str);
                    }
                }
            } else {
                while (reader.ready()) {
                    String str = reader.readLine();

                    if (queryStringLength > 0 && str.length() > queryStringLength || str.isEmpty())
                        continue;

                    totalCharSum += str.length();
                    if (totalCharSum > queryCharLimit)
                        break;
                    result.add(str);
                }
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     *  Returns a JSONObject map in which were added elements of meta data from file.
     *  <p>Method extracts File Name, File Size, Creation Data.
     *
     * @see JSONObject
     * @see QueryServlet
     */
    protected static JSONObject getMetaData() {

        JSONObject result = new JSONObject();

        Path file = getFile().toPath();
        String fileName = file.getFileName().toString();
        BasicFileAttributes attributes;
        SimpleDateFormat date = new SimpleDateFormat("MMMM d, yyyy 'at' HH:mm aaa");
        int kilobytes;

        try {
            attributes = Files.readAttributes(file, BasicFileAttributes.class);
            if (attributes.size() < 1000)
                kilobytes = 1;
            else
                kilobytes = (int)(attributes.size() / 1024);

            result.put("fileName", fileName);
            result.put("fileSize", kilobytes + "KB");
            result.put("metaData", date.format(attributes.creationTime().toMillis()));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}