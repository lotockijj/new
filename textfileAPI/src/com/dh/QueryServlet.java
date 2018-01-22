package com.dh;

import org.json.simple.JSONObject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * QueryServlet is general servlet which get parameters from user, send them to Searcher and then render the results in the response.
 *
 * @author Alexey Kozhevnikov <alexey.merov@google.com>
 * @version 1.0
 * @see QueryServlet#doGet(HttpServletRequest, HttpServletResponse)
 * @see JsonParser
 * @see Searcher
 */
@SuppressWarnings("unchecked")
@WebServlet("/result")
public class QueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
     * Parse parameters from html form, check them and send to the Searcher's methods.
     * <p>If parameters are empty, set default values.
     * <p>Result put in JSONObject, send them to JsonParser for pretty view and render the response page.
     *
     * @param request contains parameters from HTML form
     * @param response render page with JSON content type
     * @see Searcher#search(String, int, int)
     * @see Searcher#getMetaData()
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String searchText = "";
            int charLimit = 10000;
            int stringLength = 0;
            boolean metaData = false;

            JSONObject json = new JSONObject();

            String queryText = request.getParameter("q");
            if (!queryText.isEmpty() && queryText.trim().length() > 0)
                searchText = queryText;

            if (!request.getParameter("limit").isEmpty()) {
                int queryLimit = Integer.parseInt(request.getParameter("limit"));
                if (queryLimit != 0)
                    charLimit = queryLimit;
            }
            if (!request.getParameter("length").isEmpty()) {
                int queryLength = Integer.parseInt(request.getParameter("length"));
                if (queryLength != 0)
                    stringLength = queryLength;
            }

            if (request.getParameter("includeMetaData").equals("true"))
                metaData = true;

            json.put("text", Searcher.search(searchText.toLowerCase(), charLimit, stringLength));

            if (metaData) {
                json.put("metaData", Searcher.getMetaData());
            }

            response.setContentType("application/json");
            response.getWriter().write(JsonParser.parse(json.toJSONString()));
        }
        catch (NullPointerException e) {
            response.sendRedirect("/");
        }
    }
}